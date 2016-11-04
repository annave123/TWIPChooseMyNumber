package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner nameHolder = new Scanner(System.in);
        String names[] = {"Aaron", "Aiden", "Alex", "Alexis", "Amy", "Andrew", "Anthony", "Ava", "Ben", "Bob", "Caden", "Carson", "Chris", "Christian", "Donald", "Elizabeth", "Emma", "Ethan", "Glen", "Isabella", "Jack", "Jackson", "James", "Jeff", "Joey", "John", "Jordan", "Josh", "Liam", "Lilia", "Lilly", "Lucas", "Martain", "Mason", "Matt", "Max", "Mia", "Mike", "Noah", "Olivia", "Robert", "Sean", "Sophia", "Stephan", "Steven", "Tyler", "William", "Zach", "Zoe", "Zyana"};
        System.out.println("Mentally select a name from the list above, and remember it... I will begin to guess which name you've picked");


        System.out.println("\n");
        System.out.println(names[24]);

        System.out.println("Is this your name?, is yes, enter (Yes), if no, enter (No)");
        String yesOrNo = nameHolder.next().toLowerCase();




        System.out.println("Is your name lower on the list (closer to A), or lower on the list, (closer to Z)");
        String answer = nameHolder.next().toLowerCase();

        do {if(answer.equals("lower")) {

            Arrays.sort(names);
            int line = names.length;
            int rnd = new Random().nextInt(names.length / 2);
            System.out.println(names[rnd]);
            System.out.println("\nIs this your name?, is yes, enter (Yes), if no, enter (No)");
            yesOrNo = nameHolder.next().toLowerCase();
            System.out.println("Is your name lower on the list (closer to A), or lower on the list, (closer to Z)");
            answer = nameHolder.next().toLowerCase();

        }    else if(answer.equals("higher")){
            Collections.reverse(Arrays.asList(names));
            int line = names.length;
            int rnd = new Random().nextInt(names.length / 2);
            System.out.println(names[rnd]);
            System.out.println("\nIs this your name?, is yes, enter (Yes), if no, enter (No)");
            yesOrNo = nameHolder.next().toLowerCase();
            System.out.println("Is your name lower on the list (closer to A), or lower on the list, (closer to Z)");
            answer = nameHolder.next().toLowerCase();

                }

            }while (yesOrNo.equals("no"));


        if (yesOrNo.equals("yes")) {
            System.out.println("Thanks for playing");
            return;
        }

        }



    }






