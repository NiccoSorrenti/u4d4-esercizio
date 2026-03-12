package es1;

public class DipendentePartTime extends Dipendente {

    private double stipendioMensile;

    public DipendentePartTime(int matricola, double stipendioMensile, Dipartimento dipartimento) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }


}
