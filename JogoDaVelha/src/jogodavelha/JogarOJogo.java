//Regra de negocio/Logica
package jogodavelha;

public class JogarOJogo {
    //Variaveis de instancia
    private int jv[][] = new int[3][3];
    private int jogadorDaVez;
    private int quemGanhou;
    
//Construtor *colocar os valores iniciais no construtor*    
public void JogarOJogo(){
    reset();
  }  
public void reset(){
 
    //linha 0 *atribui 0 a primeira linha
    this.jv[0][0]     = 0;
    this.jv[0][1]     = 0;
    this.jv[0][2]     = 0;
    
    //linha 1 *atribui 0 a segunda linha
    this.jv[1][0]     = 0;
    this.jv[1][1]     = 0;
    this.jv[1][2]     = 0;
    
    //linha 2 *atribui 0 a terceira linha
    this.jv[2][0]     = 0;
    this.jv[2][1]     = 0;
    this.jv[2][2]     = 0;
    
 
    this.jogadorDaVez = 1;  //Jogo comeca com o jogador 1/X 
    this.quemGanhou   = 0;   //Quem ganhou comeca ZERADO

}
//metodos modificadores / acessores
    // set´s / get´s

//set´s e get´s para todos os indices da matriz
//linha 1 
public void setJV_00(int jv_00){ this.jv[0][0] = jv_00;}
public int getJV_00(){  return this.jv[0][0]; }
public void setJV_01(int jv_00){ this.jv[0][1] = jv_00;}
public int getJV_01(){  return this.jv[0][1]; }
public void setJV_02(int jv_00){ this.jv[0][2] = jv_00;}
public int getJV_02(){  return this.jv[0][2]; }

//linha 2
public void setJV_10(int jv_00){ this.jv[1][0] = jv_00;}
public int getJV_10(){  return this.jv[1][0]; }
public void setJV_11(int jv_00){ this.jv[1][1] = jv_00;}
public int getJV_11(){  return this.jv[1][1]; }
public void setJV_12(int jv_00){ this.jv[1][2] = jv_00;}
public int getJV_12(){  return this.jv[1][2]; }

//linha 3
public void setJV_20(int jv_00){ this.jv[2][0] = jv_00;}
public int getJV_20(){  return this.jv[2][0]; }
public void setJV_21(int jv_00){ this.jv[2][1] = jv_00;}
public int getJV_21(){  return this.jv[2][1]; }
public void setJV_22(int jv_00){ this.jv[2][2] = jv_00;}
public int getJV_22(){  return this.jv[2][2]; }

//set´s e get´s para variaveis de negocio
    public void setjogadorDaVez(int jogadorDaVez){ //Pega o jogador da vez
           this.jogadorDaVez = jogadorDaVez;
    }
    public int getJogadorDaVez(){ //devolve o jogador da vez
        return this.jogadorDaVez;
    }
    public void setquemGanhou(int quemGanhou){// pega quem ganhou
        this.quemGanhou = quemGanhou;
    }
    public int getquemGanhou(){//devolve quem ganhou
        return this.quemGanhou;
    }
    
//
    public void jogadorDaVez(){
    if (this.jogadorDaVez ==1){
    this.jogadorDaVez = 2;
    }else{
        this.jogadorDaVez = 1;
    }
    }
   public void verificarVencedor(){
    this.quemGanhou = 0;
    //Verificar se X/1 ganhou
    //Horizontal-
    if ((getJV_00() == 1 && getJV_01() == 1 && getJV_02() == 1) ||
       (getJV_10() == 1 && getJV_11() == 1 && getJV_12() == 1) ||
       (getJV_20() == 1 && getJV_21() == 1 && getJV_22() == 1)) {
       this.quemGanhou = 1;
        }
    //Vertical
     if ((getJV_00() == 1 && getJV_10() == 1 && getJV_20() == 1) ||
        (getJV_01() == 1 && getJV_11() == 1 && getJV_21() == 1) ||
        (getJV_02() == 1 && getJV_12() == 1 && getJV_22() == 1)) {
        this.quemGanhou = 1;
        }
    //Diagonal 
       if ((getJV_00() == 1 && getJV_11() == 1 && getJV_22() == 1) ||
          (getJV_20() == 1 && getJV_11() == 1 && getJV_02() == 1)) {
          this.quemGanhou = 1;
        }
    //Verificar se O/2 ganhou
     //Horizontal-
    if ((getJV_00() == 2 && getJV_01() == 2 && getJV_02() == 2) ||
       (getJV_10() == 2 && getJV_11() == 2 && getJV_12() == 2) ||
       (getJV_20() == 2 && getJV_21() == 2 && getJV_22() == 2)) {
       this.quemGanhou = 2;
        }
    //Vertical
     if ((getJV_00() == 2 && getJV_10() == 2 && getJV_20() == 2) ||
        (getJV_01() == 2 && getJV_11() == 2 && getJV_21() == 2) ||
        (getJV_02() == 2 && getJV_12() == 2 && getJV_22() == 2)) {
        this.quemGanhou = 2;
        }
    //Diagonal 
       if ((getJV_00() == 2 && getJV_11() == 2 && getJV_22() == 2) ||
          (getJV_20() == 2 && getJV_11() == 2 && getJV_02() == 2)) {
          this.quemGanhou = 2;
        }
    
    }
    
    
    
}
