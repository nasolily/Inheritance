public class Person {
    private String firstName;
    private String lastName;
    private String IDNum;
    private String title;
    private int YOB;

    public Person(String firstName, String lastName, String IDNum, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNum = IDNum;
        this.title = title;
        this.YOB = YOB;
    }

    //Getters and Setters

    public String getIDNum() {
        return IDNum;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDNum='" + IDNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }
    /**
     * Convert the Person object to a CSV data string.
     * @return A string in CSV format representing the Person object.
     */

    public String fullName() { return firstName + " " + lastName; }

    public String toCSVDataString() {
        return IDNum + "," + firstName + "," + lastName + "," + title + "," + YOB;
    }
}