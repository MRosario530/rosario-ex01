/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
import java.util.*;

public class Solution01 {
    /*
        print: What is your name?
        'userName' = read string from user
        concatenate 'userName' into 'hello'
            'hello' = Hello, 'userName', nice to meet you!
        print: 'hello'

    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = input.nextLine();
        String hello = "Hello, " + userName + ", nice to meet you!";
        System.out.println(hello);
    }

}

