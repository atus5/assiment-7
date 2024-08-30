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

    public float input(float[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextFloat();
        }
        return 0;

    }

    public void output(float[] array) {

        System.out.println("Mang ban vua nhap: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phan tu thu " + i + 1 + " : " + array[i]);
        }
    }

    public float findMax2(float[] array) {
        Arrays.sort(array);
        float max2 = array[array.length - 2];
        System.out.println("MAX 2: " + max2);
        return max2;

    }

    public void deleteOddNumber(float[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if ((int) array[i] % 2 == 0) {
                array[index] = array[i];
                index++;
            }
            
        }
        for (int i = 0; i < index; i++) {
            System.out.println(array[i]);
            
        }

    }
}
