//Programmer: Austin Parker
//Date: June 4, 2020
//Assignment: Ch4/ Phone Keypads/ PE 4.15
//Purpose: Shows user which number holds letter of alphabet on telephone keypads

import java.util.Scanner;

public class phoneKeypad {

    //scanner variable to take input from user
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        //reads input from user
        System.out.println("Enter char to print out the corresponding number: ");
        char ch = input.next().charAt(0);

        //sends user input to printNumber
        //if user input is invalid print error message
        if(printNumber(ch)!=-1)
            System.out.println("Corresponding number is "+printNumber(ch));
        else
            System.out.println(ch+ " is an invalid input");
    }

    public static int printNumber(char ch){
        //if statement to display number based on input letter
        //returns to printNumber which displays to user
        if(ch=='a'||ch=='A'||ch=='b'||ch=='B'||ch=='C'||ch=='c')
            return 2;
        else if(ch=='F'||ch=='f'||ch=='E'||ch=='e'||ch=='D'||ch=='d')
            return 3;
        else if(ch=='I'||ch=='i'||ch=='H'||ch=='h'||ch=='G'||ch=='g')
            return 4;
        else if(ch=='L'||ch=='l'||ch=='K'||ch=='k'||ch=='J'||ch=='j')
            return 5;
        else if(ch=='o'||ch=='O'||ch=='n'||ch=='N'||ch=='M'||ch=='m')
            return 6;
        else if(ch=='S'||ch=='s'||ch=='R'||ch=='r'||ch=='Q'||ch=='q'||ch=='P'||ch=='p')
            return 7;
        else if(ch=='t'||ch=='u'||ch=='v'||ch=='T'||ch=='U'||ch=='V')
            return 8;
        else if(ch=='w'||ch=='x'||ch=='y'||ch=='z'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z')
            return 9;
        else
            return -1;

    }

}
