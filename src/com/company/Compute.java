package com.company;

import java.util.ArrayList;

public class Compute {
    public double dist(int[] first, int[] second) {
        return Math.sqrt(Math.pow(second[0] - first[0], 2) + Math.pow(second[1] - first[1], 2));
    }

    public int minDistVertex(int[] pos, ArrayList<Vertex> vertices) {
        double minDist = this.dist(pos, vertices.get(0).getPos());
        int minIndex = 0;
        for (int i = 0; i < vertices.size(); i++) {
            if (this.dist(pos, vertices.get(i).getPos()) < minDist) {
                minDist = this.dist(pos, vertices.get(i).getPos());
                minIndex = i;
            }
        }

        return minIndex;
    }
}

