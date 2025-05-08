package Esercizio1;

public abstract class Dipendente {
    private String matricola;
    private double stipendioBase;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendioBase, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendioBase = stipendioBase;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Metodo astratto che deve essere implementato nelle classi figlie
    public abstract double calculateSalary();
}
