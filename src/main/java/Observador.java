public class Observador implements iObservador{

    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel texto) {
        System.out.println("Cliente: "+this.id);
        System.out.println("Contar Palavras: " + texto.getCp());
        System.out.println("Contar Palavras Pares: " + texto.getCpp());
        System.out.println("Contar Palavras Maiusculas: " + texto.getCpm());
    }
}
