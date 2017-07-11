//Name: Yunfei Li
//Class: CS5040
//Assignment 5 - Queues(Radix Sort)
//Term: Summer 2017
import java.util.Scanner;

public class RadixSort_Yunfei_Li {
    // extract the digit
    long ExtractDigit(long n, int position){
        for(int i=0;i<position-1;i++){
            n=n/10;
        }
        return n%10;
    }
    //method to find max in a given array and counts its digits and return it
    int getMax(long arr[]){

        long max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        int maxDigit=0;
        while(max>0){
            max=max/10;
            maxDigit++;
        }
        return maxDigit;
    }

    void radixSort(long arr[]){
        //sorting with radix
        //creating 10 queue objects or buckets
        Queue_Yunfei_Li zero, one, two, three, four, five, six, seven, eight, nine;
        zero = new Queue_Yunfei_Li(); //bucket zero
        one = new Queue_Yunfei_Li(); //bucket one
        two = new Queue_Yunfei_Li(); //bucket two
        three = new Queue_Yunfei_Li(); //bucket three
        four = new Queue_Yunfei_Li(); //bucket four
        five = new Queue_Yunfei_Li(); //bucket five
        six = new Queue_Yunfei_Li(); //bucket six
        seven = new Queue_Yunfei_Li(); //bucket seven
        eight = new Queue_Yunfei_Li(); //bucket eight
        nine = new Queue_Yunfei_Li(); //bucket nine


        int j;
        int max = getMax(arr);

        //enqueuing to the queue
        for(int i = 1; i<=max; i++){ //looping through all the digit
            for (j = 0; j <arr.length; j++){
                long digit = this.ExtractDigit(arr[j], i); //extract all the digit from input one at a time
                //placing all the numbers in the queue
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
            while(zero.getSize()>0){ //while there is a number located in zero, do the following
                arr[j] = zero.front(); //put into array position 0
                zero.dequeue(); //empty out the front
                j++; //increase the position by 1
            }
            while(one.getSize()>0){
                arr[j] = one.front();
                one.dequeue();
                j++;
            }
            while(two.getSize()>0){
                arr[j] = two.front();
                two.dequeue();
                j++;
            }
            while(three.getSize()>0){
                arr[j] = three.front();
                three.dequeue();
                j++;
            }
            while(four.getSize()>0){
                arr[j] = four.front();
                four.dequeue();
                j++;
            }
            while(five.getSize()>0){
                arr[j] = five.front();
                five.dequeue();
                j++;
            }
            while(six.getSize()>0){
                arr[j] = six.front();
                six.dequeue();
                j++;
            }
            while(seven.getSize()>0){
                arr[j] = seven.front();
                seven.dequeue();
                j++;
            }
            while(eight.getSize()>0){
                arr[j] = eight.front();
                eight.dequeue();
                j++;
            }
            while(nine.getSize()>0){
                arr[j] = nine.front();
                nine.dequeue();
                j++;
            }
        }

    }



    /*I know i'm missing something, it only works when the same digit is present
      For example input:39 38 37 36 35 32 would work, but 213 3465 7 29 541 45 would not
      I'm thinking that there's something wrong with the getMax method because it's not looping through
      all the digits. That's just what i'm thinking could be wrong.
      Please provide feedback on how to fix this code, it's been a frustrating week.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter six numbers");
        //Scanning input into the array
        long inputs[] = new long [6]; //creates an array to store 6 numbers
        for(int i=0; i<inputs.length; i++){
            inputs[i] = input.nextInt(); //adding the user data to inputs
        }
        //Input before sorting
        System.out.print("Input array before sorting:");
        for(int i = 0; i<inputs.length; i++){
            System.out.print(inputs[i] + " ");
        }
        RadixSort_Yunfei_Li r = new RadixSort_Yunfei_Li(); //creates the object
        //trying to catch all the errors
        try{
            r.radixSort(inputs); //sorting the inputs
        }catch(Exception e){
            System.out.println("something bad happened");
        }
        System.out.println();
        //printing out the inputs after sorting
        System.out.print("Input array after sorting:");
        for(int i = 0; i<inputs.length; i++){
            System.out.print(inputs[i] + " ");
        }
    }
}
