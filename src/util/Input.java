package util;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Input {
    public String userInput;

    private Scanner scanner  = new Scanner(System.in);
    String getString(){
        System.out.println("Type a String: ");
        userInput = scanner.nextLine();
        return userInput;
    }
    boolean yesNo() {
        System.out.println("[y/n?]");
        userInput = scanner.nextLine();
        if (userInput.startsWith("y")) {
            return true;
        } return false;
    }

    int getInt(int min, int max){
        System.out.printf("Enter a number between %s and %s", min, max);
        userInput = scanner.nextLine();
        int parsedInput = Integer.parseInt(userInput);
        if(parsedInput < min || parsedInput > max){
            System.out.println("Invalid! Out of min max range");
            getInt(min, max);
        }
            return parsedInput;

    }
//        int getInt(){
//
//    }

    double getDouble(double min, double max){

        System.out.printf("Enter a number between %s and %s", min, max);
        userInput = scanner.nextLine();
        double parsedDoubleInput = Double.parseDouble(userInput);
        if(parsedDoubleInput < min || parsedDoubleInput > max){
            System.out.println("Invalid! Out of min max range");
            return getDouble(min, max);
        }
            return parsedDoubleInput;


    }
}
//    double getDouble(){
//
//    }
//}

