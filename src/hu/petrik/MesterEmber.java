package hu.petrik;

import java.util.Arrays;

public abstract class MesterEmber {

    private String nev;
    private int napiDij;
    protected boolean foglaltNapok[];

    public MesterEmber(String nev, int napiDij) {
        this.nev = nev;
        this.napiDij = napiDij;
        foglaltNapok = new boolean[31];

    }

    public  abstract boolean munkatValal(int nap);


    public String toString() {
        String s=this.nev+" "+this.napiDij;
        for (int i = 0; i <foglaltNapok.length ; i++) {
            if (i%7==0)
            {
                s+=" "+foglaltNapok[i]+"\n ";
            }else
            {
                s+=" "+foglaltNapok[i]+" ";
            }
        }
        return s;
    }
}
