package Esercizio1;

public class Volontario implements Checkinable {
    private String nome;
    private int eta;
    private String cv;
    private String tipoServizio;

    public Volontario(String nome, int eta, String cv, String tipoServizio) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
        this.tipoServizio = tipoServizio;
    }

    @Override
    public void checkin() {
        System.out.println(nome + " ha iniziato il suo servizio come volontario.");
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

    public String getTipoServizio() {
        return tipoServizio;
    }
}
