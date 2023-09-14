//Simple JAVA program for operation  calculation using Methods:

import java.util.Scanner;
import java.lang.Math;

class Calculate{
    double a,b;
    
double Add() {
    return a+b;
}
double Subtract (){
    return a-b;

}
double Divide(){
    return a/b;
}

double Multiply(){
    return a*b;
    
}

double Power(){
    return Math.pow(a,b);
}
void Calci(double a, double b){
    this.a = a;
    this.b = b;
}
}

class Main{
    public static void main(String args[]){
        Calculate c1 = new Calculate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1: ");
        double a = sc.nextDouble();
        System.out.println("Input number 2: ");
        double b = sc.nextDouble();
        c1.Calci(a,b);
    System.out.println("The addition is     " + c1.Add());
    System.out.println("The subtraction is  " +c1.Subtract());
    System.out.println("The Multiplication is  "+c1.Multiply());
    System.out.println("The Division is "+c1.Divide());
    System.out.println("The power is "+c1.Power());

    }
}
