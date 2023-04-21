package old.Point2D_3D;

public class PointApp {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        Point3D point3D = new Point3D(2, 4, 5);

        System.out.println("Tọa độ của point2D ");
        // Vì sao bỏ vào point2D không cần chấm toString()
        // vì println đã mặc đinh gọi toString của object
        System.out.println(point2D);

        System.out.println("Tọa độ của point3D ");
        System.out.println(point3D.toString());
    }
}
