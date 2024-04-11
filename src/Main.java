public class Main {
    public static void main(String[] args) {
        var io = new IOManager();

        io.suzinokFigura();

        if (io.getPasirinkimas() == 1){
            var kvadratas = new Kvadratas(io.getKrastine1());
            kvadratas.skaiciuokPlota();
            io.spausdinkPlota(kvadratas.toString());
        } else if (io.getPasirinkimas() == 2) {
            var trikampis = new Trikampis(io.getKrastine1(), io.getKrastine2());
            trikampis.skaiciuokPlota();
            io.spausdinkPlota(trikampis.toString());
        } else {
            var skritulys = new Skritulys(io.getKrastine1());
            skritulys.skaiciuokPlota();
            io.spausdinkPlota(skritulys.toString());
        }
    }
}