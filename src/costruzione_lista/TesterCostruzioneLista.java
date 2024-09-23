package costruzione_lista;

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

        /*lista.inserimentoInTesta(mattia);

        lista.add(antonio, 3);

        lista.rimozioneInTesta();
        lista.rimozioneInCoda();
        lista.remove(2);*/
        
        //lista.remove(5);

        System.out.println(lista.toString());
    }

}