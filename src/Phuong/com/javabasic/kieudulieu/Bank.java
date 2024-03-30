package Phuong.com.javabasic.kieudulieu;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Bank {
    static int VAT = 10000;
    static String bankname = "Viettin";
    static float INTEREST_RATE = 7.3F;
    static String address = "Thanh Hóa";
    static String phone = "0352023546";
    public static void getBankInfo(){
        //Viết nhiều dòng code trong đây
        System.out.println("Bank Name: " + bankname);
        System.out.println("Bank VAT: " + VAT);
        System.out.println("Bank Address: " + address);
        System.out.println("Bank Phone: " + phone);
    }
    public static float getInterestRate(){
        //Viết nhiều dòng code trong đây
        return INTEREST_RATE;
    }
}
