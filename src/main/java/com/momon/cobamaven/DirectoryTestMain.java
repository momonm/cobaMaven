/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.momon.cobamaven;
import java.io.File;
import java.util.Arrays;
/**
 *
 * @author User //list seluruh isi file dalam sebuah folder
 */
public class DirectoryTestMain {
 
   public static void main(String a[]){
        File file = new File("C:/Users/Momon/Documents");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }
}
