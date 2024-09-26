package costruzione_lista;

import java.util.Scanner;

public class TesterCostruzioneLista {

    static Lista lista;

    public static void inizializzazioneVariabili(){
        lista = new Lista();
    }

    public static void main(String[] args) {
        //Lista lista = new Lista();

        /*Invitato leo = new Invitato("Leo", "F");
        Invitato guido = new Invitato("Guido", "M");
        Invitato michele = new Invitato("Michele", "B");
        Invitato antonio = new Invitato("Antonio", "F");
        Invitato mattia = new Invitato("Mattia", "G");

        lista.inserimentoInTesta(leo);
        lista.inserimentoInTesta(guido);

        lista.inserimentoInCoda(michele);
        lista.inserimentoInTesta(antonio);
        lista.add(mattia, 4);

        lista.inserimentoInTesta(mattia);

        lista.add(antonio, 3);

        lista.rimozioneInTesta();
        lista.rimozioneInCoda();
        lista.remove(2);
        
        lista.remove(5);

        System.out.println(lista.toString());*/


        descrizione();
        inizializzazioneVariabili();

        int scelta;
        do{
            stampaMenu();
            scelta = chiediIntero("Fai una scelta: ");
            esegui(scelta);
        }while(scelta != Opzione.EXIT.numeroOpzione);

        System.out.println("Programma terminato");
    }

    public static void descrizione(){
        System.out.println("Implementazione lista");
    }

    public static void esegui(int scelta){
        Opzione opzione;
        try{
            opzione = Opzione.values()[scelta];
        }catch(ArrayIndexOutOfBoundsException ex){
            return;
        }



        Invitato invitato;
        int posizione;


        switch (opzione){

            case EXIT:
                break;

            case INSERIMENTO_IN_TESTA:
                invitato = creaInvitato();
                lista.inserimentoInTesta(invitato);
                break;

            case INSERIMENTO_IN_CODA:
                invitato = creaInvitato();
                lista.inserimentoInCoda(invitato);
                break;

            case INSERIMENTO_IN_UNA_POSIZIONE:
                invitato = creaInvitato();
                posizione = chiediIntero("Inserisci la posizione: ");
                lista.add(invitato, posizione);
                break;

            case RIMOZIONE_IN_TESTA:
                invitato = lista.rimozioneInTesta();
                System.out.println("Invitato rimosso:\n" + invitato.toString());
                break;

            case RIMOZIONE_IN_CODA:
                invitato = lista.rimozioneInCoda();
                System.out.println("Invitato rimosso:\n" + invitato.toString());
                break;

            case RIMOZIONE_IN_UNA_POSIZIONE:
                posizione = chiediIntero("Inserisci la posizione: ");
                invitato = lista.remove(posizione);
                System.out.println("Invitato rimosso:\n" + invitato.toString());
                break;

            case STAMPA_LISTA:
                System.out.println(lista.toString());
                break;
                
        }
    }

    public static void stampaMenu(){
        for (Opzione opzione : Opzione.values()){
            System.out.println(opzione.numeroOpzione + ". " + opzione.descrizione);
        }
    }

    public static Invitato creaInvitato(){
        System.out.println("Creazione invitato:\n");

        String nome = chiediStringa("Inserisci il nome: ");
        String cognome = chiediStringa("Inserisci il cognome: ");

        return new Invitato(nome, cognome);
    }

    public static int chiediIntero(String messaggio){
        Scanner kbd = new Scanner(System.in);
        System.out.print(messaggio);
        return kbd.nextInt();
    }

    public static String chiediStringa(String messaggio){
        Scanner kbd = new Scanner(System.in);
        System.out.print(messaggio);
        return kbd.next();
    }

}