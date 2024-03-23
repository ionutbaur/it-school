package homework;

public class Ex7 {

    public static void main(String[] args) {

        int sideOne = 4;
        int sideTwo = 4;
        int sideThree = 6;

        if (sideOne == sideTwo && sideTwo == sideThree) {
            System.out.println("The triangle is Equilateral.");
        } else if (sideOne == sideTwo && sideTwo != sideThree && sideOne != sideThree) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
    }
}
