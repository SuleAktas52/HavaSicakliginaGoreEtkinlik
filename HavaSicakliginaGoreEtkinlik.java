package deneme;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {

        int sicaklik;

        Scanner input= new Scanner(System.in);
        System.out.print("Hava Sicakligini Giriniz: ");
        sicaklik=input.nextInt();

        if(sicaklik < 5){
            System.out.println("Kayak Yapabilirsin..");
        } else if (5<= sicaklik && sicaklik<15) {
            if(10<sicaklik && sicaklik<15){
                System.out.println("Piknik Yapabilirsiniz..");
            }
            System.out.println("Sinemaya Gidebilirsin..");
        } else if (15<= sicaklik && sicaklik<25) {
            System.out.println("Piknik Yapabilirsin..");
        }else {
            System.out.println("Yuzme Yapabilirsin..");
        }
    }
}

/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

 */