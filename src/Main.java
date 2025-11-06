import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*       Kreirajte po 1-2 objekta za svaku klasu
          primjeniti metode pojedinih klasa
        */


        Trokut trokut1 = new Trokut("Trokut1", 5, 5, 5);
        Trokut trokut2 = new Trokut("Trokut2", 5, 8, 3);


        System.out.println(trokut1.naziv + ": Opseg = " + trokut1.opseg() + ", Površina = " + trokut1.povrsina());
        System.out.println(trokut2.naziv + ": Opseg = " + trokut2.opseg() + ", Površina = " + trokut2.povrsina());



        Krug krug1 = new Krug("Krug1", 7);
        Krug krug2 = new Krug("Krug2", 3);

        System.out.println(krug1.naziv + ": Opseg = " + krug1.opseg() + ", Površina = " + krug1.povrsina());
        System.out.println(krug1.naziv + ": Opseg = " + krug2.opseg() + ", Površina = " + krug2.povrsina());

        Pravokutnik pravokutnik1 = new Pravokutnik("Pravokutnik1", 4, 7);
        Pravokutnik pravokutnik2 = new Pravokutnik("Pravokutnik2", 10, 8);

        System.out.println(pravokutnik1.naziv + ": Opseg = " + pravokutnik1.opseg() + ", Površina = " + pravokutnik1.povrsina());
        System.out.println(pravokutnik2);

    }

}