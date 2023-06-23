/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KIIT
 */
import java.util.Random;
import java.util.Scanner;
public class randomnumbergeneration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the count\t");
        int count = sc.nextInt();
        System.out.println("Enter range");
        int range = sc1.nextInt();
        
       Random rand = new Random();
        System.out.printf("The %d random numbers are\n",count);
        for(int i = 0; i< count; i++){
            System.out.println(rand.nextInt(range));
        }
    }
}
