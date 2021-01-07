package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        //ArrayList is default class
        //It will like dynamic array

       //default generics
        ArrayList<Object>  ar = new ArrayList<Object>();
        ar.add(200);
        ar.add(100);                                          //adding to value to the array
        ar.add("array");
        ar.add(12.6);
        ar.add(true);
        System.out.println(ar);

        System.out.println(ar.get(3));                        //getting value from array
       // System.out.println(ar.get(6));     //out of bound exception

        System.out.println(ar.size());
        System.out.println("Lowest index = "+ 0);
        System.out.println("Highest index = " + (ar.size()-1));

        ar.add(400);
        ar.add(500);
        System.out.println(ar.size());



    }

}
