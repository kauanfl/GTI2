
package calc;

public class ThreadDiv extends Thread{
    private int a, b, res;
    
    public ThreadDiv (int a, int b) {
         this.a = a;
         this.b = b;
         
    }
    
    public void run(){
       if (b != 0){
         res = a/b;
        System.out.println(a + " / " + b + " = " + res);
       } else {
        System.out.println("Erro: Divisão por Zero!");
       }
    }
}
