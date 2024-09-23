package costruzione_lista;

import java.util.Scanner;

public class TesterCostruzioneLista {

    public static void main(String[] args) {
        Lista lista = new Lista();

        Invitato leo = new Invitato("Leo", "F");
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

        System.out.println(lista.toString());



        /*descrizione();

        int scelta;
        do{
            stampaMenu();
            scelta = chiediIntero("Fai una scelta: ");
            esegui(scelta);
        }while(scelta != 0);

        System.out.println("Programma terminato");*/
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

        switch (opzione){
            case EXIT:
                break;
            case INSERIMENTO_IN_TESTA:
                break;
            case INSERIMENTO_IN_CODA:
                break;
            case INSERIMENTO_IN_UNA_POSIZIONE:
                break;
            case RIMOZIONE_IN_TESTA:
                break;
            case RIMOZIONE_IN_CODA:
                break;
            case RIMOZIONE_IN_UNA_POSIZIONE:
                break;
        }
    }

    public static void stampaMenu(){
        for (Opzione opzione : Opzione.values()){
            System.out.println(opzione.numeroOpzione + ". " + opzione.descrizione);
        }
    }

    public static int chiediIntero(String messaggio){
        Scanner kbd = new Scanner(System.in);
        System.out.print(messaggio);
        return kbd.nextInt();
    }

}