/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.Shtefan;

import java.util.Scanner;

/**
 *
 * @author uitschool JV
 */
public class Task2 {
    public static void main(String[] args) {
      boolean finish = false;
        Scanner sc = new Scanner(System.in);
      while(!finish){
          System.out.println("Enter digit from 0 to 9 or negative value to exit");
          int result = Integer.parseInt(sc.next());
          
          switch(result){
              case 0:{
                  System.out.println("zero");
                  
              }break;
              case 1:{
                  System.out.println("one");
                  
              }break;
              case 2:{
                  System.out.println("two");
                  
              }break;
              case 3:{
                  System.out.println("three");
                  
              }break;
              case 4:{
                  System.out.println("four");
                  
              }break;
              case 5:{
                  System.out.println("five");
              
                  
              }break;
              case 6:{
                  System.out.println("six");
                  
              }break;
              case 7:{
                  System.out.println("seven");
                  
              }break;
              case 8:{
                  System.out.println("eight");
                  
              }break;
              case 9:{
                  System.out.println("nine");
                  
              }break;
              
              default:{
                  System.out.println("unknown digit");
              }
          }
          if(result < 0)break;
      }
        
    }
    
}
