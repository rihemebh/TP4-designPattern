public class VisiterVisitor implements ZoneTouristiqueVisitor {

    public void visit(Ville v){
        System.out.println("Je visite pour la 1ere fois La ville");
    }
    public void visit(Musee m){

        System.out.println("Je visite pour la 1ere fois Le Musee");
    }
    public void visit(Parc p){
        System.out.println("Je visite pour la 1ere fois Le Parc");
    }
}
