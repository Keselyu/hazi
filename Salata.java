package zoldseges;



public class Salata extends Termek {
    int darab;




    public Salata(int darab, int ar) {
        super("",0);
        this.ar=ar;
        this.darab=darab;
        Salata salata = new Salata(0,0);

    }


    @Override
    public int mennyibeKerul() {
        return darab*ar;
    }
    @Override
    public String toString() {
        return darab + "db" + getNev() +"-" + mennyibeKerul() + "Ft";
    }
}
