package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ emp);
		System.out.println();
		
		double percentage;
		
		System.out.print("Which percentage to increase salary? ");
		percentage = sc.nextDouble();
		
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		
		sc.close();
	}

}
