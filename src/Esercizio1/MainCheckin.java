package Esercizio1;

public class MainCheckin {
    public static void main(String[] args) {
        // Dipendenti
        Checkinable d1 = new DipendenteFullTime("Mario", 40, "Laurea Economia", "A123", 1500, Dipartimento.PRODUZIONE);
        Checkinable d2 = new DipendentePartTime("Anna", 28, "Diploma", "B456", Dipartimento.VENDITE, 80, 10.5);
        Checkinable d3 = new Dirigente("Giulia", 50, "MBA", "C789", 3000, Dipartimento.AMMINISTRAZIONE);

        // Volontari
        Checkinable v1 = new Volontario("Marco", 25, "Laurea in Sociologia", "Supporto eventi");
        Checkinable v2 = new Volontario("Lucia", 30, "Esperienza in Croce Rossa", "Assistenza sanitaria");

        Checkinable[] persone = {d1, d2, d3, v1, v2};

        for (Checkinable p : persone) {
            p.checkin();
        }
    }
}

