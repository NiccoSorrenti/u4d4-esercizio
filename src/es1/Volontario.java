package es1;

public class Volontario implements Check {

    private String nome;
    private int età;
    private String CV;

    public Volontario(String nome, int età, String CV) {
        this.nome = nome;
        this.età = età;
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Il dipendente " + nome + " ha iniziato il servizio.");
    }
}
