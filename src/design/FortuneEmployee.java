package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * 	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * 	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * 	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * 	 * more to design an application that will meet for fortune 500 Employee Information
	 * 	 * Services.
	 * 	 *
	 * 	 * Use any databases[MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo employee1 = new EmployeeInfo(1);
		EmployeeInfo employee2 = new EmployeeInfo("John Doe", 2);

		// Set the company name
		EmployeeInfo.companyName = "Fortune 500 Corp";

		// Calculate and display bonuses for employees
		int bonus1 = EmployeeInfo.calculateEmployeeBonus(50000, 1);
		int bonus2 = EmployeeInfo.calculateEmployeeBonus(60000, 2);
		System.out.println("Bonus for Employee 1: $" + bonus1);
		System.out.println("Bonus for Employee 2: $" + bonus2);

		// Calculate and display pensions for employees
		int pension1 = EmployeeInfo.calculateEmployeePension(50000, 3);
		int pension2 = EmployeeInfo.calculateEmployeePension(60000, 5);
		System.out.println("Pension for Employee 1: $" + pension1);
		System.out.println("Pension for Employee 2: $" + pension2);

		// Use nested class DateConversion for date-related operations
		EmployeeInfo.DateConversion dateConverter = new EmployeeInfo.DateConversion();
		String convertedDate = dateConverter.convertDate("May,2015");
		System.out.println("Converted Date: " + convertedDate);

		// Use nested class DateConversion to determine the month
		int months = dateConverter.whichMonth("February");
		System.out.println("Month: " + months);

		// Access and display employee information
		System.out.println("Employee 1 ID: " + employee1.getEmployeeId());
		System.out.println("Employee 2 Name: " + employee2.getName());
	}
}

