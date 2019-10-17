package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileReader skan = new FileReader("test_instance.txt");
        skan.importInstance();
        ArrayList<Vertex> lista = skan.getInstanceList();
        Vertex v1, v2;
        v1 = lista.get(0);
        v2 = lista.get(1);
        Compute computer = new Compute();
        System.out.println(computer.dist(new int [] {1, 1}, new int [] {2, 2}));
    }
}
