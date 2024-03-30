package Phuong.com.javabasic.PhuongThuc;

public class PhuongThucCoThamSo {
    static float INTEREST_RATE = 7.3F;
    public static double tinhlai(long soTienGui){
        return((soTienGui * INTEREST_RATE)/100);
    }
    public static double cong2so(double number1, double number2){
        return number1 + number2;
    }
    public static int cong2soNguyen(int number1, int number2){
        return number1 + number2;
    }
    public static void main(String[] args) {
        System.out.println("Tiền lãi tháng 12: " + tinhlai(100000000));
        System.out.println("Cộng 2 số nguyên: " + cong2soNguyen(10, 20));
    }
}
