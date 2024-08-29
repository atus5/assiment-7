/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment7;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class InputOuput {
    public float input(float[] array){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < array.length; i++){
           array[i] = sc.nextFloat();
        }
        return 0;
        
    }
    public void output(float[] array){
        
        System.out.println("Mang ban vua nhap: ");
        for(int i = 0;i < array.length; i++){
            System.out.println("Phan tu thu " + i+1 + " : " + array[i]);
        }
    }
    public float findMax2(float[] array){
         float max = array[0];
      for(int i=1;i < array.length;i++){
        if(array[i] > max){
          max = array[i];
        }
        
    }
        System.out.println("Max array: " + max);
        return max;
}
   public void deleteOddNumber(float[] array){
       int length = array.length - 1;
       for(int i = array.length - 1;i>=0; i--){
            if(array[i] %2 !=0){
                
                array[i] = array[i+1];
                i--;
                length --;
                
            }
            
            System.out.println("Update: " + array[i]);
        }
   }
}
