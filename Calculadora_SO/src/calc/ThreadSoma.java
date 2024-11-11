/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc;

/**
 *
 * @author Professor
 */
public class ThreadSoma extends Thread{
      private int a, b, res;
    
    public ThreadSoma (int a, int b) {
         this.a = a;
         this.b = b;
         
    }
    public void run(){
    res = a + b;
    System.out.println(a + " + " + b + " = " + res);
    }
}