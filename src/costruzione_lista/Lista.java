package costruzione_lista;

public class Lista {

    private Nodo head;
    private Nodo tmp;
    private Nodo p;
    private Nodo s;

    public Lista(){
        head = null;
    }

    public void push(Invitato invitato){
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

    public void addLast(Invitato invitato){
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
        Nodo newNodo = new Nodo(invitatoClonato, null);
        tmp.setLink(newNodo);
    }
    
    public void add(Invitato invitato, int posizione){
        if(posizione == 1) {
            push(invitato);
            return;
        }
        
        p = head;
        s = head;

        for(int i = 0; i < posizione - 1; i++){
            if(s.getLink() == null) {
                System.out.println("Inserimento fallito");
                return;
            }

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

    public Invitato pop(){
        if(head == null){
            System.out.println("La lista è vuota");
            return null;
        }
        Nodo nodoDaRimuovere = head;
        head = nodoDaRimuovere.getLink();
        return nodoDaRimuovere.getInvitato();
    }

    public Invitato removeLast(){
        if(count() == 1) return pop();
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
        if(posizione == 1) return pop();
        if(posizione == count()) return removeLast();
        
        tmp = head;
        p = head;
        s = head;

        for(int i = 0; i < posizione; i++){
            if(s == null) {
                System.out.println("Rimozione fallita");
                return null;
            }

            p = tmp;
            tmp = s;
            s = s.getLink();
        }

        Nodo nodoDaRimuovere = tmp;
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
        Nodo nodo = head;
        for (int i = 0; nodo != null; i++){
            Invitato invitato = nodo.getInvitato();
            s += "\n\n" + (i + 1) + ") " + invitato.toString();
            nodo = nodo.getLink();
        }

        return s;
    }

}
