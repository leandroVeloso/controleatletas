package controleatleta;

import java.util.ArrayList;

public class ControleEsgrimista {

    private ArrayList<Esgrimista> listaEsgrimistas;

    public ControleEsgrimista() {
        this.listaEsgrimistas = new ArrayList<Esgrimista>();
    }
    
    public ArrayList<Esgrimista> getListaEsgrimistas() {
        return listaEsgrimistas;
    }
    
    public void adicionar(Esgrimista umEsgrimista) {
        listaEsgrimistas.add(umEsgrimista);
    }
    
    public void remover(Esgrimista umEsgrimista) {
        listaEsgrimistas.remove(umEsgrimista);
    }
    
    public Esgrimista pesquisar(String nome) {
        for (Esgrimista e: listaEsgrimistas) {
            if (e.getNome().equalsIgnoreCase(nome)) return e;
        }
        return null;
    }
}
