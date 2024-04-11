public class Kvadratas extends Figura{

    public Kvadratas(double krastine1) {
        super(krastine1);
    }

    @Override
    public void skaiciuokPlota() {
        setPlotas(getKrastine1() * getKrastine1());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
