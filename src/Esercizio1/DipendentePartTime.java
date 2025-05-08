package Esercizio1;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double pagaOraria;

    public DipendentePartTime(String matricola, Dipartimento dipartimento, int oreLavorate, double pagaOraria) {
        super(matricola, 0, dipartimento); // stipendio base = 0, non serve
        this.oreLavorate = oreLavorate;
        this.pagaOraria = pagaOraria;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * pagaOraria;
    }
}
