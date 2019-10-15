package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class File_reader {
    public File_reader(String filePath) {
        this.file_path = file_path;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public void import_instance() {
        File import_file = new File(this.file_path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(import_file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.instance_list = new ArrayList<Vertex>();
        int vertexNumber = scanner.nextInt();
        for (int i = 0; i < vertexNumber; i++) {
            this.instance_list.add(new Vertex());
            this.instance_list.get(i).id = scanner.nextInt() - 1;
            this.instance_list.get(i).set_pos(scanner.nextInt(), scanner.nextInt());
        }
    }

    private  String file_path;

    public ArrayList<Vertex> getInstance_list() {
        return instance_list;
    }

    private ArrayList<Vertex> instance_list;

    public int getInstanceSize() {
        if (this.instance_list.isEmpty()) {
            System.out.println("instance list is empty");
            return -1;
        }
        else {
            return this.instance_list.size();
        }
    }
}
