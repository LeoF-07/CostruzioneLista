package costruzione_lista;

public class Lista {

    private Nodo head;
    private Nodo tmp;
    private Nodo p;
    private Nodo s;

    public Lista(){
        head = new Nodo();
    }

    public void push(Invitato invitato){
        Nodo newNodo = new Nodo(invitato, head.getLink());
        head.setLink(newNodo);
    }

    public void addLast(Invitato invitato){
        tmp = new Nodo();
        Nodo nodo = head.getLink();

        while(nodo != null){
            tmp = nodo;
            nodo = nodo.getLink();
        }

        Nodo newNodo = new Nodo(invitato, tmp.getLink());
        tmp.setLink(newNodo);
    }

    public void add(Invitato invitato, int posizione){
        p = new Nodo();
        s = new Nodo();
        Nodo nodo = head.getLink();

        for(int i = 0; i < posizione - 1; i++){
            if(nodo.getLink() == null) {
                System.out.println("Inserimento fallito");
                return;
            }

            p = nodo;
            s = nodo.getLink();
            nodo = nodo.getLink();
        }

        Nodo newNodo = new Nodo(invitato, s);
        p.setLink(newNodo);
    }

    public Invitato pop(){
        if(head.getLink() == null){
            System.out.println("La lista è vuota");
            return null;
        }
        Nodo nodoDaRimuovere = head.getLink();
        head.setLink(nodoDaRimuovere.getLink());
        return nodoDaRimuovere.getInvitato();
    }

    public Invitato removeLast(){
        tmp = new Nodo();
        Nodo nodo = head.getLink();

        while(nodo.getLink() != null){
            tmp = nodo;
            nodo = nodo.getLink();
        }

        Nodo nodoDaRimuovere = tmp.getLink();
        tmp.setLink(null);
        return nodoDaRimuovere.getInvitato();
    }

    public Invitato remove(int posizione){
        tmp = new Nodo();
        p = new Nodo();
        s = new Nodo();
        Nodo nodo = head.getLink();

        for(int i = 0; i < posizione - 1; i++){
            if(nodo.getLink() == null) {
                System.out.println("Rimozione fallita");
                return null;
            }

            p = nodo;
            tmp = nodo.getLink();
            s = tmp.getLink();
            nodo = nodo.getLink();
        }

        Nodo nodoDaRimuovere = tmp;
        p.setLink(s);
        return nodoDaRimuovere.getInvitato();
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

        Nodo nodo = head.getLink();
        for (int i = 0; nodo != null; i++){
            Invitato invitato = nodo.getInvitato();
            s += "\n\n" + (i + 1) + ") " + invitato.toString();
            nodo = nodo.getLink();
        }

        return s;
    }

}
