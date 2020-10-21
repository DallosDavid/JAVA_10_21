package hu.petrik;

public class Burkolo extends MesterEmber {

    Helyszin szakterulet;

    public Burkolo(String nev, int napiDij, Helyszin szakterulet) {
        super(nev, napiDij);
        this.szakterulet = szakterulet;
    }

    public int asszosSzabadnap()
    {
        int osz=0;
        for (boolean item :
                foglaltNapok) {
            if (!item)
            {
                osz++;
            }
        }
        return osz;
    }

    public String toString() {
        String s=super.toString()+"\n "+ this.szakterulet;
        return s;
    }

    public boolean munkatValal(int nap) {
        boolean l=false;
        if (!foglaltNapok[nap-1]){
            foglaltNapok[nap-1]=true;
            l=true;
        }
        return l;
    }
}
