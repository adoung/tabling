package com.test.Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class fileupdate {
    public static void main(String[] args) throws Exception{
        try {

            BufferedReader reader = new BufferedReader(new FileReader(".//dat/test.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(""));
        }
        catch(Exception e) {

        }
    }
}
