package us.mattgreen;

import java.util.Scanner;

public class userChoice {
    public static void menu() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of animal do you want to create?");
        System.out.println("1: Dog");
        System.out.println("2: Cat");
        System.out.println("3: Teacher");
        int num = keyboard.nextInt();
        switch(num){
            case 1:
                Scanner keyboard1 = new Scanner(System.in);
                System.out.println("What is the dog's name?");
                String dogName = keyboard1.next();
                System.out.println("Is the dog friendly? (Y/N)");
                boolean friendly = true; //still need to work on this
                Dog dog = new Dog (friendly, dogName);
            case 2:
                Scanner keyboard2 = new Scanner(System.in);
                System.out.println("What is the cat's name?");
                String catName = keyboard2.next();
                System.out.println("How many mice has your cat killed?");
                int killed = keyboard2.nextInt();
                Cat cat = new Cat(killed, catName);
                break;
            case 3:
                Scanner keyboard3 = new Scanner(System.in);
                System.out.println("What is the teacher's name?");
                String teacherName = keyboard3.next();
                System.out.println("What is the age of the teacher?");
                int age = keyboard3.nextInt();
                Teacher teacher = new Teacher(age, teacherName);
                break;
        }


    }
}
