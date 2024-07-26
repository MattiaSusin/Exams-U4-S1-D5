package entities;

public abstract class PlayerMultimediale {

    //LISTA ATTRIBUTI

    public String titolo;


    //LISTA COSTRUTTORI

    public PlayerMultimediale(String titolo, double durata) {
        this.titolo = titolo;
    }

    public PlayerMultimediale(String titoloVid, int durataVid, int volumeVid, int luminositaVid) {

    }

    @Override
    public String toString() {
        return "PlayerMultimediale{" +
                "titolo='" + titolo + '\'' +
                '}';
    }
//LISTA METODI

    public abstract void play();
}
