package sayiBulma;

public class SayiBulma {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 8;
        boolean varmi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varmi = true;
                break;
            }
        }
        if (varmi) {
            System.out.println("aradığınız sayı dizide mevcuttur");
        } else {
            System.out.println("aradığınız sayı dizide mevcut değildir");

        }

    }

}