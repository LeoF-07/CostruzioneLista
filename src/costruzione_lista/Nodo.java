package costruzione_lista;

public class Nodo {

    private Invitato invitato;
    private Nodo link;

    private boolean linkStampato = false;

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

    public void setLinkStampato(boolean b){
        this.linkStampato = b;
    }

    @Override
    public String toString() {
        String s = "Nodo:\n";
        s += "Info: " + invitato.toString();

        if(!linkStampato) {
            s += "\nLink: ";

            if(link == null){
                s += "null";
                return s;
            }

            link.setLinkStampato(true);
            s += link.getInvitato().toString();
            link.setLinkStampato(false);
        }

        return s;
    }
}
