package employeefile;

import java.util.Scanner;

/**
 *
 * @author The Promise Lane
 */
public class EmployeeApp {

    EmployeeDAO empList = new EmployeeDAO();
    Scanner sc = new Scanner(System.in);

    public EmployeeApp() {
        menuLoop();
    }

    private void menuLoop() {
        int id, patientNumber, bloodReading;
        String dateTime, comment;
        String choice = "1";
        while (!choice.equals("0")) {
            System.out.println("\nBlood Sugar Readings");
            System.out.println("0 = Quit");
            System.out.println("1 = List All Records");
            System.out.println("2 = Create New Record");
            System.out.println("3 = Retrieve Record");
            System.out.println("4 = Update Record");
            System.out.println("5 = Delete Record");
            choice = Validator.getLine(sc, "Number of choice: ", "^[0-5]$");

            switch (choice) {
                case "1":
                    System.out.println(empList.toString());
                    break;
                case "2":
                    id = Validator.getInt(sc, "New database ID: ");
                    patientNumber = Validator.getInt(sc, "Patient Number: ");
                    dateTime = Validator.getLine(sc, "Date/Time (2015-09-01T10:15:00): ");
                    bloodReading = Validator.getInt(sc, "Blood Reading: ");
                    comment = Validator.getLine(sc, "Comment: ");
                    empList.createRecord(new Employee(id, patientNumber, dateTime, bloodReading, comment));
                    break;
                case "3":
                    id = Validator.getInt(sc, "Database ID to retrieve: ");
                    System.out.println(empList.retrieveRecord(id));
                    break;
                case "4":
                    id = Validator.getInt(sc, "Database ID to update: ");
                    patientNumber = Validator.getInt(sc, "Patient Number: ");
                    dateTime = Validator.getLine(sc, "Date/Time (2015-09-01T10:15:00): ");
                    bloodReading = Validator.getInt(sc, "Blood Reading: ");
                    comment = Validator.getLine(sc, "Comment: ");
                    empList.updateRecord(new Employee(id, patientNumber, dateTime, bloodReading, comment));
                    break;
                case "5":
                    id = Validator.getInt(sc, "Database ID to delete: ");
                    System.out.println(empList.retrieveRecord(id));
                    String ok = Validator.getLine(sc, "Delete this record? (y/n) ", "^[yYnN]$");
                    if (ok.equalsIgnoreCase("Y")) {
                        empList.deleteRecord(id);
                    }
                    break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new EmployeeApp();
    }
}
