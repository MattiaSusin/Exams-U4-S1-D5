package entities;

import interfaces.PlayMetodo;

public class Immagine extends PlayerMultimediale implements PlayMetodo {
    private static final int durata = 0;
    //LISTA ATTRIBUTI

    public Immagine(String titolo) {
        super(titolo, durata);
    }


    //LISTA COSTRUTTORI


    //LISTA MODULI


    @Override
    public void play() {
        System.out.println("Prossimamente riproducibile");
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "titolo='" + titolo + '\'' +
                "} " + super.toString();
    }
}

