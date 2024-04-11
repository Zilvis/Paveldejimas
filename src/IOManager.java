import java.util.Scanner;

public class IOManager{
    private PasirinktaFigura figura;
    private Scanner scanner;
    private int pasirinkimas;
    private double krastine1, krastine2;

    public IOManager() {
        this.figura = null;
        this.pasirinkimas = 0;
        scanner = new Scanner(System.in);
    }

    public void suzinokFigura(){
        System.out.println("Pasirinkite forma: ");
        System.out.println("1: " + figura.KVADRATAS + " 2: " + figura.TRIKAMPIS + " 3: "+ figura.SKRITULYS);
        this.pasirinkimas = scanner.nextInt();
        suzinokKrastines();
    }


    private void suzinokKrastines(){

        if (this.pasirinkimas != 1 && this.pasirinkimas != 2 && this.pasirinkimas != 3){
            System.out.println("Blogai ivesta ! bandykite dar karta");
        } else if (this.pasirinkimas == 1){
            System.out.println("Iveskite krastines ilgi: ");
            this.krastine1 = scanner.nextDouble();
        } else if (this.pasirinkimas == 2){
            System.out.println("Iveskite pirmos statines ilgi: ");
            krastine1 = scanner.nextDouble();
            System.out.println("Iveskite antros statines ilgi: ");
            this.krastine2 = scanner.nextDouble();
        }
        else {
            System.out.println("Iveskite skritulio spinduli: ");
            krastine1 = scanner.nextDouble();
        }
    }

    public void spausdinkPlota(String str){
        System.out.println(str);
    }
    public PasirinktaFigura getFigura() {
        return figura;
    }

    public double getKrastine1() {
        return krastine1;
    }

    public int getPasirinkimas() {
        return pasirinkimas;
    }

    public double getKrastine2() {
        return krastine2;
    }
}
