
package calc;

public class ThreadSub extends Thread{
      private int a, b, res;
    
    public ThreadSub (int a, int b) {
         this.a = a;
         this.b = b;
         
    }
    public void run(){
    res = a - b;
    System.out.println(a + " - " + b + " = " + res);
    }
}

