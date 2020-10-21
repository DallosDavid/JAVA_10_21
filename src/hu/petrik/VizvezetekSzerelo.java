package hu.petrik;

public class VizvezetekSzerelo extends MesterEmber {

    private int tapasztalat;

    public VizvezetekSzerelo(String nev, int napiDij, int tapasztalat) {
        super(nev, napiDij);
        this.tapasztalat = tapasztalat;
    }

    public String toString() {
        String s=super.toString()+"\n"+this.tapasztalat+"év";
        return s;
    }

    @Override
    public boolean munkatValal(int nap) {
        nap = nap-1;
        boolean l=false;
        if (nap>1 && nap<31 && !foglaltNapok[nap-1] && !foglaltNapok[nap] && !foglaltNapok[nap+1])
        {
            l=true;
            for (int i = nap-1; i <nap+2 ; i++) {
                foglaltNapok[i]=true;
            }
        }
        return l;
    }




}
