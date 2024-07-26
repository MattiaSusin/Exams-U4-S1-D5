package entities;

import interfaces.LuminositaMetodo;
import interfaces.VolumeMetodo;

public class Video extends PlayerMultimediale implements LuminositaMetodo, VolumeMetodo {

    //LISTA ATTRIBUTI
    private double durata;
    private int volume;
    private int luminosita;

    //LISTA COSTRUTTORI

    public Video(String titolo, double durata, int volume, int luminosita) {
        super(titolo, durata);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    //LISTA METODI


    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public void alzaVolume() {
        volume++;
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
    public void play() {

    }
}
