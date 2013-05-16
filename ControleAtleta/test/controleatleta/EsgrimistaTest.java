package controleatleta;


import org.junit.Test;
import static org.junit.Assert.*;


public class EsgrimistaTest {
        
    Esgrimista instancia = new Esgrimista("Teste");
    
  
    @Test
    public void testSetEstilo() {
        char estilo = 'E';
        instancia.setEstilo(estilo);
        assertEquals('E', instancia.getEstilo());
    }
}