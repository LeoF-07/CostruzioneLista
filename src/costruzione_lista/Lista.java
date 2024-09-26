package costruzione_lista;

public class Lista {

    private Nodo head;
    private Nodo tmp;
    private Nodo p;
    private Nodo s;

    public Lista(){
        head = null;
    }

    public void inserimentoInTesta(Invitato invitato){
        Invitato invitatoClonato;
        try {
            invitatoClonato = (Invitato) invitato.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Errore");
            return;
        }
        Nodo newNodo = new Nodo(invitatoClonato, head);
        head = newNodo;
    }

    public void inserimentoInCoda(Invitato invitato){
        tmp = head;

        while(tmp.getLink() != null){
            tmp = tmp.getLink();
        }
        
        Invitato invitatoClonato;
        try {
            invitatoClonato = (Invitato) invitato.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Errore");
            return;
        }
        Nodo nuovoNodo = new Nodo(invitatoClonato, null);
        tmp.setLink(nuovoNodo);
    }
    
    public void add(Invitato invitato, int posizione){
        if(posizione == 1) {
            inserimentoInTesta(invitato);
            return;
        }
        
        if(posizione > count()){
            inserimentoInCoda(invitato);
            return;
        }

        if(posizione < 1){
            System.out.println("Inserimento fallito (posizione < 1)");
            return;
        }
        
        p = head;
        s = head.getLink();

        while(posizione - 2 > 0){ // presuppongo che le posizioni partano da 1
            posizione--;
            
            p = s;
            s = s.getLink();
        }

        Invitato invitatoClonato;
        try {
            invitatoClonato = (Invitato) invitato.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Errore");
            return;
        }
        
        Nodo newNodo = new Nodo(invitatoClonato, s);
        p.setLink(newNodo);
    }

    public Invitato rimozioneInTesta(){
        if(head == null){ // oppure count() == 0
            System.out.println("La lista è vuota");
            return null;
        }
        
        Nodo nodoDaRimuovere = head;
        head = nodoDaRimuovere.getLink();
        return nodoDaRimuovere.getInvitato();
    }

    public Invitato rimozioneInCoda(){
        if(count() == 1) return rimozioneInTesta();
        
        
        /*Oppure:
        
        if(count() == 1){
            Nodo nodoDaRimuovere = head;
            head = null;
            return nodoDaRimuovere.getInvitato();
        }
        
        */
        
        
        p = head;
        s = head;

        while(s.getLink() != null){
            p = s;
            s = s.getLink();
        }

        Nodo nodoDaRimuovere = s;
        p.setLink(null);
        return nodoDaRimuovere.getInvitato();
    }

    public Invitato remove(int posizione){
        if(posizione == 1) return rimozioneInTesta();
        if(posizione == count()) return rimozioneInCoda();

        p = head;
        s = head.getLink().getLink();

        while(posizione - 2 > 0){ // presuppongo che le posizioni partano da 1
            posizione--;
            
            if(s == null) {
                System.out.println("Rimozione fallita");
                return null;
            }

            p = p.getLink();
            s = s.getLink();
        }

        Nodo nodoDaRimuovere = p.getLink();
        p.setLink(s);
        return nodoDaRimuovere.getInvitato();
    }
    
    public int count(){
        int numeroElementi = 0;
        Nodo nodo = head;
        
        while(nodo != null) {
            nodo = nodo.getLink();
            numeroElementi++;
        }
        
        return numeroElementi;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    @Override
    public String toString() {
        String s = "Lista:";

        if(head == null){
            s += "\nVuota";
            return s;
        }

        Nodo nodo = head;
        for (int i = 0; nodo != null; i++){
            s += "\n\n" + (i + 1) + ") " + nodo.toString();
            nodo = nodo.getLink();
        }

        return s;
    }

}
