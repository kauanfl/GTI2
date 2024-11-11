
package calc;

public class Main {
   static int a = 8;
   static int b = 3;
    
   public static void main(String args[]){
    ThreadDiv threadDiv = new ThreadDiv(a,b);
    ThreadMult threadMult = new ThreadMult(a,b);
    ThreadSoma threadSoma = new ThreadSoma(a,b);
    ThreadSub threadSub = new ThreadSub(a,b);
       
       threadDiv.start();
       threadMult.start();
       threadSoma.start();
       threadSub.start();
       
       try{
       threadDiv.join();
       threadMult.join(); 
       threadSoma.join();
       threadSub.join();
       }catch(InterruptedException e){
           e.printStackTrace();
       
       }
       
   }
}
