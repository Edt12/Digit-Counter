/*

Write a program that prints how many digits a number has (hint: numbers < 10 have 1);
        numbers < 100 have 2 and so on). Do it for numbers up to 1000 000 (inclusive)

*/


import java.util.Scanner;

public class Main {
    static final String ONE_DIGIT = "1 Digit";
    static final String TWO_DIGITS = "2 Digits";
    static final String THREE_DIGITS = "3 Digits";
    static final String FOUR_DIGITS = "4 Digits";
    static final String FIVE_DIGITS = "5 Digits";
    static final String SIX_DIGITS = "6 Digits";
    static final String WELCOME_MESSAGE = "Please enter your number to find out how many digits it has";
    static final int TEN = 10;
    static final int ONE_HUNDRED = 100;
    static final int ONE_THOUSAND = 1000;
    static final int TEN_THOUSAND = 10000;
    static final int ONE_HUNDRED_THOUSAND = 100000;
    static final int ONE_MILLION = 1000000;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //Asking for Number to be inputted and receiving it
        System.out.println(WELCOME_MESSAGE);
        int inputtedNumber = userInput.nextInt();

        //Working out amount of digits it has
        if (inputtedNumber < 0) {
            System.out.println("Error Number too low");
        } else if (inputtedNumber <= TEN) {
            System.out.println(ONE_DIGIT);
        } else if (inputtedNumber <= ONE_HUNDRED) {
            System.out.println(TWO_DIGITS);

        } else if (inputtedNumber <= ONE_THOUSAND) {
            System.out.println(THREE_DIGITS);

        } else if (inputtedNumber <= TEN_THOUSAND) {
            System.out.println(FOUR_DIGITS);

        } else if (inputtedNumber <= ONE_HUNDRED_THOUSAND) {
            System.out.println(FIVE_DIGITS);

        } else if (inputtedNumber <= ONE_MILLION) {
            System.out.println(SIX_DIGITS);

        } else {
            System.out.println("Number too big");

        }
    }
}


