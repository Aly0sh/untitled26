package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
	    try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("text.txt"));
            System.out.print("Enter text: ");
            bw.write(in.nextLine());
            bw.close();
            size();
        } catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void size() throws Exception {
        File file=new File("text.txt");
        if (file.length()>100) {
            throw new Exception("Файл слишком большой");
        }
    }
}
