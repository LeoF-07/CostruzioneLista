package costruzione_lista;

public class TesterCostruzioneLista {

    public static void main(String[] args) {
        Lista lista = new Lista();

        Invitato leo = new Invitato("Leo", "F");
        Invitato guido = new Invitato("Guido", "M");
        Invitato michele = new Invitato("Michele", "B");
        Invitato antonio = new Invitato("Antonio", "F");
        Invitato mattia = new Invitato("Mattia", "G");

        lista.push(leo);
        lista.push(guido);

        lista.addLast(michele);
        lista.addLast(mattia);

        lista.add(antonio, 2);

        lista.pop();
        lista.removeLast();
        lista.remove(2);

        System.out.println(lista.toString());
    }

}