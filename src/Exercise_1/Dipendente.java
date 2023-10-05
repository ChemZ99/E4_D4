package Exercise_1;

public class Dipendente {
    private double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;

    public enum livelli {
        operaio, impiegato, quadro, dirigente
    }

    private livelli livello;

    public enum dipartimenti {
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

    public void setLivello(livelli livello) {
        this.livello = livello;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
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

    public String toString() {
        return "Dipendente{" +
                "stipendioBase=" + stipendioBase +
                ", matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public void promuovi() {
        if (getLivello() == livelli.operaio) {
            setLivello(livelli.impiegato);
            setStipendio(stipendioBase*1.2);
        } else if (getLivello() == livelli.impiegato) {
            setLivello(livelli.quadro);
            setStipendio(stipendioBase*1.5);
        } else if (getLivello() == livelli.quadro) {
            setLivello(livelli.dirigente);
            setStipendio(stipendioBase*2);
        } else {
            System.err.println("error");
        }
        System.out.println(this.livello);
    }
}
