package observer.secondExample;

import java.util.Scanner;

public class Main {
//  https://www.youtube.com/watch?v=ZqIn1p4n9SQ

    public static void main(String[] args) {
        StacjaPogodowa sp = new StacjaPogodowa(22);

        CzytnikTemperatury ct1 = new CzytnikTemperatury(1);
        sp.dodajOdbiorce(ct1);

        CzytnikTemperatury ct2 = new CzytnikTemperatury(2);
        sp.dodajOdbiorce(ct2);

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        sp.setTemperatura(x);

        main(null);
    }
}
