package controleatleta;

public class Esgrimista extends Atleta {

    private char categoria; // E = Elétrica M = Muda
    private char arma; // F = Florete E = Espada S = Sabre
    private char estilo; // E = Esgrima Elétrica T = Esgrima Tradicional
    private String numeroConfederacao;
    private int totalToquesNaoValidos;
    
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
    
    public char getEstilo() {
        return estilo;
    }

    public void setEstilo(char estilo) {
        this.estilo = estilo;
    }

}