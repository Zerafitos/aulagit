package exemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Comparaceos {

    public static void main(String[] args) {
        

        ArrayList<Produto> lista = new ArrayList<>();
        HashSet<Produto> listaunica = new HashSet<>();
        HashMap<Integer, Produto> mapa = new HashMap<>();

        Produto p1 = new Produto (111, "Produto1");
        Produto p2 = new Produto (222, "Produto2");
        Produto p3 = new Produto (3, "Produto3");
        Produto p4 = new Produto (4, "Produto4");

        //lista permite duplicar conteúdos
        lista.add(p1);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        System.out.println(lista); // p1.toString()
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println();

        //listaunica não permite duplicar conteúdos
        listaunica.add(p1);
        listaunica.add(p1);
        listaunica.add(p2);
        listaunica.add(p3);
        listaunica.add(p4);


        System.out.println(listaunica);
        System.out.println("Tamanho da lista: "+ listaunica.size());
        System.out.println();

        //mapa não permite duplicar chaves
        mapa.put(p1.getCodigo(), p1);
        mapa.put(p2.getCodigo(), p2);
        mapa.put(p3.getCodigo(), p3);
        mapa.put(p4.getCodigo(), p4);
        


        System.out.println("Tamanho da lista: "+ mapa.size());
        //System.out.println(mapa);
        for (Integer key : mapa.keySet()) {
            System.out.println("Elemento do mapa na chave " + key + " : " + mapa.get(key));
        }
        

        //Get retorna o elemento com a chave informada
        //não é necessário fazer buscas na estrutura
        System.out.println("Produto 111: " + mapa.get(111));

    }


    
    
}
