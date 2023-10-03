package design;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.


        public void testEmployeeId() {
            EmployeeInfo employee = new EmployeeInfo(1);
            assertEquals(1, employee.employeeId());
        }


        public void testEmployeeName() {
            EmployeeInfo employee = new EmployeeInfo("John Doe", 2);
            assertEquals("John Doe", employee.employeeName());
        }


        public void testAssignDepartment() {
            // Implement test case for assignDepartment() method
        }


        public void testCalculateSalary() {
            // Implement test case for calculateSalary() method
        }


        public void testCalculateEmployeeBonus() {
            int bonus1 = EmployeeInfo.calculateEmployeeBonus(3, 1);
            assertEquals(1500, bonus1); // Adjust expected values based on your implementation

            int bonus2 = EmployeeInfo.calculateEmployeeBonus(5, 2);
            assertEquals(2400, bonus2); // Adjust expected values based on your implementation
        }


        public void testCalculateEmployeePension() {
            int pension1 = EmployeeInfo.calculateEmployeePension(3, 50000);
            assertEquals(7500, pension1); // Adjust expected values based on your implementation

            int pension2 = EmployeeInfo.calculateEmployeePension(5, 60000);
            assertEquals(30000, pension2); // Adjust expected values based on your implementation
        }


        public void testBenefitLayout() {
            // Implement test case for benefitLayout() method
        }


        public void testDateConversion() {
            EmployeeInfo.DateConversion dateConverter = new EmployeeInfo.DateConversion();
            String convertedDate = dateConverter.convertDate("May,2015");
            assertEquals("5/2015", convertedDate); // Adjust expected value based on your implementation

            int months = dateConverter.whichMonth("February");
            assertEquals(2, months); // Adjust expected value based on your implementation
        }


        public void testEmployeeInfoCompany() {
            EmployeeInfo employee1 = new EmployeeInfo(1);
            EmployeeInfo employee2 = new EmployeeInfo("John Doe", 2);
            EmployeeInfo.companyName = "Fortune 500 Corp";

            assertEquals("Fortune 500 Corp", employee1.companyName);
            assertEquals("Fortune 500 Corp", employee2.companyName);
        }
    }
}
