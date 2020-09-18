package exemplos;

import java.util.Stack;

public class Pilha {

    /*
     * 
     * Tipos básicos    Classe que representa o tipo
     * 
     * char             Character
     * int              Integer 
     * float            Float            
     * double           Double
     * boolean          Boolean
     * 
     */
    
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();

        //empilhar os valores
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        
        //while (pilha.isEmpty() != true) ou while (pilha.isEmpty() == false)
        while (!pilha.isEmpty()) { //enquanto a pilha não estiver vazia
            int numero = pilha.pop(); //desempilha
            System.out.println(numero); //exibe o número que foi desimpilhado
            //System.out.println(pilha.pop());
        }
    }

}