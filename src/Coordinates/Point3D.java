package Coordinates;

public class Point3D extends Point2D{
    private float z;

   public Point3D(){

   }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getArray(){
        float[]array = {this.getX(),this.getY(),this.z};
        return array;
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", which is a subclass of "
                + super.toString()
                +'}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3,4,5);
        System.out.println(point3D);
        for (float element:point3D.getArray()){
            System.out.println(element);
        }
    }
}
