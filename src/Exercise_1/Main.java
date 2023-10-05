package Exercise_1;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("001",1000,30, Dipendente.livelli.operaio, Dipendente.dipartimenti.produzione);
        Dipendente d2 = new Dipendente("002",1000,30, Dipendente.livelli.operaio, Dipendente.dipartimenti.produzione);
        Dipendente d3 = new Dipendente("003",1200,30, Dipendente.livelli.impiegato, Dipendente.dipartimenti.amministrazione);
        Dipendente d4 = new Dipendente("004",2000,30, Dipendente.livelli.dirigente, Dipendente.dipartimenti.vendite);
        d1.promuovi();
        d3.promuovi();
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
        paghetotali(d1,d2,d3,d4);
    }
    public static double calcolaPaga (Dipendente d1) {
        System.out.println(d1.getStipendio());
        return d1.getStipendio();
    }

    public static double calcolaPaga (Dipendente d1, int oreExtra) {
        double totale = d1.getStipendio()+oreExtra*d1.getImportoOrarioStraordinario();
        System.out.println(totale);
        return totale;
    }
    public static void paghetotali (Dipendente d1, Dipendente d2, Dipendente d3, Dipendente d4) {
        double totale = calcolaPaga(d1, 5)+calcolaPaga(d2,5)+calcolaPaga(d3,5)+calcolaPaga(d4,5);
        System.out.println(totale);
    };
}