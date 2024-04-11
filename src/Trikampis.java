public class Trikampis extends Figura{
    public Trikampis(double krastine1, double krastine2) {
        super(krastine1, krastine2);
    }

    @Override
    public void skaiciuokPlota() {
        setPlotas(getKrastine1() * getKrastine2() / 2);
    }
}
