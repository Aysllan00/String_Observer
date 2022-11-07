public class Texto {

    public static void main(String[] args) {

        Observavel texto = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        texto.registraObservador(obs1);
        texto.registraObservador(obs2);
        texto.registraObservador(obs3);

        texto.executarFuncoes("Teste para Dividir as Palavras.");

    }
}
