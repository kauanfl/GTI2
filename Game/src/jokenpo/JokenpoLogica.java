package jokenpo;

import java.util.Random;

/*Ola, meu nome é Kauan Ferreira Lemos. Eu escolhi Java por ser a linguagem
que me introduziu a programação, desde o meu primeiro curso na parte de lógica
até hoje na faculdade. Foi um projeto desafiador, pois ainda sou amador no
Java Swing, mas foi muito legal realizá-lo e descobrir coisas novas
a cada etapa.*/

public class JokenpoLogica {
  
    //Entrada de dados
    public String getEscolhaNome(int escolha) {
        if (escolha == 1) {
            return "Pedra";
        } else if (escolha == 2) {
            return "Papel";
        } else if (escolha == 3) {
            return "Tesoura";
        } else {
            return "Escolha Inválida";
        }
    }

    // Determinando o vencedor
       public String determinarVencedor(int jogador, int computador) {
        if (jogador == computador) {
            return "Empate";
        }

        if (jogador == 1) { 
            if (computador == 3) {
                return "Você Ganhou"; 
            } else {
                return "Você Perdeu"; 
            }
        } else if (jogador == 2) { 
            if (computador == 1) { 
                return "Você Ganhou"; 
            } else {
                return "Você Perdeu"; 
            }
        } else if (jogador == 3) {
            if (computador == 2) { 
                return "Você Ganhou";
            } else {
                return "Você Perdeu"; 
            }
        } else {
            return "Jogada inválida";
        }
    }
}
