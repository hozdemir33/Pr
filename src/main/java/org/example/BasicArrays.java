package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicArrays {


    public static void main(String[] args) {

        int [] num= {1,4,3,2};

        Arrays.sort(num);

        for(int newNum:num){
          //  System.out.println(newNum);
        }


        //Write a program to find the LARGEST and SMALLEST element in an array.

        int [] number={7,1,90};
        Arrays.sort(number); //sort the arrays

        int largestNumber=number[0];//assign the largest variable

        for (int newNumbers:number){
            if(newNumbers>largestNumber){

                largestNumber=newNumbers;

            }

        }
      // System.out.println("This is the largest number in the array:::"+ largestNumber);


        //THE SMALLEST NUMBER IN AN ARRAY

        int [] arr={7,-1,3,5,10};
        Arrays.sort(arr);  //SORT THE ARRAYS FIRST

        int smallestNumber= arr[0]; //ASSIGN A SMALLEST VERIABLE IN THE ARRAY

      //  System.out.println("the smallest num::::"+ smallestNumber);


       // Write a program to calculate the sum and average of an array of numbers.

        int [] arr1={2,1,3,900};
        //Arrays.sort(arr1); // 0,1,2,3

        int sum=0;

        for(int newArr1:arr1){

            sum=sum+newArr1;

        }
      //  System.out.println("total:::"+sum);



      //  Reverse an array WITHOUT using another array

        int [] b= {1,2,3};  //HOW TO REVERSE IT !!! //3,2,1

        int left=0;
        int right=b.length-1;

        while (left<right){

            //SWAPPING ELEMENTS

            int temp=b[left];

                b[left]=b[right];

                b[right]=temp;

            left++;
            right--;

        }

        //System.out.println("THE REVERSE ARRAY IS :::"+ java.util.Arrays.toString(b));

        //2ND METHOD IS :: COLLECTIONS.REVERSE() (FOR Integer array )

        //If you're working with an Integer array, convert it into
        // a list and use Collections.reverse():

        Integer [] numbers = {1,2,3,4,5,6,7,8};

       List<Integer>list=Arrays.asList(numbers);

       Collections.reverse(list);
       
        System.out.println(Arrays.toString(numbers));










    }


}
