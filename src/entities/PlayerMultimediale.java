package entities;

public abstract class PlayerMultimediale {

    //LISTA ATTRIBUTI

    protected String titolo;


    //LISTA COSTRUTTORI

    public PlayerMultimediale(String titolo, double durata) {
        this.titolo = titolo;
    }

    //LISTA METODI

    public abstract void play();
}
