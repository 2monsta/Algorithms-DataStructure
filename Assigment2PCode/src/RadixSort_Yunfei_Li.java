//Name: Yunfei Li
//Class: CS5040
//Assignment 5 - Queues(Radix Sort)
//Term: Summer 2017
import java.util.Scanner;

public class RadixSort_Yunfei_Li {
    public static int digitExtration(double n, double position) {
        double num = n % (Math.pow(10,position));
        double den = Math.pow(10,position-1);
        return (int) (num/den);
    }

    public static void radixSort(){
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        Integer [] inputs = new Integer [3]; //creates an array to store 6 numbers
        for(int i=0; i<inputs.length; i++){
            inputs[i] = input.nextInt(); //adding the user data to inputs
        }
        for(int i = 0; i<inputs.length; i++){
            System.out.print(inputs[i] + " ");
        }


    }

    public static void main(String[] args) {
        radixSort();
    }
}
