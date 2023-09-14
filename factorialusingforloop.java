//java program to find factorial of a number using FOr loop:
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int a, n = 1;
        System.out.println("Enter number    ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        for(int i = 1 ; i <=a ; i++){
           n= n*i;
        }
        System.out.println("The factorial of    " +a + "    is  " +n);
    }
    
}