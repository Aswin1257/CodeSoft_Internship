

package grade_calculator_Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number of subject you want to see the average?: ");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0;i < n;i++) {
			System.out.println("Enter the " + (i + 1) + " Subject mrks: ");
			int marks = sc.nextInt();
			list.add(marks);
		}
		int sum = list.stream().reduce(0, Integer::sum);

		
		double avg = sum / list.size();
		String grade;
		
		if (avg > 90.0) {
			grade = "O";
		} else if (avg > 80.0 && avg <= 90.0) {
			grade = "A+";
		} else if (avg > 70.0 && avg <= 80.0) {
			grade = "A";
		} else if (avg > 60.0 && avg <= 70.0) {
			grade = "B+";
		} else if (avg > 50.0 && avg <= 60.0) {
			grade = "B";
		} else {
			grade = "RA";
		}
		
		System.out.println("Yor total mark is: " + sum);
		System.out.println("Your Average Percentage: " + avg + "%");
		System.out.println("Your Grage is: " + grade);
		
		sc.close();
	}

}
