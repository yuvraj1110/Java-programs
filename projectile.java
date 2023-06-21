/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shadow;

/**
 *
 * @author KIIT
 */
// Java porgram to find scientific calculations:
import java.util.Scanner;
import java.util.*;
public class main {
   public static void main(String[] args){
       double v = 0, angle = 0, g= 9.81;
       Scanner sc = new Scanner(System.in);
       Scanner sc1 = new Scanner(System.in);
      
       System.out. println("Enter velocity of projectile\t");
       v = sc.nextDouble();
      
       System.out.println("Enter angle of firing \t");
       angle = sc1.nextDouble();
      
double vh = v* (Math.sin(angle));     // To find vertical component
double vt = v* (Math.cos(angle));     // To find Horizontal component
double t = 2 * v * Math.sin(angle)/g; // To find Time of travel
double d = vh * vt * 2/g;               // To find Horizontal distance travelled
double h = 0.5 * g * Math.pow(t,2); // To find maximum heigth attained by projectile
double angleoffiring = 0.5 * Math.asin(d * g/(v * v)); // To find angle of firing

System.out. printf("The vertical component(vh) =  %f\n", vh);
System.out.printf("The Horizontal component = %f\n", vt);
System.out.printf("Time of travel = %f\n", t);
System.out.printf("Horizonatal distance travelled = %f\n", d);
System.out.printf("Maximum heigth attained by projectile = %f\n",h);
System.out.printf("Angle of firing %f\n ", angleoffiring);

       
       
   }
}
