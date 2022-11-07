import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestObserver {

    @Test
    public void testeInscritos(){
        Observavel texto = new Observavel();
        Observador obs1 = new Observador(1);
        texto.registraObservador(obs1);
        assertTrue(!texto.getClientes().isEmpty());
    }

    @Test
    public void teste3Inscritos(){
        Observavel texto = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);
        texto.registraObservador(obs1);
        texto.registraObservador(obs2);
        texto.registraObservador(obs3);
        assertEquals(texto.getClientes().size(), 3);
    }

    @Test
    public void teste2Inscritos(){
        Observavel texto = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);
        texto.registraObservador(obs1);
        texto.registraObservador(obs2);
        texto.registraObservador(obs3);

        texto.removeObservador(obs2);
        assertEquals(texto.getClientes().size(), 2);
    }

    @Test
    public void testeContaPalavras(){
        Observavel texto = new Observavel();
        Observador obs1 = new Observador(1);
        texto.registraObservador(obs1);
        texto.executarFuncoes("Rato roeu a roupa do rei de Roma");

        assertEquals(texto.getCp(), 8);
    }

    @Test
    public void testeContaPalavrasPares(){
        Observavel texto = new Observavel();
        Observador obs1 = new Observador(1);
        texto.registraObservador(obs1);
        texto.executarFuncoes("Rato roeu a roupa do rei de Roma");

        assertEquals(texto.getCpp(), 5);
    }

    @Test
    public void testeContaPalavrasMaiusculas(){
        Observavel texto = new Observavel();
        Observador obs1 = new Observador(1);
        texto.registraObservador(obs1);
        texto.executarFuncoes("Rato Roeu a Roupa do rei de Roma");

        assertEquals(texto.getCpm(), 4);
    }
}
