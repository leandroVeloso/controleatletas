package controleatleta;

import java.util.ArrayList;

public class Esgrimista extends Atleta {

    private char categoria; // E = Elétrica M = Muda
    private char arma; // F = Florete E = Espada S = Sabre
    private char estilo; // E = Esgrima Elétrica T = Esgrima Tradicional
    private ArrayList<Premiacao> premiacoes;
    private int equipe; // 1 = Individual 3 = 3 participantes 4 = 4 participantes
    private String numeroConfederacao;
    private int totalLutas;
    private int totalVitorias;
    private int totalToquesNaoValidos;
    private int totalBarrages;
    private int totalDerrotas; 
    
    public char getCategoria() {
        return categoria;
    }

    public String getNumeroConfederacao() {
        return numeroConfederacao;
    }

    public void setNumeroConfederacao(String numeroConfederacao) {
        this.numeroConfederacao = numeroConfederacao;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    public int getTotalToquesNaoValidos() {
        return totalToquesNaoValidos;
    }

    public void setTotalToquesNaoValidos(int totalToquesNaoValidos) {
        this.totalToquesNaoValidos = totalToquesNaoValidos;
    }
       

    public int getTotalBarrages() {
        return totalBarrages;
    }

    public void setTotalBarrages(int totalBarrages) {
        this.totalBarrages = totalBarrages;
    }

    public int getTotalDesistencias() {
        return totalDesistencias;
    }

    public void setTotalDesistencias(int totalDesistencias) {
        this.totalDesistencias = totalDesistencias;
    }
    private int totalDesistencias;

   
    public Esgrimista(String nome) {
        super(nome);
    }

    public char getArma() {
        return arma;
    }

    public void setArma(char arma) {
        this.arma = arma;
    }
    
    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int derrotas) {
        this.totalDerrotas = derrotas;
    }

    public int getTotalEmpates() {
        return totalBarrages;
    }

    public void setTotalEmpates(int empates) {
        this.totalBarrages = empates;
    }

    public char getEstilo() {
        return estilo;
    }

    public void setEstilo(char estilo) {
        this.estilo = estilo;
    }

    public int getTotalLutas() {
        return totalLutas;
    }

    public void setTotalLutas(int numLutas) {
        this.totalLutas = numLutas;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int vitorias) {
        this.totalVitorias = vitorias;
    }

}