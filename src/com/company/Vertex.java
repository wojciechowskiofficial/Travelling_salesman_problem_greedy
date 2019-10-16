package com.company;

public class Vertex {

    public Vertex() {
        this.xPos = -1;
        this.yPos = -1;
    }

    public int id;

    public int [] getPos() {
        return new int [] {this.xPos, this.yPos};
    }

    public void setPos(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    public void displayPos() {
        System.out.print(this.xPos + " " + this.yPos);
    }

    private int xPos, yPos;
}
