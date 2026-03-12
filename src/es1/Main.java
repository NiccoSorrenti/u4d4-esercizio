package es1;

public class Main {
    static void main(String[] args) {
//        Dipendente dipendente = new Dipendente(1, 1000.0, Dipartimento.AMMINISTRAZIONE);
//        Dipendente dipendente2 = new Dipendente(2, 1500.0, Dipartimento.PRODUZIONE);
//        Dipendente dipendente3 = new Dipendente(3, 2000.0, Dipartimento.VENDITE);
//
//        dipendente.setDipartimento(Dipartimento.VENDITE);
//
//        System.out.println(dipendente);
//
//        Dipendente[] arrayDipendenti = {dipendente, dipendente2, dipendente3};
//
//        for (int i = 0; i < arrayDipendenti.length; i++) {
//            System.out.println(arrayDipendenti[i].getMatricola());
//        }

        System.out.println("\n esercizio 2");

        DipendenteFullTime dipendenteFullTime = new DipendenteFullTime(1, 1000.0, Dipartimento.VENDITE);
        DipendentePartTime dipendentePartTime = new DipendentePartTime(2, 20.0, 8, Dipartimento.PRODUZIONE);
        Dirigente dirigente = new Dirigente(3, 1500.0, Dipartimento.AMMINISTRAZIONE);

        Dipendente[] arrayDipendenti = {dipendenteFullTime, dipendentePartTime, dirigente};

        double totale = 0;

        for (int i = 0; i < arrayDipendenti.length; i++) {
            double stipendio = arrayDipendenti[i].calculateSalary();

            System.out.println("Matricola: " + arrayDipendenti[i].getMatricola() + " | Stipendio: " + stipendio);

            totale = totale + stipendio;
        }

        System.out.println("Totale stipendi: " + totale);

        System.out.println("\n esercizio 3");


        DipendenteFullTime dipendenteFullTime1 = new DipendenteFullTime(4, 1500.0, Dipartimento.PRODUZIONE);
        Volontario volontario = new Volontario("Marco", 25, "Studente");

        Check[] dipendentiEVolontari = {dipendenteFullTime1, volontario};

        for (int i = 0; i < dipendentiEVolontari.length; i++) {
            dipendentiEVolontari[i].checkIn();
        }
    }
}
