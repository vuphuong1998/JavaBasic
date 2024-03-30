package Phuong.com.javabasic.PhuongThuc;

import Phuong.com.javabasic.kieudulieu.Bank;

public class PhuongThucNganHang {
    public static void main(String[] args) {
        Bank.getBankInfo();
        double TongTien = Bank.getInterestRate() * 100000000/100;
        System.out.println("Tổng tiền lãi: " + TongTien);
    }
}
