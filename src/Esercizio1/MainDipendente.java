package Esercizio1;

public class MainDipendente {
    public static void main(String[] args) {
        Dipendente d1 = new DipendenteFullTime("Mario", 40, "Laurea Economia", "A123", 1500, Dipartimento.PRODUZIONE);
        Dipendente d2 = new DipendentePartTime("Anna", 28, "Diploma", "B456", Dipartimento.VENDITE, 80, 10.5);
        Dipendente d3 = new Dirigente("Giulia", 50, "MBA", "C789", 3000, Dipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendenti = {d1, d2, d3};

        double totale = 0;
        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola());
            System.out.println("Dipartimento: " + d.getDipartimento());
            System.out.println("Stipendio: " + d.calculateSalary());
            System.out.println("-----------------------");
            totale += d.calculateSalary();
        }

        System.out.println("Totale stipendi: " + totale);
    }
}

