package exercises_4.exercises_4_3;

public class Test {
    public static void main(String[] args) {
        // Point2D test
        Point2D p2d = new Point2D(3.5f, 4.5f);
        System.out.println("Point2D boshlang'ich: " + p2d);

        p2d.setX(7.5f);
        p2d.setY(8.5f);
        System.out.println("Point2D yangilangan: " + p2d);

        float[] xy = p2d.getXY();
        System.out.println("getXY(): [" + xy[0] + ", " + xy[1] + "]");

        // Point3D test
        Point3D p3d = new Point3D(1.2f, 2.3f, 3.4f);
        System.out.println("Point3D boshlang'ich: " + p3d);

        p3d.setXYZ(5.6f, 6.7f, 7.8f);
        System.out.println("Point3D yangilangan: " + p3d);

        float[] xyz = p3d.getXYZ();
        System.out.println("getXYZ(): [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");
    }
}
