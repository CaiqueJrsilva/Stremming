package br.com.alura.stremming.principal;

import br.com.alura.stremming.calculos.CalculadoraDeTempo;
import br.com.alura.stremming.calculos.Filtro_recomendacao;
import br.com.alura.stremming.modelos.Episodio;
import br.com.alura.stremming.modelos.Filme;
import br.com.alura.stremming.modelos.Serie;
import br.com.alura.stremming.modelos.Titulo;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        var meuFilme = new Filme("Elementos",2023);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9.8);
        meuFilme.avalia(6.8);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações :"+ meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        var lost = new Serie("Lost",2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost : " + lost.getDuracaoEmMinutos());

        var outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(180);
        outroFilme.setIncluidoNoPlano(true);



        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Filtro_recomendacao filtro = new Filtro_recomendacao();
        filtro.filtra(meuFilme);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoCaique = new Filme("Jack Richer : contra o tempo",2020);
        filmeDoCaique.setDuracaoEmMinutos(140);
        filmeDoCaique.setIncluidoNoPlano(true);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoCaique);
        lista.add(lost);
        System.out.println("Tamanho da lista :"+ lista.size());
        System.out.println("Primeiro filme :"+lista.get(0).getNome());
        System.out.println(lista);
        System.out.println(lista.get(0).toString());
    }
}
