import br.com.alura.stremming.calculos.CalculadoraDeTempo;
import br.com.alura.stremming.calculos.Filtro_recomendacao;
import br.com.alura.stremming.modelos.Episodio;
import br.com.alura.stremming.modelos.Filme;
import br.com.alura.stremming.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Elementos");
        meuFilme.setAnoDeLançamento(2023);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9.8);
        meuFilme.avalia(6.8);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações :"+ meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLançamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost : " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        meuFilme.setNome("Avatar");
        meuFilme.setAnoDeLançamento(2023);
        meuFilme.setDuracaoEmMinutos(180);
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

    }
}
