package org.example;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
//import java.math.*;


public class Main {
static ArrayList<String> memory = new ArrayList<String>();
static String Memory = memory.toString().replace("[", "").replace("]", "");
static boolean didEquation;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type any text lmao :D");
        sc.next();
        selection();
    }
public static void selection(){
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    if (didEquation==true){
        System.out.println("Print your Memory?\n1 if yes 2 if no and anything else if you are stupid");
        int memoryPrintChoice = sc.nextInt();
        if(memoryPrintChoice==1){
            printMemory();
        } else if (memoryPrintChoice!=2) {
            System.out.println("someone send this guy back to kindergarten to learn their numbers again");
            System.exit(0);
        }
    }
            System.out.println("Do you want to do an operation or calculate using a formula? (ie pythagurous equation, quadratic formula etc...)");
            System.out.println("type 1 if you want to do an operation, 2 if you want to do a formula");
    int calcType = sc.nextInt();
    if (calcType== 1){
        selectionOperation();
    } else if (calcType==2) {
    selectionEquation();
    }else {
        System.out.println("you cant even type a number lmao, here try again idiot");
        selection();
    }


}
 public static void selectionOperation() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pick your operation, \n 1: addition \n 2: subtraction \n 3: multiplication \n 4: division \n 5: go back to previous menu");
        int choiceOperation = sc.nextInt();
        switch (choiceOperation){
            case 1:
                add();
                break;

            case 2:
                subtract();
                break;

            case 3:
                multiply();
                break;

            case 4:
                divide();
                break;
            case 5:
                selection();
                break;
            default:
                System.out.println("choose again idiot");
                selectionOperation();
                break;
        }

    }

    public static void selectionEquation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWhat formula you want huh\n 1 for rectangular prism calculations");
        int  choiceEquation = sc.nextInt();
        switch (choiceEquation){
            case 1:
                rectangularPrism();
            break;
            default:
                selectionEquation();
                break;

        }
    }

    public static void rectangularPrism(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your length");
        double rectLength = sc.nextInt();
        System.out.println("enter your height");
        double rectHeight = sc.nextInt();
        System.out.println("enter your width");
        double rectWidth = sc.nextInt();
        System.out.println("Do you want the Volume or Surface area? \n 1: Volume \n 2: Surface Area");
        int formulaChoice = sc.nextInt();
        if (formulaChoice==1){
            rectVolume(rectLength, rectHeight, rectWidth);
        } else if (formulaChoice==2) {
            //surface area method
        }else {
            System.out.println("try again idiot, im making you put the numbers again just so you suffer");
            rectangularPrism();
        }

    }

    public static void rectVolume(double length, double height, double width){
        double rectVolume = length * height* width;
        System.out.println(rectVolume);
        memory.add("\nRectangular prism volume( L * H * W)" + "\n" +length + " * " + height + " * "+ width +"\n" + rectVolume + "\n______________");
        System.out.println("\nalso you are in an infinite loop, do your math homework idiot");
        didEquation = true;
        selection();
    }



    public static void printMemory(){
        String Memory = memory.toString().replace("[", "").replace("]", "").replace(",", "");
        System.out.println(Memory);

    }
    public static void add(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Please enter your first number");
        double input1 = sc.nextInt();
        System.out.println("please input your second number");
        double input2 = sc.nextInt();
        double result = input1+input2;
        System.out.print("your result is ");
        System.out.print(result);
        memory.add("\n" +input1 + " + " + input2 + "\n" + result + "\n______________");
        System.out.println("\nalso you are in an infinite loop, do your math homework idiot");
        didEquation = true;
        selection();

    }
    public static void subtract(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Please enter your first number");
        double input1 = sc.nextInt();
        System.out.println("please input your second number");
        double input2 = sc.nextInt();
        double result = input1-input2;
        System.out.print("your result is ");
        System.out.print(result);
        memory.add("\n" +input1 + " - " + input2 + "\n" + result + "\n______________");
        System.out.println("\nalso you are in an infinite loop, do your math homework idiot");
        didEquation = true;
        selection();
    }
    public static void multiply(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Please enter your first number");
        double input1 = sc.nextInt();
        System.out.println("please input your second number");
        double input2 = sc.nextInt();
        double result = input1*input2;
        System.out.print("your result is ");
        System.out.print(result);
        memory.add("\n" +input1 + " x " + input2 + "\n" + result + "\n______________");
        System.out.println("\nalso you are in an infinite loop, do your math homework idiot");
        didEquation = true;
        selection();


    }
    public static void divide(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Please enter your first number");
        double input1 = sc.nextInt();
        System.out.println("please input your second number");
        double input2 = sc.nextInt();
        double result = input1/input2;
        System.out.print("your result is ");
        System.out.print(result);
        memory.add("\n" +input1 + " / " + input2 + "\n" + result + "\n______________");
        System.out.println("\nalso you are in an infinite loop, do your math homework idiot");
        didEquation = true;
        selection();

    }



}