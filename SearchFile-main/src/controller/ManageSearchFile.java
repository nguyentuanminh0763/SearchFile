/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import common.Algorithm;
import common.Library;
import java.util.Scanner;

/**
 *
 * @author CongThanh
 */
public class ManageSearchFile extends Menu<String> {

    static Scanner sc = new Scanner(System.in);

    static String[] mc = {"Count Word In File", "Find File By Word", "Exit"};

    protected Library library;
    protected Algorithm al;
    String path;
    String word;

    public ManageSearchFile() {
        super("============ Search Program =========", mc);
        library = new Library();
        al = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.print("Enter Path: ");
                path = sc.nextLine();
                System.out.print("Enter Word: ");
                word = sc.nextLine();
                int count = al.countWordInFile(path, word);
                System.out.println("Count: " + count);
                break;
            case 2:
                System.out.print("Enter Path: ");
                path = sc.nextLine();
                System.out.print("Enter Word: ");
                word = sc.nextLine();
                al.getFileNameContainsWordInDirectory(path, word);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }

}
