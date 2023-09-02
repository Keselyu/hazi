package zoldseges;

public abstract class Termek {

    private String nev;
    int ar;

    public Termek(String nev, int ar) {
        this.nev = nev;
        this.ar=ar;
    }


    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }
    public abstract int mennyibeKerul();

    @Override
    public String toString() {
        return nev +"-"+mennyibeKerul()+"Ft";
    }
}
