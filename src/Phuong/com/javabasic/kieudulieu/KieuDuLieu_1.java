package Phuong.com.javabasic.kieudulieu;

public class KieuDuLieu_1 {
    //static int numberint = 1200000;
    int numberint = 1200000;
    long numberlong =  300147483647L;
    public static void main(String[] args) {
        //System.out.println(numberint);
        KieuDuLieu_1 Kieudulieu1 = new KieuDuLieu_1();
        System.out.println(Kieudulieu1.numberint);
        System.out.println(Kieudulieu1.numberlong);
        System.out.println(Bank.bankname);
        System.out.println(Bank.VAT);
        System.out.println(Bank.INTEREST_RATE);
    }
}
