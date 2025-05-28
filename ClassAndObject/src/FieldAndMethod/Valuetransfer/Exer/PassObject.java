package FieldAndMethod.Valuetransfer.Exer;

public class PassObject {
    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle circle = new Circle();
        obj.printAreas(circle, 5);
        System.out.println("Radius: " + circle.radius);
    }

    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");
        int i = 1;
        for (; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
        c.radius = i;
    }
}
