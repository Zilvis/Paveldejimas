public class Figura {
    private double plotas , krastine1, krastine2;

    public Figura(double krastine1, double krastine2) {
        this.krastine1 = krastine1;
        this.krastine2 = krastine2;
    }

    public double getKrastine1() {
        return krastine1;
    }

    public void setKrastine1(double krastine1) {
        this.krastine1 = krastine1;
    }

    public double getKrastine2() {
        return krastine2;
    }

    public void setKrastine2(double krastine2) {
        this.krastine2 = krastine2;
    }

    public Figura(double krastine1) {
        this.krastine1 = krastine1;
    }

    public void skaiciuokPlota () {
        this.plotas = krastine1 * krastine2;
    }

    public double getPlotas() {
        return plotas;
    }

    public void setPlotas(double plotas) {
        this.plotas = plotas;
    }

    @Override
    public String toString() {
        return "Jusu "+getClass().getName()+" plotas yra " +plotas+ " kv.cm";
    }
}
