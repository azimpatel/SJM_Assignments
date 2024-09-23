public class RectangleMain {
    public static void main(String[] args) {

        Rectangle R1=new Rectangle();
        R1.dispalydimension();
        R1.area();
        R1.Perimeter();
        System.out.println();

        Rectangle R2=new Rectangle(6);
        R2.dispalydimension();
        R2.area();
        R2.Perimeter();
        System.out.println();

        Rectangle R3=new Rectangle(8,10);
        R3.dispalydimension();
        R3.area();
        R3.Perimeter();

    }
}
