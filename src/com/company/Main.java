package com.company;

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
        // Randomizer int rnd = new Random().nextInt(names.length);

        System.out.println("\n");
        System.out.println(names[24]);

        System.out.println("If this was your selected name, please enter (Yes) if it's not, please enter (No)");
        String answer = nameHolder.next().toLowerCase();
        while (answer.equals("yes")) {
            System.out.println("Thanks for playing!");
            break;
        }

        System.out.println("Is your name higher or lower on the list?");
        answer = nameHolder.next().toLowerCase();


        do {
            Collections.reverse(Arrays.asList(names));
            int collection = names.length / 2;
            int rnd = new Random().nextInt(collection);
            System.out.println(names[rnd]);
            System.out.println("Is this correct? (Y) or (N)");
            String finalAnswer = nameHolder.next().toLowerCase();
            if (finalAnswer.equals("y")) {
                break;
            }
        } while (answer.equals("higher"));

        do {
            int collection = names.length / 2;
            int rnd = new Random().nextInt(collection);
            System.out.println(names[rnd]);
            System.out.println("Is this correct? (Y) or (N)");
            String finalAnswer = nameHolder.next().toLowerCase();
            if (finalAnswer.equals("y")) {
                break;
            }
        } while (answer.equals("lower"));


    }

    }
