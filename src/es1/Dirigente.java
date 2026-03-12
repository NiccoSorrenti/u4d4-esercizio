package es1;

public class Dirigente extends Dipendente {

    private double stipendioMensile;

    public Dirigente(int matricola, double stipendioMensile, Dipartimento dipartimento) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }


    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }
}
