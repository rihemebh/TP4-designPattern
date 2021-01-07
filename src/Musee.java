public class Musee implements ZoneTouristique{
    @Override
    public void accept(ZoneTouristiqueVisitor v){
        System.out.println("le Musee a accepte votre visite");
        v.visit(this);
    }
    @Override
    public Boolean ajouteZoneTouristique(ZoneTouristique z) {
        return null;
    }
}
