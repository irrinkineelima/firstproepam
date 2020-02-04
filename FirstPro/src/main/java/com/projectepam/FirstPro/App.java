package com.projectepam.FirstPro;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        List<Sweets> l1=new ArrayList<>();
        Sweets ch1=new Chocolates("temptations",120,180);
        l1.add(ch1);
        Sweets ch2=new Chocolates("dark chocolate",95,150);
        l1.add(ch2);
        Sweets ch3=new Candy("caramel",10,10);
        l1.add(ch3);
        Sweets ch4=new Candy("munch",15,10);
        l1.add(ch4);
        List<Sweets> l2=new ArrayList<>();
        for(int i=0;i<l1.size();i++){
            if(l1.get(i) instanceof Chocolates){
                l2.add(l1.get(i));
            }
        }
        Collections.sort(l2,new sortbycost());
        System.out.println("Total cost in increasing order: ");
        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i).cost);
        }
        int sum=0;
        for(int i=0;i<l1.size();i++){
            sum+=l1.get(i).weight;
        }
        System.out.println("Total weight : "+sum);
        int count=0;
        for(int i=0;i<l1.size();i++){
            if(l1.get(i) instanceof Candy){
                count++;
            }
        }
        System.out.println("Total number of candies : "+count);
    }
}
