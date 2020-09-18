package exercicios.exercicio01;

import java.util.Stack;

public class Exercicio01 {

    public static void main(String[] args) {
        

        Stack<Character> pilha = new Stack<>();
        
        String frase = "ESTE EXERCICIO E MUITO FACIL";

        
        for (int i = 0; i < frase.length(); i ++)
        {
            pilha.push(frase.charAt(i));
        }


        // do {
        //     pilha.push(frase).charAt(0);
        // }
        // while (frase.length() != 0);
        

        while (! pilha.isEmpty())
        {
            System.out.print(pilha.pop());
        }

        System.out.println("\n");

    }
    
}
