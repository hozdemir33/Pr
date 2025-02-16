package org.example;

import java.util.*;
import java.util.Arrays;

public class ReverseArrays {

    public static void main(String[] args) {


        //how to reverse arrays list from 1,2,3 to [ 3,2,1 ]
        int [] num= {1,2,3} ;

        System.out.println("This is the first output " + Arrays.toString(num)); // [1,2,3]


        int [] reversedArray = new int [num.length];

        for(int i=0; i<num.length;i++)
        {

          reversedArray [i]= num[num.length-1-i] ;

        }

       // System.out.println(Arrays.toString(reversedArray));


        //ArrayList----Collection.reverse()


        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3));

        Collections.reverse(list);

        System.out.println("This is the reveresed form ::"+list);


    }
}
