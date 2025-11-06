public class Krug extends Likovi {
//    private String naziv;
    private double radius;

    public Krug(String naziv, double radius) {
        super (naziv);
        this.radius = radius;
    }

    @Override
    public double povrsina() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double opseg() {
        return 2 * radius * Math.PI;
    }
}
