package Phuong.com.javabasic.vongLapFor;

public class VongLapForCaiTien {
    public static void main(String[] args) {
        int arr[] = { 12, 23, 44, 56, 78 };
        for (int i : arr) {
            System.out.println(i);
        }
        for (int j = 0; j <= 30; j++){
            if (j % 2 ==0){
                System.out.println(j);
            }
        }
    }
}
