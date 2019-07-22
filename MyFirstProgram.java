/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstprogram;

// @author stpap
public class MyFirstProgram1 {

    // @param args the command line arguments
    public static void main(String[] args) {
        boolean isTrue = true; //False
        char letter1 = '\u03B6';
        char letter2 = 71;
		
        //!
        byte  x1= 127;
        short x2 = 16;
        long x3 = 3000000000l;
        int x4 = 300000000;
        
        //dem
        float y1 = 32.0f;
        double y2 = 64.0;

        
       //Make 2 variables.
       //Add them and save the result in variable sum
       //print the result
       int a;
       a = 10;
       System.out.println("a value is "+a);
       float x = 2.4f;
       int y = (int) x;
       byte sum = (byte) (x + y);
       System.out.println("y is "+ y);
       System.out.println("int x is "+x);
       
       int newNumber = 10%3;
       float division = 14/3.0f;
       System.out.println("division is: " + division);
       System.out.println("new Number is: " + newNumber);
       
       

    }
}
