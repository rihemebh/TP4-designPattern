public class acheterSouvenirVisitor implements ZoneTouristiqueVisitor{

    public void visit(Ville v){
        System.out.println("J'achete un souvenir de la ville");
    }
    public void visit(Musee m){
        System.out.println("J'achete un souvenir du Musee");
    }
    public void visit(Parc p){
        System.out.println("J'achete un souvenir du parc");
    }
}
