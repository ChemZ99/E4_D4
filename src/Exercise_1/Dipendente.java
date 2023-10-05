package Exercise_1;

public class Dipendente {
    private double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;

    private enum livelli {
        operaio, impiegato, quadro, dirigente
    }

    private livelli livello;

    private enum dipartimenti {
        produzione, amministrazione, vendite
    }

    private dipartimenti dipartimento;

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public livelli getLivello() {
        return livello;
    }

    public dipartimenti getDipartimento() {
        return dipartimento;
    }
    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(dipartimenti dipartimento) {
        this.dipartimento = dipartimento;
    }

    public Dipendente(String matricola, dipartimenti dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = livelli.operaio;
    }
    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, livelli livello, dipartimenti dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    @Override
    public String stampaDati() {
        return "Dipendente{" +
                "stipendioBase=" + stipendioBase +
                ", matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
