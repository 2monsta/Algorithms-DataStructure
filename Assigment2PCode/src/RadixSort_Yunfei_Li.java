//Name: Yunfei Li
//Class: CS5040
//Assignment 5 - Queues(Radix Sort)
//Term: Summer 2017
import java.util.Scanner;

public class RadixSort_Yunfei_Li {

    long ExtractDigit(long n, int position){
        for(int i=0;i<position-1;i++){
            n=n/10;
        }
        return n%10;
    }
    int getMax(long arr[]){ //method to find max in a given array and counts its digits and return it

        long max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        int c=0;
        while(max>0)
        {
            max=max/10;
            c++;
        }

        return c;
    }

    void radixSort(long arr[]){
        //sorting with radix
        //creating 10 queue objects
        Queue_Yunfei_Li zero, one, two, three, four, five, six, seven, eight, nine;
        zero = new Queue_Yunfei_Li();
        one = new Queue_Yunfei_Li();
        two = new Queue_Yunfei_Li();
        three = new Queue_Yunfei_Li();
        four = new Queue_Yunfei_Li();
        five = new Queue_Yunfei_Li();
        six = new Queue_Yunfei_Li();
        seven = new Queue_Yunfei_Li();
        eight = new Queue_Yunfei_Li();
        nine = new Queue_Yunfei_Li();


        int j;
        long digit;
        int max = this.getMax(arr);

        //enqueuing to the queue
        for(int i = 1; i<=max; i ++){
            for (j = 0; j <arr.length; j++) {
                digit = this.ExtractDigit(arr[j], i);
                if(digit ==0){
                    zero.enqueue((int) arr[j]);
                }else if(digit ==1){
                    one.enqueue((int) arr[j]);
                }else if(digit ==2){
                    two.enqueue((int) arr[j]);
                }else if(digit ==3){
                    three.enqueue((int) arr[j]);
                }else if(digit ==4){
                    four.enqueue((int) arr[j]);
                }else if(digit ==5){
                    five.enqueue((int) arr[j]);
                }else if(digit ==6){
                    six.enqueue((int) arr[j]);
                }else if(digit ==7){
                    seven.enqueue((int) arr[j]);
                }else if(digit ==8){
                    eight.enqueue((int) arr[j]);
                }else if(digit ==9){
                    nine.enqueue((int) arr[j]);
                }
            }
            //emptying queue
            j=0;
            for(int c = 1; c<=zero.getSize(); c++){
                arr[j] = zero.front();
                zero.dequeue();
                j++;
            }
            for(int c = 1; c<=one.getSize(); c++){
                arr[j] = one.front();
                one.dequeue();
                j++;
            }
            for(int c = 1; c<=two.getSize(); c++){
                arr[j] = two.front();
                two.dequeue();
                j++;
            }
            for(int c = 1; c<=three.getSize(); c++){
                arr[j] = three.front();
                three.dequeue();
                j++;
            }
            for(int c = 1; c<=four.getSize(); c++){
                arr[j] = four.front();
                four.dequeue();
                j++;
            }
            for(int c = 1; c<=five.getSize(); c++){
                arr[j] = five.front();
                five.dequeue();
                j++;
            }
            for(int c = 1; c<=six.getSize(); c++){
                arr[j] = six.front();
                six.dequeue();
                j++;
            }
            for(int c = 1; c<=seven.getSize(); c++){
                arr[j] = seven.front();
                seven.dequeue();
                j++;
            }
            for(int c = 1; c<=eight.getSize(); c++){
                arr[j] = eight.front();
                eight.dequeue();
                j++;
            }
            for(int c = 1; c<=nine.getSize(); c++){
                arr[j] = nine.front();
                nine.dequeue();
                j++;
            }
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        //Scanning input into the array
        long inputs[] = new long [3]; //creates an array to store 6 numbers
        for(int i=0; i<inputs.length; i++){
            inputs[i] = input.nextInt(); //adding the user data to inputs
        }
        //Input before sorting
        System.out.print("Input array before sorting:");
        for(int i = 0; i<inputs.length; i++){
            System.out.print(inputs[i] + " ");
        }
        RadixSort_Yunfei_Li r = new RadixSort_Yunfei_Li();
        r.radixSort(inputs);
        System.out.println();

        System.out.print("Input array after sorting:");
        for(int i = 0; i<inputs.length; i++){
            System.out.print(inputs[i] + " ");
        }


    }
}
