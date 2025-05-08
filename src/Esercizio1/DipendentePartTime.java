package Esercizio1;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double pagaOraria;

    public DipendentePartTime(String nome, int eta, String cv, String matricola, Dipartimento dipartimento, int oreLavorate, double pagaOraria) {
        super(nome, eta, cv, matricola, 0, dipartimento);
        this.oreLavorate = oreLavorate;
        this.pagaOraria = pagaOraria;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * pagaOraria;
    }
}
