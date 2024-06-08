package Phuong.com.javabasic.Mang;

public class Mang1Chieu {
    public static void main(String[] args) {
        //Khai báo mảng
        int songuyen[] = new int[20];

        //Thêm giá trị vào mảng thử công từng vị trí
        //Mảng bắt đầu từ vị trí 0
        songuyen[0] = 5;
        songuyen[2] = 10;

        //In giá trị trong mảng theo thủ công từng vị trí
        System.out.println(songuyen[0]);
        System.out.println(songuyen[1]);
        System.out.println(songuyen[2]);

        System.out.println("Độ dài mảng: " + songuyen.length);

        //Duyệt phần tử trong mảng với vòng lặp for
        //Nhớ dừng lại với giá trị bé hơn độ dài của mảng đó 1 đơn vị. Vì nos bắt đầu từ 0
        for (int i = 0; i < songuyen.length; i++){
            System.out.println(songuyen[i]);
        }

        //Thêm giá trị vào mảng thông qua vòng lăp for
        for (int i = 0; i < songuyen.length; i++){
            if (i % 2 == 0) {
                songuyen[i] = 10;
            }
        }

        for (int i = 0; i < songuyen.length; i++){
            System.out.println(songuyen[i]);
        }

        //Gán mảng nặc danh cho mảng a
        int a[] = {33, 3, 4, 5};
        System.out.println(a.length);

        String b[] = new String[3];
        b[0] = "Selenium";

        
    }
}
