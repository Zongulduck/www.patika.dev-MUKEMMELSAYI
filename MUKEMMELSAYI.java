import java.util.Scanner;
public class MUKEMMELSAYI {
    public static void main(String[]args) {
        Scanner inp = new Scanner(System.in);
        int girdi, test = 0;
        System.out.println("Mükemmel Sayı Hesaplayıcı\n" + "Sorgulanıcak sayıyı giriniz:");
        girdi = inp.nextInt();
        if (girdi <= 0) {
            System.out.println("Sayı>0 olmalıdır.");
        } else {
            for (int i = 1; i <= girdi - 1; i++) {
                if (girdi % i == 0) {
                    test += i;
                }

            }
            if (test == girdi) {
                System.out.println(girdi + " Sayısı mükemmel sayıdır.");
            } else {
                System.out.println(girdi + " Sayısı mükemmel sayı değildir");
            }
        }
    }
}
