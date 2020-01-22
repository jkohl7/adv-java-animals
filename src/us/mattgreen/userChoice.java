package us.mattgreen;

import java.util.Scanner;

public class userChoice {
    public static void menu() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of animal do you want to create?");
        System.out.println("1: Dog");
        System.out.println("2: Cat");
        System.out.println("3: Person");
        int num = Integer.parseInt(keyboard.nextLine());
//        switch(num){
//            case 1:
//                break;
//            case 2:
//                break;
//            case3:
//                break;
//
//        }


    }
}
