package es1;

public class DipendentePartTime extends Dipendente {

    private double sipendioOrario;
    private int oreLavorate;

    public DipendentePartTime(int matricola, double sipendioOrario, int oreLavorate, Dipartimento dipartimento) {
        super(matricola, dipartimento);
        this.sipendioOrario = sipendioOrario;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return sipendioOrario * oreLavorate;
    }


}
