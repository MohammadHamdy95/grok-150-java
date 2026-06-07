package com.mohamdy.blind75.graphs;

import java.util.ArrayList;
import java.util.List;

// Standard LeetCode graph node for Clone Graph (provided scaffolding, not a solution).
public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}
