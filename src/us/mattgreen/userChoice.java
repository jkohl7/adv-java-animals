package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class userChoice {
    public void menu(ArrayList Zoo) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of animal do you want to create?");
        System.out.println("1: Dog");
        System.out.println("2: Cat");
        System.out.println("3: Teacher");
        int num = Integer.parseInt(keyboard.nextLine());
        switch(num) {
            case 1:
                boolean friendly;
                System.out.println("What is the dog's name?");
                String dogName = keyboard.next();
                System.out.println("Is the dog friendly? (Y/N)");
                String reply = keyboard.next();
                if (reply.equals("Y")) {
                    friendly = true;
                } else{
                    friendly = false;}
                Dog dog = new Dog (friendly, dogName);
                Zoo.add(dog);
                break;
            case 2:
                System.out.println("What is the cat's name?");
                String catName = keyboard.next();
                System.out.println("How many mice has your cat killed?");
                int killed = keyboard.nextInt();
                Cat cat = new Cat(killed, catName);
                Zoo.add(cat);
                break;
            case 3:
                System.out.println("What is the teacher's name?");
                String teacherName = keyboard.next();
                System.out.println("What is the age of the teacher?");
                int age = keyboard.nextInt();
                Teacher teacher = new Teacher(age, teacherName);
                Zoo.add(teacher);
                break;
        }
    }
}
