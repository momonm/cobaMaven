/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.momon.cobamaven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;
/**
 *
 * @author Momon // baca path + konten + file dalam folder 
 */
public class readLineByLine {
    public static void main (String[] args) throws Exception{

          readLineByLine rf = new readLineByLine();
          File MainDirectory = new File("C:/Users/Momon/Documents/NetBeansProjects/cobaMaven/read");
          rf.readDir(MainDirectory);

        }

        private void readDir(File f) throws Exception{

            Set<String>set = new TreeSet<String>();
            File []subdir = f.listFiles();
            int count = 0;
            
            String dir = f.getName();
            
             String line;
            
            for (File fi : subdir){

                if(fi.isFile()){

                    BufferedReader br = new BufferedReader(new FileReader(fi));
                    System.out.println("Path : " + fi.getPath());
                    //System.out.println(fi.getName());
                    
                    
                    while((line = br.readLine())!= null){
                         
   
                         System.out.println(line);
                        
                                         
                    }
                    br.close();
                    count++;
                   System.out.println(" ----------------");
                 
                   
                    
                } 
                  
                
                if(subdir.length-(count) == 0){
                   
                    set = new TreeSet<String>();
                    System.out.println("end of directory"+dir);
                    
                }
                if(fi.isDirectory()){
                    //System.out.println("inside if check directory");
                    readDir(fi);
                    System.out.println("reading next directory");


                }
            }
        }
}
