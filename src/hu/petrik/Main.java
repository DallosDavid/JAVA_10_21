package hu.petrik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Szakember szakember= new Szakember();
        System.out.println("Kérem adjan meg milye tipusu mester embert szeretne:\n1:Viz \n2:Burkolo");
        Scanner sc= new Scanner(System.in);
        int tipus=sc.nextInt();
        switch (tipus)
        {
            case 1:
                System.out.println("Listaban levö vizvezetekszerelo.");
                for (MesterEmber i :
                        szakember.getSzakEmbers()) {
                    // instanceof addot tipus
                    if (i instanceof VizvezetekSzerelo)
                    {
                        System.out.println(i);

                    }
                }
                ;break;
            case 2:
                System.out.println("Listaban levö burkolo.");
                for (MesterEmber i :
                    szakember.getSzakEmbers()) {
                if (i instanceof Burkolo)
                {
                    System.out.println(i);

                    }
             } ;break;
            
        }

        for (int i = 0; i < szakember.getSzakEmbers().size(); i++) {
            for (int j = 0; j < 10; j++) {
                int vlt=(int)(Math.random()*31)+1;
                szakember.getSzakEmbers().get(i).munkatValal(vlt);
            }
        }
        System.out.println("Munka valalás utan.");
        for (MesterEmber i :
                szakember.getSzakEmbers()) {
            System.out.println(i);
        }
    }
}
