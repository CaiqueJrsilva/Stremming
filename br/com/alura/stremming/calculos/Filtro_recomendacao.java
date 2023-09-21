package br.com.alura.stremming.calculos;

public class Filtro_recomendacao  {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao()>=4){
            System.out.println("Esta recomendado entre os favoritos");
        } else if (classificavel.getClassificacao()>=2) {
            System.out.println("Esta bem classificado no momento ");
        }else{
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }

}
