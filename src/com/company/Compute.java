package com.company;

public class Compute {
    public double dist(int [] first, int [] second) {
        return Math.sqrt(Math.pow(second[0] - first[0], 2) + Math.pow(second[1] - first[1], 2));
    }
}
