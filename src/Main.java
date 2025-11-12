import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ucilica u = new Ucilica();


        Trokut trokut1 = new Trokut("Trokut1", 3, 4, 5);
        Trokut trokut2 = new Trokut("Trokut2", 5, 7, 3);


/*        System.out.println(trokut1.naziv + ": Opseg = " + trokut1.opseg() + ", Površina = " + trokut1.povrsina());
        System.out.println(trokut2.naziv + ": Opseg = " + trokut2.opseg() + ", Površina = " + trokut2.povrsina());*/


        Krug krug1 = new Krug("Krug1", 4);
        Krug krug2 = new Krug("Krug2", 3);

/*        System.out.println(krug1.naziv + ": Opseg = " + krug1.opseg() + ", Površina = " + krug1.povrsina());
        System.out.println(krug1.naziv + ": Opseg = " + krug2.opseg() + ", Površina = " + krug2.povrsina());*/

        Pravokutnik pravokutnik1 = new Pravokutnik("Pravokutnik1", 4, 7);
        Pravokutnik pravokutnik2 = new Pravokutnik("Pravokutnik2", 10, 8);

/*        System.out.println(pravokutnik1.naziv + ": Opseg = " + pravokutnik1.opseg() + ", Površina = " + pravokutnik1.povrsina());
        System.out.println(pravokutnik2);*/


        u.getGlikovi().add(trokut1);
        u.getGlikovi().add(krug1);
        u.getGlikovi().add(pravokutnik1);

        //ispis prije sortiranja
        for (Likovi gl : u.getGlikovi()) {
            System.out.println(gl);
        }

        Collections.sort(u.getGlikovi());
        System.out.println("Nakon sortiranja   ");
        //ispis poslije sortiranja
        for (Likovi gl : u.getGlikovi()) {
            System.out.println(gl);
        }
    }

}