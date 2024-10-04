package org.fenci.greeting;

import org.fenci.greeting.poc.POCData;

import java.io.File;
import java.util.HashMap;
import java.util.Objects;

public class Main implements POCData {

    public static HashMap<String, byte[]> POC = new HashMap<>();

    public static void main(String[] args) {
        File directory = new File(POCData.directory);
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            System.out.println(file.getName());
        }
    }
}
