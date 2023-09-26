package br.com.alura.stremming.principal;

import br.com.alura.stremming.modelos.Filme;
import br.com.alura.stremming.modelos.Serie;
import br.com.alura.stremming.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        var meuFilme = new Filme("Elementos",2023);
        var lost = new Serie("Lost",2000);
        var filmeDoCaique = new Filme("Jack Richer : contra o tempo",2020);
        var outroFilme = new Filme("Avatar",2023);
        var favorito = new Filme("Matriz", 1999);
        favorito.avalia(10);

        var outro = new Filme("Jon Wick", 2014);
        outro.avalia(9);

        var serie = new Serie("La casa de papel", 2017);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoCaique);
        lista.add(lost);
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);
        for (Titulo item: lista){
            System.out.println(item);
            if(item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("Classificação :" + filme.getClassificacao());
            }else{
                System.out.println("nada");
            }
        }

        System.out.println("Lista ordenada de titulos de filmes :");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLançamento));
        System.out.println(lista);




    }
}
