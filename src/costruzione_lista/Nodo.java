package costruzione_lista;

public class Nodo {

    private Invitato invitato;
    private Nodo link;

    public Nodo(Invitato invitato, Nodo link) {
        setInvitato(invitato);
        setLink(link);
    }

    public Nodo() {
        setInvitato(null);
        setLink(null);
    }

    public Invitato getInvitato() {
        return invitato;
    }

    public void setInvitato(Invitato invitato) {
        this.invitato = invitato;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

}
