import java.util.Scanner;

public class Tim_uoc_lon_nhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số a : ");
        a = sc.nextInt();

        System.out.println("Nhập số b : ");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0){
            System.out.println("Không có ước lớn nhất");
        }
        while (a != b ){
            if(a > b ){
                a -= b;
            }else {
                b -= a;
            }

            System.out.println(a  +  " Là ước Lớn nhất");
        }

    }
}
