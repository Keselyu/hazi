package zoldseges;

public class RohadtParadicsom extends Termek implements Akciozhato{
    double tomeg;

    public RohadtParadicsom(double tomeg, int ar){
        super("",0);
        this.ar=ar;
        this.tomeg=tomeg;


    }
    RohadtParadicsom rohadtParadicsom = new RohadtParadicsom(0,0);


    @Override
    public int akciosAr() {
        return (int) (ar*0.8);
    }

    @Override
    public int mennyibeKerul() {
        return (int) (tomeg*ar);
    }
    @Override
    public String toString() {
        return tomeg + "kg rohadt" + getNev() +"-" + mennyibeKerul() + "Ft";
    }
}
