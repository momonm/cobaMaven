/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.momon.cobamaven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.lucene.analysis.Tokenizer;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;



/**
 *
 * @author Momon // list seluruh data dalam folder path + konten
 */
public class Preprocessing {
    
    
public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
       
        try {
            File folder = new File(
                    "C:/Users/Momon/Documents/NetBeansProjects/cobaMaven/read");
            
            if (folder.isDirectory()) {
                for (File file : folder.listFiles()) {
                   
                    System.out.println("Path : " + file.getPath());
                     
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    String line = null;
                    int lineCount = 0;
                   
                    while (null != (line = bufferedReader.readLine())) {
                        lineCount++;
                        if (3 != lineCount) {
                            
                            System.out.println(line);
                            
                      
                            
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
 

}

    