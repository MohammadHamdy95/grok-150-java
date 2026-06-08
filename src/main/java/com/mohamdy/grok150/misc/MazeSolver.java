package com.mohamdy.grok150.misc;

/**
 * A grid maze solved with depth-first <strong>backtracking</strong>.
 *
 * <p>The maze is a {@code char[][]} where:
 * <ul>
 *   <li>{@code '#'} &mdash; wall (impassable),</li>
 *   <li>{@code '.'} &mdash; open cell,</li>
 *   <li>{@code 'S'} &mdash; start,</li>
 *   <li>{@code 'E'} &mdash; end / goal.</li>
 * </ul>
 *
 * <p>While exploring it narrates its decisions to {@code System.out}: it prints when it
 * <em>chooses</em> to step onto a neighbouring cell, when it <em>backtracks</em> out of a
 * dead end, and a final message when it <em>reaches the end</em>. When solved, the cells on
 * the successful route are marked with {@code '*'} (the start stays {@code 'S'}, the end
 * stays {@code 'E'}); abandoned cells are restored to {@code '.'}.
 */
public class MazeSolver {

    /** Movement order tried at every cell: down, right, up, left. */
    private static final int[][] DIRECTIONS = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private static final String[] DIRECTION_NAMES = {"down", "right", "up", "left"};

    private final char[][] maze;
    private final int rows;
    private final int cols;
    private final boolean[][] visited;

    public MazeSolver(char[][] maze) {
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            throw new IllegalArgumentException("Maze must be a non-empty grid.");
        }
        this.maze = maze;
        this.rows = maze.length;
        this.cols = maze[0].length;
        this.visited = new boolean[rows][cols];
    }

    /**
     * Attempts to walk from {@code 'S'} to {@code 'E'} using backtracking.
     *
     * @return {@code true} if a path exists (and the route is now marked with {@code '*'}),
     *         {@code false} otherwise.
     */
    public boolean solve() {
        int[] start = locate('S');
        if (start == null) {
            throw new IllegalStateException("Maze has no start ('S').");
        }
        if (locate('E') == null) {
            throw new IllegalStateException("Maze has no end ('E').");
        }
        System.out.println("Starting at (" + start[0] + ", " + start[1] + ")");
        boolean solved = backtrack(start[0], start[1]);
        System.out.println(solved ? "Maze solved!" : "No path to the end exists.");
        return solved;
    }

    /** Recursive DFS with backtracking from cell ({@code r}, {@code c}). */
    private boolean backtrack(int r, int c) {
        if (maze[r][c] == 'E') {
            System.out.println("Reached the end at (" + r + ", " + c + ")!");
            return true;
        }

        // Commit to this cell as part of the current path.
        visited[r][c] = true;
        markPath(r, c);

        for (int d = 0; d < DIRECTIONS.length; d++) {
            int nr = r + DIRECTIONS[d][0];
            int nc = c + DIRECTIONS[d][1];
            if (canVisit(nr, nc)) {
                System.out.println("Choosing path " + DIRECTION_NAMES[d]
                        + " from (" + r + ", " + c + ") to (" + nr + ", " + nc + ")");
                if (backtrack(nr, nc)) {
                    return true;
                }
            }
        }

        // Dead end: undo the move so other branches can reuse this cell.
        unmarkPath(r, c);
        visited[r][c] = false;
        System.out.println("Backtracking from (" + r + ", " + c + ")");
        return false;
    }

    /** A cell is reachable if it is in bounds, not a wall, and not already on the path. */
    private boolean canVisit(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols
                && maze[r][c] != '#' && !visited[r][c];
    }

    private void markPath(int r, int c) {
        if (maze[r][c] == '.') {
            maze[r][c] = '*';
        }
    }

    private void unmarkPath(int r, int c) {
        if (maze[r][c] == '*') {
            maze[r][c] = '.';
        }
    }

    private int[] locate(char target) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (maze[r][c] == target) {
                    return new int[]{r, c};
                }
            }
        }
        return null;
    }

    /** Prints the current state of the maze grid. */
    public void print() {
        StringBuilder sb = new StringBuilder();
        for (char[] row : maze) {
            sb.append(new String(row)).append(System.lineSeparator());
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        char[][] maze = {
            "S....".toCharArray(),
            "###.#".toCharArray(),
            ".....".toCharArray(),
            ".####".toCharArray(),
            "....E".toCharArray(),
        };

        MazeSolver solver = new MazeSolver(maze);
        System.out.println("Maze:");
        solver.print();
        System.out.println();

        solver.solve();

        System.out.println();
        System.out.println("Solved maze ('*' marks the path):");
        solver.print();
    }
}
