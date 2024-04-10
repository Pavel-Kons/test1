package org.example;

public class Main {

    static int parseRomanNumber(String romanNumber) throws Exception {
        System.out.println("myMethodStarsHere");
        switch (romanNumber) {
            case "I": {
                return 1;
            }
            case "II": {
                return 2;
            }
            case "III": {
                return 3;
            }
            case "IV": {
                return 4;
            }
            case "V": {
                return 5;
            }
            case "VI": {
                return 6;
            }
            case "VII": {
                return 7;
            }
            case "VIII": {
                return 8;
            }
            case "IX": {
                return 9;
            }
            case "X": {
                return 10;
            }
            default: {
                throw new Exception("Not a Roman number");
            }
        }
    }

    public static void main(String[] args) throws Exception {
//        System.out.print("Input: ");
//        Scanner stringScan = new Scanner(System.in);
//        String inputString = stringScan.nextLine();
        String stringScan = "IX / III";

        String[] splitWordsVariable = stringScan.split(" ");
        parseRomanNumber(splitWordsVariable[0]);
        parseRomanNumber(splitWordsVariable[2]);

        int number1 = 0;
        char operator = 0;
        int number2 = 0;

        int tempNumber = parseRomanNumber("X");
        System.out.println(tempNumber);


//        - - - - - - - - ARABIC - - - -- -

//        try {
//            number1 = Integer.parseInt(splitWordsVariable[0]);
//            System.out.println("Converted integer: " + number1);
//            operator = splitWordsVariable[1].charAt(0);
//            number2 = Integer.parseInt(splitWordsVariable[2]);
//            System.out.println("Converted integer: " + number2);
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid integer input");
//        }
//
//        switch (operator) {
//            case '+': {
//                System.out.println(number1 + number2);
//                break;
//            }
//            case '-': {
//                System.out.println(number1 - number2);
//                break;
//            }
//            case '/': {
//                System.out.println(number1 / number2);
//                break;
//            }
//            case '*': {
//                System.out.println(number1 * number2);
//                break;
//            }
//            default: {
//                throw new Exception("Incorrect operator");
//            }
//        }
    }
}