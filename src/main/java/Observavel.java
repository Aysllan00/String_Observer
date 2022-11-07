import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel{

    private String texto;
    private int cp, cpp, cpm;
    private List<Observador> clientes;

    public Observavel() {
        clientes = new ArrayList<Observador>();
    }

    private void contarPalavras(String text) {
        String[] parts = text.split(" ");
        int contar = parts.length;
        this.cp = contar;
    }

    private void contarPalavrasPares(String text) {
        String[] parts = text.split(" ");
        int pares = 0;
        int contar = parts.length;
        for (int i = 0; i < contar; i++){
            if(parts[i].length() % 2 == 0){
                pares++;
            }
        }
        this.cpp = pares;
    }

    private void contarPalavrasMaiusculas(String text) {
        int maiusculas = 0;
        for (int i = 0; i < text.length(); i++) { // para todos os caracteres da string
            char c = text.charAt(i); // pegar o caractere
            if (Character.isUpperCase(c)) {
                maiusculas++;
            }
        }
        this.cpm = maiusculas;
    }

    public void executarFuncoes(String texto){
        contarPalavras(texto);
        contarPalavrasPares(texto);
        contarPalavrasMaiusculas(texto);
        notificaObservadores();
    }

    @Override
    public void registraObservador(Observador obs) {
        clientes.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if(clientes.contains(obs))
            clientes.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : clientes) { //for it
            observador.update(this);
        }
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getCpp() {
        return cpp;
    }

    public void setCpp(int cpp) {
        this.cpp = cpp;
    }

    public int getCpm() {
        return cpm;
    }

    public void setCpm(int cpm) {
        this.cpm = cpm;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Observador> getClientes() {
        return clientes;
    }

    public void setClientes(List<Observador> clientes) {
        this.clientes = clientes;
    }
}
