package Debug;

public class IllegalTriangleCheck {
    public void TriangleCheck(double x, double y, double z) throws IllegalTriangleException {
        if (x + y <= z || x + z <= y || y + z <= x) {
            throw new IllegalTriangleException("Ba cạnh tam giác không hợp lệ");
        }else {
            System.out.println("Ba cạnh tam giác hợp lêk");
        }
    }
}
