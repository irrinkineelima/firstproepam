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
        Sweets ch3=new Candy("caramel",10,15);
        l1.add(ch3);
        Sweets ch4=new Candy("munch",25,80);
        l1.add(ch4);
        Sweets ch5=new Candy("5-star",50,100);
        l1.add(ch5);
        Sweets ch6=new Candy("jellies",5,25);
        l1.add(ch6);
        Sweets ch7=new Candy("Chewing gum",10,20);
        l1.add(ch7);
        Sweets ch8=new Candy("kitkat",30,150);
        l1.add(ch8);
        Sweets ch9=new Candy("Diary milk",60,200);
        l1.add(ch9);
        Sweets ch10=new Candy("perk",20,120);
        l1.add(ch10);
        Sweets ch11=new Candy("macron",40,90);
        l1.add(ch11);
        List<Sweets> l2=new ArrayList<>();
        for(int i=0;i<l1.size();i++){
            if(l1.get(i) instanceof Chocolates){
                l2.add(l1.get(i));
            }
        }
        Collections.sort(l2,new sortbycost());
        System.out.println("Total cost: ");
        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i).cost);
        }
        int sum=0;
        for(int i=0;i<l1.size();i++){
            sum+=l1.get(i).weight;
        }
        System.out.println("Total weight : "+sum);
        int countabove0=0;
        int countabove50=0;
        int countabove100=0;
        for(int i=0;i<l1.size();i++){
            if(l1.get(i) instanceof Candy){
                if(l1.get(i).cost>=0 && l1.get(i).cost<=50){
                    countabove0++;
                }
                else if(l1.get(i).cost>=50 && l1.get(i).cost<=100){
                    countabove50++;
                }
                else{
                    countabove100++;
                }
            }
        }
        System.out.println("Count of candies below 50 is : "+countabove0);
        System.out.println("Count of candies below 100 is : "+countabove50);
        System.out.println("Count of candies below 200 is : "+countabove100);
    }
}
