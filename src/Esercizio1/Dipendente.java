package Esercizio1;

public abstract class Dipendente implements Checkinable {
    private String nome;
    private int eta;
    private String cv;
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String nome, int eta, String cv, String matricola, double stipendio, Dipartimento dipartimento) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    @Override
    public void checkin() {
        System.out.println(nome + " ha iniziato il suo turno di lavoro.");
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCv() {
        return cv;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}

