public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D.getXY());
        System.out.println(point3D);

        point3D = new Point3D(1,2,3);
        System.out.println(point3D);
        for (float array: point3D.getXYZ()){
            System.out.println(array);
        }
    }
}
