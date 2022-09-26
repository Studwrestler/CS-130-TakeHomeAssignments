import java.util.Scanner;
import java.text.DecimalFormat;
public class ch3_DecimalFormatClassPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = scan.nextDouble();
		
		double area = Math.PI * 4 * Math.pow(radius, 2);
		double volume = 4/3 * Math.PI * Math.pow(radius, 3);
		
		DecimalFormat format1 = new DecimalFormat("0.##");
		System.out.println("The formated volume of the sphere is: "+ format1.format(volume));
		System.out.println("The formated surface area of the sphere is: "+ format1.format(area));
	}

}
