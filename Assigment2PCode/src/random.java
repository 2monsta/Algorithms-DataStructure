import java.util.*;
public class random {
    public static class radixSort {
        void print_array(long a[])
        {
            int i;
            int n =a.length;

            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }

        int getMax(long a[])//method to find max in a given array and counts its digits and return it,
        {
            long max=a[0];
            int n = a.length;
            int i;

            for(i=0;i<n;i++)
            {
                if(a[i]>max)
                    max = a[i];
            }
            int c=0;
            while(max>0)
            {
                max=max/10;
                c++;
            }

            return c;
        }

        long extractDigit(long n,int p)//method to etract digit at givenposition from least significant bit...
        { //p -position
            int i=0;
            for(i=0;i<p-1;i++)
            {
                n=n/10;
            }
            return n%10;
        }


        void radix_sort(long a[]) {
            queue zero, one, two, three, four, five, six, seven, eight, nine;
            zero = new queue();//10 queue..objects
            one = new queue();
            two = new queue();
            three = new queue();
            four = new queue();
            five = new queue();
            six = new queue();
            seven = new queue();
            eight = new queue();
            nine = new queue();

            int max = this.getMax(a);

            int i = 1, j;
            int n = a.length;
            long digit;
//digit wise forming buckets in queues...
            while (i <= max) {

                for (j = 0; j < n; j++) {

                    digit = this.extractDigit(a[j], i);

//adding to appropriate bucket queue
                    if (digit == 0) {
                        zero.v[zero.size] = a[j];
                        zero.size++;
                    } else if (digit == 1) {
                        one.v[one.size] = a[j];
                        one.size++;
                    } else if (digit == 2) {
                        two.v[two.size] = a[j];
                        two.size++;

                    } else if (digit == 3) {

                        three.v[three.size] = a[j];
                        three.size++;
                    } else if (digit == 4) {

                        four.v[four.size] = a[j];
                        four.size++;
                    } else if (digit == 5) {
                        five.v[five.size] = a[j];
                        five.size++;
                    } else if (digit == 6) {
                        six.v[six.size] = a[j];
                        six.size++;

                    } else if (digit == 7) {
                        seven.v[seven.size] = a[j];
                        seven.size++;
                    } else if (digit == 8) {
                        eight.v[eight.size] = a[j];
                        eight.size++;
                    } else if (digit == 9) {
                        nine.v[nine.size] = a[j];
                        nine.size++;
                    }


                }


                j = 0;
                int c = 0;
//emptying queues..
                while (c < zero.size) {
                    a[j] = zero.v[c];
                    j++;
                    c++;
                }
                zero.size = 0;


                c = 0;
                while (c < one.size) {
                    a[j] = one.v[c];
                    j++;
                    c++;
                }
                one.size = 0;


                c = 0;
                while (c < two.size) {
                    a[j] = two.v[c];
                    j++;
                    c++;
                }
                two.size = 0;


                c = 0;
                while (c < three.size) {
                    a[j] = three.v[c];
                    j++;
                    c++;
                }
                three.size = 0;


                c = 0;
                while (c < four.size) {
                    a[j] = four.v[c];
                    j++;
                    c++;
                }
                four.size = 0;


                c = 0;
                while (c < five.size) {
                    a[j] = five.v[c];
                    j++;
                    c++;
                }
                five.size = 0;


                c = 0;
                while (c < six.size) {
                    a[j] = six.v[c];
                    j++;
                    c++;
                }
                six.size = 0;


                c = 0;
                while (c < seven.size) {
                    a[j] = seven.v[c];
                    j++;
                    c++;
                }
                seven.size = 0;


                c = 0;
                while (c < eight.size) {
                    a[j] = eight.v[c];
                    j++;
                    c++;
                }
                eight.size = 0;

                c = 0;
                while (c < nine.size) {
                    a[j] = nine.v[c];
                    j++;
                    c++;
                }
                nine.size = 0;


                i++;
            }


        }




    }
    public static void main(String args[])
    {
        long a[] = new long[3];
        int i;
        System.out.println("Enter 6 numbers:");
        Scanner sc = new Scanner(System.in);

        for(i=0;i<3;i++)
        {
            a[i] = sc.nextInt();//reading integers..
        }


//creating objects...
        radixSort r = new radixSort();

        System.out.print("printing array before sorting : ");
        r.print_array(a);

//sorting array
        r.radix_sort(a);

        System.out.print("printing array after sorting : ");
        r.print_array(a);


    }
}
