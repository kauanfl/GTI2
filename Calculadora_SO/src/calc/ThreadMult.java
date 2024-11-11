
package calc;


public class ThreadMult extends Thread{
      private int a, b, res;
    
    public ThreadMult (int a, int b) {
         this.a = a;
         this.b = b;
         
    }
    public void run(){
    res = a * b;
    System.out.println(a + " * " + b + " = " + res);
    }
}
