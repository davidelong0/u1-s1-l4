package Esercizio1;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String nome, int eta, String cv, String matricola, double stipendio, Dipartimento dipartimento) {
        super(nome, eta, cv, matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}
