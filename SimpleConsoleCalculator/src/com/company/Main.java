package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1=scan.nextInt();
        System.out.println("Enter an Operator");
        String input=scan.next();

        System.out.println("Enter second number");
        int num2=scan.nextInt();
        String operator="+".equals(input)?"+": "*".equals(input)?"*": "/".equals(input)?"/": "-".equals(input)?"-":"%";

        switch(operator){
            case  "+":
                System.out.println(num1 +"+"+num2+"="+(num1+num2));
                break;
            case  "*":
                System.out.println(num1 +"*"+num2+"="+(num1*num2));
                break;
            case  "/":
                switch(num2){
                    case 0:
                        System.out.println("You can't divide a number by  zero");
                        break;
                    default:
                        System.out.println(num1 +"/"+num2+"="+(num1/num2));
                }
                break;
            case  "-":
                System.out.println(num1 +"-"+num2+"="+(num1-num2));
                break;
            default:
                System.out.println(num1 +"%"+num2+"="+(num1%num2));
        }
    }
}
