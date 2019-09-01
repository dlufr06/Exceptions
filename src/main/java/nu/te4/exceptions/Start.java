/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.exceptions;

import java.math.BigDecimal;

/**
 *
 * @author Daniel
 */
public class Start {
    
    public static void main(String[] args) {
       // devideByZero();
        //bigDecimalNumber();
        //indexOutOfBounds();
        //classCastException();
        //illegalArguemtException();
        //nullPointerException();
        //nullFormatException();
    }

    private static void devideByZero() {
        int a =1; 
        int b =0;
        System.out.println(String.format("%d delat med %d är %d",a,b,(a/b)));
    }

    private static void bigDecimalNumber() {
           BigDecimal a = BigDecimal.valueOf(1);
           BigDecimal b = BigDecimal.valueOf(3);
           System.out.println("1/3 = "+a.divide(b));
    }

    private static void indexOutOfBounds() {
        int[] array = {1,2,3,4,5,6};
        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void classCastException() {
        String a = "ETT";
        Object b = a; //Object är superklass till allt
        int c = (int)b;
    }

    private static void illegalArguemtException() {
        char[] c = Character.toChars(-1);
        System.out.println("c: "+c);
    }

    private static void nullPointerException() {
        MinKlass klass = null; 
        klass.metod();
    }

    private static void nullFormatException() {
        int age = Integer.parseInt("KALLE");
        System.out.println("Age: "+age);
    }
    
}
