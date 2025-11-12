public class Trokut extends Likovi {
    //    private String naziv;
    int a, b, c;

    public Trokut(String naziv, int a, int b, int c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double povrsina() {
        double srednjica = (a + b + c) / 2.0;
        return Math.sqrt(srednjica * (srednjica - a) *  (srednjica - b) * (srednjica - c));
    }

    @Override
    public double opseg() {
        return a + b + c;
    }
}
