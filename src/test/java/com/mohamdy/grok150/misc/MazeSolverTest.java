package com.mohamdy.grok150.misc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MazeSolverTest {

    @Test void solvesOpenMaze() {
        char[][] maze = {
            "S.".toCharArray(),
            ".E".toCharArray(),
        };
        assertTrue(new MazeSolver(maze).solve());
    }

    @Test void detectsUnsolvableMaze() {
        char[][] maze = {
            "S#".toCharArray(),
            "#E".toCharArray(),
        };
        assertFalse(new MazeSolver(maze).solve());
    }

    @Test void marksThePathWithStars() {
        char[][] maze = {
            "S..".toCharArray(),
            "##.".toCharArray(),
            "..E".toCharArray(),
        };
        MazeSolver solver = new MazeSolver(maze);
        assertTrue(solver.solve());
        assertEquals('S', maze[0][0]);
        assertEquals('E', maze[2][2]);
        assertEquals('*', maze[0][1]); // route runs along the top then down the right column
        assertEquals('*', maze[0][2]);
        assertEquals('*', maze[1][2]);
    }

    @Test void backtracksOutOfDeadEndsButStillSolves() {
        // Down-first leads into the (1,0) dead end, which must be abandoned before the
        // solver finds the route along the top row and down the right column.
        char[][] maze = {
            "S..".toCharArray(),
            ".#.".toCharArray(),
            "#.E".toCharArray(),
        };
        MazeSolver solver = new MazeSolver(maze);
        assertTrue(solver.solve());
        assertEquals('.', maze[1][0]); // dead-end cell was restored, not left on the path
    }

    @Test void missingEndThrows() {
        char[][] noEnd = {
            "S.".toCharArray(),
            "..".toCharArray(),
        };
        assertThrows(IllegalStateException.class, () -> new MazeSolver(noEnd).solve());
    }

    @Test void rejectsEmptyGrid() {
        assertThrows(IllegalArgumentException.class, () -> new MazeSolver(new char[][]{}));
    }
}
