public class Teacher extends Person{
    
    // TODO: Add fields.
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, String subject, double salary)
    {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // TODO Add methods

    public String toString(){
        // TODO: improve this.
        return super.toString() + ", is a teacher!";
    }
    public String getSubject(){
        return subject;
    }
    
    public String getSalary(){
        return salary;
    }
    public void setSalary(){
        salary = 100;
    }
    public void set Subject(){
        subject = "Math";
    }
}
