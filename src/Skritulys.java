import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skritulys extends Figura{

    public Skritulys(double krastine1) {
        super(krastine1);
    }

    @Override
    public void skaiciuokPlota (){
        double x = getKrastine1() * getKrastine1();
        double s = x * Math.PI;
        Math.round(s);
        var plotas = new BigDecimal(s);
        plotas = plotas.setScale(2, RoundingMode.UP);
        setPlotas(Double.parseDouble(plotas.toString()));
    }
}
