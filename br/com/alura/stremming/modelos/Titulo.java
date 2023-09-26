package br.com.alura.stremming.modelos;

import br.com.alura.stremming.excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLançamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;

    public Titulo(String nome, int anoDeLançamento) {
        this.nome = nome;
        this.anoDeLançamento = anoDeLançamento;
    }

    public Titulo(TituloOmbd tituloOmbd) {
        this.nome = tituloOmbd.title();
        if(tituloOmbd.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano , pois ha mais de 4 caracteres");
        }
            this.anoDeLançamento = Integer.valueOf(tituloOmbd.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmbd.runtime().substring(0,3));
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLançamento);
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return  this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome=" + nome + '\'' +
                ", anoDeLançamento=" + anoDeLançamento +
                ", duracaoEmMinutos=" + duracaoEmMinutos ;
    }


}
