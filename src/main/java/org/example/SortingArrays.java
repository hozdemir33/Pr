package org.example;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {



        int[] num={12,3,1,65,9};


        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        //HOW TO FIND THE LARGEST NUMBER IN AN ARRAY

        int x=0;  //INITITILIZING THE X VALUE AS ZERO

        for(int i =0 ; i<num.length; i++)
        {
            if(num[i]>x){
              x = num[i];
            }

        }
        System.out.println("This is the largest number in an array :::"+x);


        // FIND the smallest number in an array

        int[] y={3,1,-1,-90};

        Arrays.sort(y);
        //System.out.println(Arrays.toString(y));  // [ -1 ,  1,  3 ,  90 ]

      //  System.out.println("This is the smallest number in an array ::" + y[0]);

        int smallestNum=0;

        for(int i=0; i<y.length; i++)
        {
            if(smallestNum>y[i])
            {
             smallestNum  = y[i];

            }

        }

        System.out.println("This is the smallest number in an array ::: "+ smallestNum);






    }
}
