class Employee {

public void displayEmployeeDetails() { 
System.out.println("Employee Details :- ");
System.out.println("Name : Khushi Khanvilkar");
System.out.println("Contact No : 7066363550");
System.out.println("Address : Nigdi");
}

public void displayCompanyDetails() {
System.out.println("Company Details :-");
System.out.println("Name : Infosys");
System.out.println("Address : Pune");
}

public static void main(String[] args) {
Employee e = new Employee();
e.displayEmployeeDetails();
e.displayCompanyDetails();
}
}