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
  public void setSexo(char sexo) //pega o sexo  
 {
 this.sexo = sexo;
 }   
 public char getSexo() //Devolve o sexo
 {
 return this.sexo = sexo;
 }
  public void setImc(double imc) //pega o imc  
 {
 this.imc = imc;
 }   
 public double getImc() //Devolve o imc
 {
 return this.imc = imc;
 }
  public void setCategoria(String categoria) //pega a categoria  
 {
 this.categoria = categoria;
 }   
 public String getCategoria() //Devolve a categoria
 {
 return this.categoria = categoria;
 }

//calcular o IMC
public void CalculoDoImc(){
 this.imc =  this.peso / Math.pow(this.altura, 2);  
}  
//calcular a categoria
public void classificacao() {
if(this.sexo == 'M'){
    //Masculino
    if(this.imc < 20.7 ) {
        this.categoria = "Abaixo do peso!";
    } else if(this.imc < 26.4 ) {
        this.categoria = "Peso ideal!";
    } else if(this.imc < 27.8 ) {
        this.categoria = "Pouco acima do peso!";
    } else if(this.imc < 31.1 ) {
        this.categoria = "Acima do peso!";
} else{
        this.categoria = "Obesidade!";
    } 
}
    else {
    //Feminino
       if(this.imc < 19.1 ) {
        this.categoria = "Abaixo do peso!";
    } else if(this.imc < 25.8 ) {
        this.categoria = "Peso ideal!";
    } else if(this.imc < 27.3 ) {
        this.categoria = "Pouco acima do peso!";
    } else if(this.imc < 32.3 ) {
        this.categoria = "Acima do peso!";
    } else{
        this.categoria = "Obesidade!";
    } 
         }              
                             }
}
