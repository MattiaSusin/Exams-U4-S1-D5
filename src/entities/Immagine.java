package entities;

import interfaces.LuminositaMetodo;
import interfaces.ShowMetodo;

public class Immagine extends PlayerMultimediale implements LuminositaMetodo, ShowMetodo {
    private static final int durata = 0;
    //LISTA ATTRIBUTI
    public int luminosita;


    //LISTA COSTRUTTORI

    public Immagine(String titolo, int luminositaImg) {
        super(titolo, durata);
        this.luminosita = luminosita;
    }

    //LISTA METODI

    @Override
    public String toString() {
        return "Immagine{" +
                "titolo='" + titolo + '\'' +
                "} " + super.toString();
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    @Override
    public void show() {
        String asterischi = "*".repeat(luminosita);
        System.out.println(titolo + asterischi);
    }

    @Override
    public void play() {

    }
}

