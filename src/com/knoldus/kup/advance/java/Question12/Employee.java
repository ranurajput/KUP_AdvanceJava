package com.knoldus.kup.advance.java.Question12;
        import java.io.*;
        import java.util.Scanner;

public class Employee {
    int empID,empAge;
    String empName;
    Employee(int empID, String empName,int empAge){
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
    }
    @Override
    public String toString() {
        return " Employee Id = " + empID +
                ", Name = " + empName +
                ",\tAge = " + empAge ;
    }

    //    Using static block as per the question requirement
    static {
//        creating two ref of BufferedReader class
        BufferedReader br,br2;
        FileReader file,file1;
        String line;
//        the lineNumber will hold the number of lines in the file
        int lineNumber = 0;
        String data[] ;
        Employee[] employee = null ;
        Scanner sc =new Scanner(System.in);
        try {
            file1 =new FileReader("src/com/knoldus/kup/advance/java/Question12/Employee.txt");

//         this will count the lines in the text file
            br2=new BufferedReader(file1);
            while (br2.readLine()!= null){
                lineNumber++;
            }
            br2.close();
            file1.close();

//            Here we will start read the file
            employee = new Employee[lineNumber];
            file = new FileReader("src/com/knoldus/kup/advance/java/Question12/Employee.txt");
            br=new BufferedReader(file);

//            here we are getting the data line by line and storing the employee object
//            in the employee[] array after initialization of employee class objects.
            int i =0;
            while ((line = br.readLine()) != null){
                data = line.split(",");
                employee[i] = new Employee(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
                i++;
            }

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        int in;
        do {
//                It will print the list of employees
            for (Employee emp: employee) {
              System.out.println(emp);
            }
            System.out.println("=========== Enter your choice ===========\n" +
                    "Edit: Press 1 to Edit\n" +
                    "Exit: Press 2 to Exit");
            in = sc.nextInt();
            if(in == 1){
                Employee employees[] = editEmployee(employee);
//                    Calling updateFile method()
                updateFile(employees);
            }
        }while (in !=2 );
    }
    //    editEmployee will return an array of Employee type after updation
    static Employee[] editEmployee(Employee[] employees){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter employee id");
        int empid = sc.nextInt();
        for (int i = 0; i<employees.length; i++) {
            if(employees[i].empID == empid){
                System.out.println ("Enter Name");
                String editName = sc.next();
                System.out.println("Enter Age");
                int editAge = sc.nextInt();
                employees[i].empName = editName;
                employees[i].empAge = editAge;
            }
        }
        return employees;
    }
    //    updateFile method will take a Employee[] type argument and update the data in Employee.txt file
    static void updateFile(Employee[] employees){
        FileWriter writer = null;
        File fileToBeModified = new File("src/com/knoldus/kup/advanceJava/ques12/Employee.txt");
        String newContent ="";
        try {
            for (Employee emp:employees) {
                newContent = newContent + emp.empID+","+emp.empName+","+emp.empAge+System.lineSeparator();
            }
            System.out.println(newContent);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
            System.out.println("File updated successfully");
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                writer.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
    }
}
