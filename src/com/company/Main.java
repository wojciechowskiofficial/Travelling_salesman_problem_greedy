package com.company;

public class Main {

    public static void main(String[] args) {
        FileReader test = new FileReader("test_instance.txt");
        test.importInstance();
        System.out.println(test.getFilePath());
        test.setFileName("nowy");
        System.out.println(test.getFilePath());
    }
}
