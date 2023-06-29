package com.assignment;
// 3. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots.
// The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)
//Take a, b, and c as input values to find the roots of x.

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        double a = Integer.parseInt(args[0]);
        double b = Integer.parseInt(args[1]);
        double c = Integer.parseInt(args[2]);

        double delta = b*b - 4*a*c;
        if (delta>0.0){
            double Root1=(-b + sqrt(delta))/(2*a);
            double Root2=(-b - sqrt(delta))/(2*a);
            System.out.println("The roots are " + Root1 + " and " + Root2);
        }else if (delta==0.0){
            double Root1= -b/(2.0 * a);
            System.out.println("Thw root is "+Root1);
        }else{
            System.out.println("Roots are not real");
        }
    }
}
