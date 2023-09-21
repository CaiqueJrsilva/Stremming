import br.com.alura.stremming.modelos.Filme;
import br.com.alura.stremming.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Elementos");
        meuFilme.setAnoDeLançamento(2023);
        meuFilme.setDuracaoEmMinutos(244);
        System.out.println("Duração do filme  :"+ meuFilme.getDuracaoEmMinutos());

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
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());

    }
}
