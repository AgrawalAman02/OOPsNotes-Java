/*
Q.5. Write a java class which consists of 5 integer data. Overload constructor
(Default &amp; normal) to initialize those integer data members. Provide a method which
sorts those integer data members using bubble sort.
*/

import java.io.*;
class Data{
    int [] data = new int[5];

    public Data(){
        for(int i = 0; i<data.length;i++){
            data[i]= 0;
        }
    }

    public Data(int d1, int d2, int d3, int d4, int d5){
        data[0] = d1;
        data[1] = d2;
        data[2] = d3;
        data[3] = d4;
        data[4] = d5;
    }


    public void sort(){
        int n = data.length;
        for(int i = 0; i<n; i++ ){
            for(int j =0 ; j<n-i-1; j++){
                if(data[j+1]<data[j]){
                    int temp = data[j+1];
                    data[j+1]= data[j];
                    data[j] =temp;
                }
            }
        }

    }

    public void display(){
        System.out.print("The Data : " );
        for(int i=0; i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

}
public class Q5 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            //default constructor
            Data item1 = new Data();
            System.out.println("The Default value using default constructor is : ");
            item1.display();
            System.out.println("Now we have to provide the five integer data to initialise them and then sort them . So please enter the five input integers :");
            int d1 = Integer.parseInt(br.readLine());
            int d2 = Integer.parseInt(br.readLine());
            int d3 = Integer.parseInt(br.readLine());
            int d4 = Integer.parseInt(br.readLine());
            int d5 = Integer.parseInt(br.readLine());
            Data item2= new Data(d1,d2,d3,d4,d5);
            System.out.println("So your data before sorting is : ");
            item2.display();
            item2.sort();
            System.out.println("So your data after sorting is : ");
            item2.display();
        }
    }

}
