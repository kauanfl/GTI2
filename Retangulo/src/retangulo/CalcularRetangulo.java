package retangulo;

public class CalcularRetangulo {
   //Variaveis de instancia
    private double ladoA;
    private double ladoB;
    private double perimetro;
    private double area;
    
    //Construtor
    public void CalcularRetangulo(){
    limpar();
    
    }
    
    public void limpar(){
     this.ladoA     = 0;
     this.ladoB     = 0;
     this.perimetro = 0;
     this.area      = 0;
    }
    //metodos modificadores/acessores
    //metodos set's/get's
    
    //pegar
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    
    //devolver
    public double getLadoA() {
       return this.ladoA;
    }
     //pegar
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    
    //devolver
    public double getLadoB() {
        return this.ladoB;
    }
    public double getPerimetro() {
        return this.perimetro;
    }
    public double getArea() {
        return this.area;
    }
    public void calcularPerimetro() {
      this.perimetro = (this.ladoA * 2) + (this.ladoB * 2);
    }
    public void calcularArea() {
      this.area = this.ladoA * this.ladoB;
    }
}
