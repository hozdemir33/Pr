package org.example;

public class Arrays {



    private int [] sumArrays(int [] numberses)
    {
        return numberses;
    }

    public static void main(String[] args) {

        int [] numbers= new int[4];

      //  System.out.println(numbers.toString()); does NOT WORK

        numbers[0]=0;
        numbers[1]=1;
        numbers[2]=2;
        numbers[3]=3;
        //numbers[4]=4;  //ARE YOU SURE!!!

      //  System.out.println(numbers[0]);  //result number :: 0

      //  System.out.println(numbers[2]);   //result number ::  2

           //  EXCEPTION :: ArrayIndexOutOfBoundsException WITH numbers[4]

        int[] nu = new int[8];  //this is how you generate arrays 0 0 0 0 0 0

        for(int i = 0 ;  i<8  ;  i++)
        {
          //  System.out.println(nu[i]);
        }


        int [] thisNumbers= new int [7];

        for(int i=0 ; i<7 ; i++)

        {
            thisNumbers[i]=i;
        }

//        System.out.println(thisNumbers[2]);
//        System.out.println(thisNumbers[5]);

        //what is the out put of these code???
        int[] k = new int[8];
        k[1]=3;
        k[4]=7;
        k[6]=5;

        int y = k [1];  // 3  , y=3 ;

        k[y]=2;        // k[3] = 2 ;

        k[k[4]]=9;     //   k[4]=7 ;  , k[7]=9;

        //FINAL Result :::::  0, 3, 0, 2, 7, 0, 5 , 9

        String[] str=new String[3];

        str[0]= "has";
        str[1]="iki";
        str[2]="bebe";


       int size= str.length;
        //System.out.println("The size of this array is  ::" + size);  // 3
       // System.out.println(str[0] + "  ," + str[1]+ " , "+ str[2]);


        int lastIndexValue=str.length-1;  //this would give your the last element
       // System.out.println("this is the last element in the array ::: " + lastIndexValue);

        int[] x= new int[5];

        for(int i=0; i<x.length; i++)
        {
            x[i] = 2*i;  // i=0; x[0]=0 , i=1 ; x[1]=2 ; x=2 ; x[2]=4
            //System.out.println(x[i]);
        }


        int sum=0;
        int [] c={1,2,3};

        for(int i=0 ; i<c.length ;i++)
        {
            sum=sum+c[i];
        }
        System.out.println("The sum of the arrays" + sum);



        //let's find the sum of 1,7,-9, 0 ,11, -5 of an array

        int summNumTotal=0;
        int [] s={ 1,7,-9, 0 ,11, -5 };

        for (int j : s) summNumTotal = summNumTotal + j;
        {
            System.out.println("The sum of the array numbers is::::"+ summNumTotal); // 5
        }


    }
}
