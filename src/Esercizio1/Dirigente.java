package Esercizio1;

public class Dirigente extends Dipendente {
    public Dirigente(String nome, int eta, String cv, String matricola, double stipendio, Dipartimento dipartimento) {
        super(nome, eta, cv, matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio() + 1000; // bonus dirigente
    }
}
