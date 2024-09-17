package costruzione_lista;

public class Invitato implements Cloneable {

    private String nome;
    private String cognome;

    public Invitato(String nome, String cognome) {
        setNome(nome);
        setCognome(cognome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Invitato:\n" + "Nome: " + getNome() + "\nCognome: " + getCognome();
    }
}
