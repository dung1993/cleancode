package Debug;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IllegalTriangleCheck illegalTriangleCheck = new IllegalTriangleCheck();

        try{
            System.out.println("Nhập x:" );
            double x = scanner.nextInt();
            System.out.println("Nhập y:" );
            double y = scanner.nextInt();
            System.out.println("Nhập z:" );
            double z = scanner.nextInt();
            try{
                illegalTriangleCheck.TriangleCheck(x,y,z);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }

        }catch (Exception e) {
            System.out.println("Sai: không phải cạnh của tam giác");
        }
    }
}
