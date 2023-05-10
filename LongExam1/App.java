import Locations.*;
import Tourists.*;



public class App {
    public static void main(String[] args) throws Exception {

        Locations Tondo = new Vigan();
        Locations Boracay = new Boracay();
        Locations Hongkong = new Davao();
        Locations Palawan = new Palawan();
        Locations Africa = new Cebu();
        Locations Russia = new Masbate();

        Tourist Lukban = new Lukban();

        Boracay.accept(Lukban);
        Tondo.accept(Lukban);
        Hongkong.accept(Lukban);
        Palawan.accept(Lukban);
        Africa.accept(Lukban);
        Russia.accept(Lukban);



    }
}