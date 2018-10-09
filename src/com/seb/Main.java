package com.seb;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = new String[10];
        String name = "";

        for(int i = 0; i < 10; i++){
            System.out.println("Enter the word: ");
            name = sc.nextLine();
            if(name.equalsIgnoreCase("history")){
                for(int j = 0; j < i; j++){
                    System.out.println(word[j]);
                }
            }else{
                word[i] = name;
            }
        }
        }
}
