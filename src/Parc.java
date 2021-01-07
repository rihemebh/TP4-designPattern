public class Parc implements ZoneTouristique{
    @Override
    public void accept(ZoneTouristiqueVisitor v){
        System.out.println("le parc a accepte votre visite");
        v.visit(this);
    }
    @Override
    public Boolean ajouteZoneTouristique(ZoneTouristique z) {
        return null;
    }
}
