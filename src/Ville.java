public class Ville implements ZoneTouristique {
    ZoneTouristique zones [];

    Ville(){
        zones = new ZoneTouristique[] {new Musee(), new Parc()};
    }

    @Override
    public void accept(ZoneTouristiqueVisitor v){
        zones[0].accept(v);
        zones[1].accept(v);
        System.out.println("La ville a accepte votre visite");
        v.visit(this);
    }

    @Override
    public Boolean ajouteZoneTouristique(ZoneTouristique z) {

        return null;
    }
}

