//Regra de negocio/Lógica do programa
package imc;

public class CalcularImc {
    //Variaveis de isntancia de entrada
     private double peso;
     private double altura;
     private char   sexo;
     
    //Variaveis de instancia de saida
    double imc;
    String categoria;
    
    //Construtor *colocar os valores iniciais no construtor*
    public void  CalcularImc(){
    this.peso      = 0;   //tipo get e set
    this.altura    = 0;   //tipo get e set
    this.sexo      = 0;   //tipo get e set
    this.imc       = 'M'; //usar aspas simples e deve ter algo dentro *tipo get*
    this.categoria = "";  //tipo get
    }
    //metodos modificadores / acessores
    // set´s / get´s
 public void setPeso(double peso) //pega o peso  
 {
 this.peso = peso;
 }   
 public double getPeso() //Devolve o peso
 {
 return this.peso = peso;
 }
  public void setAltura(double altura) //pega a altura  
 {
 this.altura = altura;
 }   
 public double getAltura() //Devolve a altura
 {
 return this.altura = altura;
 }
 /*
//calcular o IMC
private  CalcularImc(){
 imc =  this.peso / (this.altura * this.altura);  
}   
//calcular a categoria
private void CalcularCategoria() {
if(imc <= 16.00){
    System.out.println("Baixo grau III");
} 
else if( imc > 16.00 && imc <= 16.99 ){
    System.out.println("Baixo grau II");
}*/


   
}  


