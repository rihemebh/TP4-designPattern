public class Main {

    public static void main(String args[]){

        ZoneTouristique v = new Ville();
        ZoneTouristique m = new Parc();
        ZoneTouristique p = new Musee();


        v.accept(new VisiterVisitor());
        m.accept(new acheterSouvenirVisitor());
        p.accept(new VisiterVisitor());
    }
}
