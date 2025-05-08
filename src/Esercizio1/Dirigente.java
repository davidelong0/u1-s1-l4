package Esercizio1;

public class Dirigente extends Dipendente {
    public Dirigente(String matricola, double stipendioBase, Dipartimento dipartimento) {
        super(matricola, stipendioBase, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendioBase() * 2; // esempio: raddoppio
    }
}
