/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.momon.cobamaven;

import java.io.File;

/**
 *
 * @author User // read path file from multiple folder
 */


public class readFile {
    
    public static void main (String[]args){
        readFile tc = new readFile();
        File MainDirectory = new File( "C:/Users/Momon/Documents/NetBeansProjects/cobaMaven/read");
        tc.readDir(MainDirectory);
    }
    
    private void readFile(File f){
        System.out.println(f.getPath());
    }
    
    private void readDir(File f){
        File subdir[]=f.listFiles();
        for (File f_arr : subdir){
            
            if(f_arr.isFile()){
                this.readFile(f_arr);
            }if(f_arr.isDirectory()){
                this.readDir(f_arr);
            }
        }
    }
}


