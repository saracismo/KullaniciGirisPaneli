import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;


        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifre : ");
        password = inp.nextLine();


        // Kullanıcı adı ve şifre kontrol edilir

        if(userName.equals("Mert") && password.equals("mert123")){
            System.out.println("Giriş Yaptınız! ");

        } else {
            System.out.println("Bilgileriniz Yanlış! ");

        System.out.println("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
        }

        String cevap = inp.nextLine();


//yeni şifre için ekrana çıktı verelim
        if(cevap.equals("Evet")) {
            System.out.print("Yeni Şifre: ");

        }
        String yeniSifre = inp.nextLine();

        // oluşturulacak olan yeni şifre için koşul belirtelim.

        if(yeniSifre.equals("mert123")) {
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        } else {
            System.out.println("Şifreniz başarılı şekilde oluşturuldu. ");
        }




    }
}