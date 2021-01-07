public class Ville implements ZoneTouristique {
    @Override
    public void accept(ZoneTouristiqueVisitor v){
        System.out.println(" La ville a accepte votre visite");
        v.visit(this);
    }

    @Override
    public Boolean ajouteZoneTouristique(ZoneTouristique z) {

        return null;
    }
}

