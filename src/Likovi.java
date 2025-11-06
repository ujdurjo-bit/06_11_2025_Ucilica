public abstract class Likovi {
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
}
