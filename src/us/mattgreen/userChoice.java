package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class userChoice {
    public void menu(ArrayList Zoo) {
        boolean correct;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of animal do you want to create?");
        System.out.println("1: Dog");
        System.out.println("2: Cat");
        System.out.println("3: Teacher");
        int num = Integer.parseInt(keyboard.nextLine());
        if (num > 3 || num < 1) {
            System.out.println("Please select a number that corresponds with an animal.");
            System.out.println("1: Dog");
            System.out.println("2: Cat");
            System.out.println("3: Teacher");
            num = Integer.parseInt(keyboard.nextLine());
        }
        switch (num) {
            case 1:
                boolean friendly;
                String dogName;

                do {
                    correct = true;
                    System.out.println("What is the dog's name?");
                    dogName = keyboard.nextLine();
                    try {
                        InputTypeVerifier.name(dogName);
                    } catch (noInputException e) {
                        correct = false;
                        System.out.println("No input was entered, please enter some data.");
                    } catch (incorrectException e) {
                        correct = false;
                        System.out.println("Incorrect data was entered, please enter correct data.");
                    }
                } while (!correct);

                do {
                    correct = true;
                    System.out.println("Is the dog friendly? (Y/N)");
                    String reply = keyboard.nextLine();
                    try {
                        InputTypeVerifier.yesNo(reply);
                    } catch (noInputException e) {
                        correct = false;
                        System.out.println("No input was entered, please enter some data.");
                    } catch (incorrectException e) {
                        correct = false;
                        System.out.println("Incorrect data was entered, please enter correct data.");
                    }
                    if (reply.equals("Y")) {
                        friendly = true;
                    } else {
                        friendly = false;
                    }
                } while (!correct);
                Dog dog = new Dog(friendly, dogName);
                Zoo.add(dog);
                break;
            case 2:
                int killed = -1;
                String catName;
                do{
                correct = true;
                System.out.println("What is the cat's name?");
                catName = keyboard.nextLine();
                try {
                    InputTypeVerifier.name(catName);
                } catch (noInputException e) {
                    correct = false;
                    System.out.println("No input was entered, please enter some data.");
                } catch (incorrectException e) {
                    correct = false;
                    System.out.println("Incorrect data was entered, please enter correct data.");
                }
            }while (!correct) ;
            do {
                correct = true;
                System.out.println("How many mice has your cat killed?");
                String mice = keyboard.nextLine();
                try{
                   killed = InputTypeVerifier.numbers(mice);
                }catch (noInputException e) {
                    correct = false;
                    System.out.println("No input was entered, please enter some data.");
                } catch (incorrectException e) {
                    correct = false;
                    System.out.println("Incorrect data was entered, please enter correct data.");
                }
            }while (!correct);

                Cat cat = new Cat(killed, catName);
             Zoo.add(cat);
             break;
             case 3:
             String teacherName;
             int age;
             do {
                 correct = true;
                 System.out.println("What is the teacher's name?");
                 teacherName = keyboard.next();
                 try {
                     InputTypeVerifier.name(teacherName);
                 } catch (noInputException e) {
                     correct = false;
                     System.out.println("No input was entered, please enter some data.");
                 } catch (incorrectException e) {
                     correct = false;
                     System.out.println("Incorrect data was entered, please enter correct data.");
                 }
             }while (!correct) ;

             do {
                 correct = true;
                 System.out.println("What is the age of the teacher?");
                 age = keyboard.nextInt();
                 String years = keyboard.nextLine();
                 try{
                     age = InputTypeVerifier.numbers(years);
                 }catch (noInputException e) {
                     correct = false;
                     System.out.println("No input was entered, please enter some data.");
                 } catch (incorrectException e) {
                     correct = false;
                     System.out.println("Incorrect data was entered, please enter correct data.");
                 }
             }while(!correct);
              Teacher teacher = new Teacher(age, teacherName);
              Zoo.add(teacher);
              break;
       }
    }
}
