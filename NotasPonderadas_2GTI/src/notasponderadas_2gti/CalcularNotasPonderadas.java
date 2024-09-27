//Regras de negocios
package notasponderadas_2gti;

public class CalcularNotasPonderadas {
    //Variaveis de instancia
    //utilizar o conceito de encapsulamento
   private double nota1, nota2, nota3, nota4, nota5;
   private boolean cbNota1, cbNota2, cbNota3, cbNota4, cbNota5;
   private double peso1, peso2, peso3, peso4, peso5;
   private double media, SomaDosPesos;
   private boolean notasPonderadas;
   
   //Construtor
   public void CalcularNotasPonderadas(){
       Limpar();
   }
   public void Limpar(){
   this.cbNota1   = true;
   this.cbNota2   = true;
   this.cbNota3   = true;
   this.cbNota4   = true;
   this.cbNota5   = true;    
   this.nota1        = 0;
   this.nota2        = 0;
   this.nota3        = 0;
   this.nota4        = 0;
   this.nota5        = 0;
   this.peso1        = 0;
   this.peso2        = 0;
   this.peso3        = 0;
   this.peso4        = 0;
   this.peso5        = 0;
   this.media        = 0; 
   this.SomaDosPesos = 0;
   this.notasPonderadas = true;
   
   }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public boolean isCbNota1() {
        return cbNota1;
    }

    public void setCbNota1(boolean cbNota1) {
        this.cbNota1 = cbNota1;
    }

    public boolean isCbNota2() {
        return cbNota2;
    }

    public void setCbNota2(boolean cbNota2) {
        this.cbNota2 = cbNota2;
    }

    public boolean isCbNota3() {
        return cbNota3;
    }

    public void setCbNota3(boolean cbNota3) {
        this.cbNota3 = cbNota3;
    }

    public boolean isCbNota4() {
        return cbNota4;
    }

    public void setCbNota4(boolean cbNota4) {
        this.cbNota4 = cbNota4;
    }

    public boolean isCbNota5() {
        return cbNota5;
    }

    public void setCbNota5(boolean cbNota5) {
        this.cbNota5 = cbNota5;
    }

    public double getPeso1() {
        return peso1;
    }

    public void setPeso1(double peso1) {
        this.peso1 = peso1;
    }

    public double getPeso2() {
        return peso2;
    }

    public void setPeso2(double peso2) {
        this.peso2 = peso2;
    }

    public double getPeso3() {
        return peso3;
    }

    public void setPeso3(double peso3) {
        this.peso3 = peso3;
    }

    public double getPeso4() {
        return peso4;
    }

    public void setPeso4(double peso4) {
        this.peso4 = peso4;
    }

    public double getPeso5() {
        return peso5;
    }

    public void setPeso5(double peso5) {
        this.peso5 = peso5;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getSomaDosPesos() {
        return SomaDosPesos;
    }

    public void setSomaDosPesos(double SomaDosPesos) {
        this.SomaDosPesos = SomaDosPesos;
    }

    public boolean isNotasPonderadas() {
        return notasPonderadas;
    }

    public void setNotasPonderadas(boolean notasPonderadas) {
        this.notasPonderadas = notasPonderadas;
    }

 //Metodos de negocio
    public void calcularMedia() {
        if (isNotasPonderadas() == false){
    this.media = (this.nota1 + this.nota2) / 2;
    } else {
    this.media = ((this.nota1 * this.peso1) + (this.nota2 * this.peso2)) / 10;
    }
  }
}
