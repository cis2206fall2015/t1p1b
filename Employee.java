package employeefile;

/**
 *
 * @author The Promised Lan
 */
public class Employee {

    private int empId;
    private int patientNumber;
    private String dateTime;
    private int bloodReading;
    private String comment;

    public Employee() {
        empId = 0;
        patientNumber = 0;
        dateTime = "";
        bloodReading = 0;
        comment = "";
    }

    public Employee(int empId, int patientNumber, String dateTime, int bloodReading, String comment) {
        this.empId = empId;
        this.patientNumber = patientNumber;
        this.dateTime = dateTime;
        this.bloodReading = bloodReading;
        this.comment = comment;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int EmpId) {
        this.empId  = empId;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getBloodReading() {
        return bloodReading;
    }

    public void setBloodReading(int bloodReading) {
        this.bloodReading = bloodReading;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", patientNumber=" + patientNumber + ", dateTime=" + dateTime + ", bloodReading=" + bloodReading + ", comment=" + comment + '}';
    }
}
