package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public FileReader(String fileName) {
        this.fileName = fileName;
        this.createPath();
    }

    private String  fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        this.createPath();
    }
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    private void createPath() {
        this.filePath = System.getProperty("user.dir") + "/input_files/" + this.fileName;
    }

    private ArrayList<Vertex> instanceList;

    public ArrayList<Vertex> getInstanceList() {
        return instanceList;
    }

    public void importInstance() {
        File importFile = new File(this.filePath);
        Scanner scanner = null;
        try {
            scanner = new Scanner(importFile);
            System.out.println("file successfully obtained");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.instanceList = new ArrayList<Vertex>();
        int vertexNumber = scanner.nextInt();
        for (int i = 0; i < vertexNumber; i++) {
            this.instanceList.add(new Vertex());
            this.instanceList.get(i).id = scanner.nextInt() - 1;
            this.instanceList.get(i).setPos(scanner.nextInt(), scanner.nextInt());
        }
    }
}