package main.java;

import java.util.Scanner;

public class WhatChocolate {
    public static void main(String[] args) {

        //prompting user for input on their favourite chocolate
        System.out.println("what is your favourite chocolate?");

        //collect user input
        Scanner reader = new Scanner(System.in);
        String favChoc = reader.nextLine();

        System.out.println("Your favourite chocolate is " + favChoc);

        // if chocolate is bounty, print 'Gross'
        // otherwise print 'yum'

        if(favChoc.equals("Bounty")) {
            System.out.println("Gross");
        } else {
            System.out.println("Yum");
        }
    }
}
