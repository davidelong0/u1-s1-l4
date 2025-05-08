package Esercizio1;

public class MainDipendente {
    public static void main(String[] args) {
        // Creazione di dipendenti di diversi tipi
        Dipendente d1 = new DipendenteFullTime("A123", 1500, Dipartimento.PRODUZIONE);
        Dipendente d2 = new DipendentePartTime("B456", Dipartimento.VENDITE, 80, 10.5);
        Dipendente d3 = new Dirigente("C789", 3000, Dipartimento.AMMINISTRAZIONE);

        // Array di dipendenti
        Dipendente[] dipendenti = {d1, d2, d3};

        // Iterazione sull'array di dipendenti
        double totale = 0;
        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola());
            System.out.println("Dipartimento: " + d.getDipartimento());
            System.out.println("Stipendio: " + d.calculateSalary());
            System.out.println("-----------------------");
            totale += d.calculateSalary();
        }

        // Stampa del totale degli stipendi
        System.out.println("Totale stipendi: " + totale);
    }
}
