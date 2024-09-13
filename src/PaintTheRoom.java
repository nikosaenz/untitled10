//demo
import java.util.Scanner;

public class PaintTheRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();
        int numWindows = input.nextInt();
        int numDoors = input.nextInt();

        double wallArea = 2 * height * (length + width);
        double ceilingArea = length * width;
        double totalArea = wallArea + ceilingArea;

        double windowArea = numWindows * 15;
        double doorArea = numDoors * 21;
        double paintableArea = totalArea - windowArea - doorArea;

        double coveragePerGallon = 350;
        double totalGallons = paintableArea / coveragePerGallon;
        int gallons = (int) Math.floor(totalGallons);
        double quarts = (totalGallons - gallons) * 4;

        System.out.println("Gallons of paint needed: " + gallons);
        System.out.printf("Quarts of paint needed: %.2f\n", quarts);
    }
}
