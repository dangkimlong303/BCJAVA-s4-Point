public class Point2dTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(5);
        point2D.setY(3);
        float[] array = new float[2];
        array = point2D.getXY();
        for (float x: array){
            System.out.println(x + " ");
        }
        point2D = new Point2D(3,9);
        System.out.println(point2D);
        for (float x: point2D.getXY()){
            System.out.println(x + " ");
        }
    }
}

