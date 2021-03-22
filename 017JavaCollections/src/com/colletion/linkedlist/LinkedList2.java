package com.colletion.linkedlist;
import java.util.*;  
public class LinkedList2{  
 public static void main(String args[]){  
 LinkedList<String> ll=new LinkedList<String>();  
           System.out.println("Initial list of elements: "+ll);  
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  
           System.out.println("After invoking add method: "+ll);  
           //Adding an element at the specific position
           
           ll.add(2, "somu");
           System.out.println("after adding index and element:"+ll);
           
           LinkedList<String> ll2=new LinkedList<String>();  
           ll2.add("Sonoo");  
           ll2.add("Hanumat"); 
           //adding 2nd list to 1st list
           ll.addAll(ll2);
           System.out.println("after invoking addAll method:"+ll);
           
      ll.addAll(1, ll2);
      System.out.println(ll);
      
      ll.addFirst("praveen");
      System.out.println("after invoking addFirst Method:"+ll);
      
      ll.addLast("khan");
      System.out.println("after invoking addLast Method:"+ll);

           
           
           
 }}