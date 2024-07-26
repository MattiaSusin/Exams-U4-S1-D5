package entities;

import interfaces.VolumeMetodo;

public class Audio extends PlayerMultimediale implements VolumeMetodo {

    //LISTA ATTRIBUTI

    private double durata;
    private int volume;

    //LISTA COSTRUTTORI

    public Audio(String titolo, double durata, int volume) {
        super(titolo, durata);
        this.durata = durata;
        this.volume = volume;
    }

    //LISTA METODI


    @Override
    public void play() {
        String simboloVolume = "*".repeat(volume);
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + simboloVolume);
        }
    }

    @Override
    public String toString() {
        return "Audio{" +
                "durata=" + durata +
                ", volume=" + volume +
                ", titolo='" + titolo + '\'' +
                "} " + super.toString();
    }

    @Override
    public void alzaVolume() {
    }

    @Override
    public void abbassaVolume() {
    }
}




