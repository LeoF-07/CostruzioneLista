package costruzione_lista;

public class Invitato {

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
    public String toString() {
        return "Invitato:\n" + "Nome: " + getNome() + "\nCognome: " + getCognome();
    }
}
