/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */
import java.util.Scanner;
public class EX04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String noun;
        System.out.println("enter a noun");
        noun = input.nextLine();

        String verb;
        System.out.println("enter a verb");
        verb = input.nextLine();

        String adjective;
        System.out.println("enter a adjective");
        adjective = input.nextLine();

        String adverb;
        System.out.println("enter a adverb");
        adverb = input.nextLine();

        System.out.println("When " +noun+ " crossed the ocean, it was a scary trip as he was " +verb+ " this action " +
                "goes against the laws of physics as he is " +adjective+ " the consequences were dire but he was "
        +adjective+ "");

    }
}
