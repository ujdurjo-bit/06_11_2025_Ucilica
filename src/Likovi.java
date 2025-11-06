public abstract class Likovi {
    private String naziv;
    public abstract double povrsina();
    public abstract double opseg();

    public Likovi(String naziv) {
        this.naziv = naziv;
    }

}
