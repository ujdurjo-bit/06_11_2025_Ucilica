public abstract class Likovi implements Comparable<Likovi> {
    public String naziv;

    public abstract double povrsina();

    public abstract double opseg();

    public Likovi(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Naziv " + naziv + ", Površina: " + povrsina() + ", Opseg: " + opseg();

    }

    @Override
    public int compareTo(Likovi o) {
        return Double.valueOf(povrsina()).compareTo(Double.valueOf(o.povrsina()));
    }
}
