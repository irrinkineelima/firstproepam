package com.projectepam.FirstPro;

import java.util.*;
public class Sweets
{
    String name;
    int weight;
    int cost;
    Sweets(String name,int weight,int cost){
        this.name=name;
        this.weight=weight;
        this.cost=cost;
    }
}
class sortbycost implements Comparator<Sweets>{
    public int compare(Sweets a,Sweets b){
        return a.cost-b.cost;
    }
}
class sortbyweight implements Comparator<Sweets>{
    public int compare(Sweets a,Sweets b){
        return b.weight-a.weight;
    }
}