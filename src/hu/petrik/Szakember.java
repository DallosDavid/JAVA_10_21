package hu.petrik;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Szakember {
    ArrayList<MesterEmber> szakEmbers;

    public ArrayList<MesterEmber> getSzakEmbers() {
        return szakEmbers;
    }

    public Szakember()
    {
            szakEmbers= new ArrayList<>();
            Feltoltes();
    }



    private void Feltoltes() {
        try {
            FileReader fr = new FileReader("mesterek.txt");
            BufferedReader bf = new BufferedReader(fr);
            String sor = bf.readLine();
            while (sor != null) {
                String[] st = sor.split(";");
                if (st[0].equals("Burkoló")) {
                    Helyszin h = st[3].equals("Belső") ? Helyszin.BELSO : Helyszin.KULSO;
                    Burkolo Bela =
                    new Burkolo(st[1],Integer.parseInt(st[2]),h);
                    szakEmbers.add(Bela);
                }else {
                    VizvezetekSzerelo Jozsi= new VizvezetekSzerelo(st[1],
                            Integer.parseInt(st[2]),Integer.parseInt(st[3]));
                    szakEmbers.add(Jozsi);
                }
                sor=bf.readLine();

            }

            for (MesterEmber i :
                    szakEmbers) {
                System.out.println(i);
            }
            bf.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

