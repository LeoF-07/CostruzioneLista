package costruzione_lista;

public enum Opzione {

    EXIT(0, "Termina programma"),

    INSERIMENTO_IN_TESTA(1, "Inserisci elemento in testa"),
    INSERIMENTO_IN_CODA(2, "Inserisci elemento in coda"),
    INSERIMENTO_IN_UNA_POSIZIONE(3, "Inserisci elemento in una posizione"),

    RIMOZIONE_IN_TESTA(4, "Rimuovi elemento in testa"),
    RIMOZIONE_IN_CODA(5, "Rimuovi elemento in coda"),
    RIMOZIONE_IN_UNA_POSIZIONE(6, "Rimuovi elemento in una posizione"),

    STAMPA_LISTA(7, "Stampa il contenuto della lista"),

    POPOLA(8, "Popola la lista con gli elementi default");

    int numeroOpzione;
    String descrizione;

    Opzione(int numeroOpzione, String descrizione){
        this.numeroOpzione = numeroOpzione;
        this.descrizione = descrizione;
    }

}
