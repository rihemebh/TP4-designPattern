public interface ZoneTouristique {

    public void accept(ZoneTouristiqueVisitor v);
    public Boolean ajouteZoneTouristique(ZoneTouristique z);

}
