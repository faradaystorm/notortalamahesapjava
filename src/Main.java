import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int matematik, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfıtanımlandı
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz :");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        //değerlerin hepsini toplayıp sayısına bölmek gerekiyor

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız :" + sonuc);
        System.out.println(sonuc >= 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");

    }
}