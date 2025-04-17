public class Main
{
  public static void main(String [] args)
  {
    // Student(String name, int age, String gender, String idNum, double gpa)
    Person me = new Student("H", 3, "F", "2584", 4.0);
    
    System.out.println("Hi, " + me.getName() + ". What's your GPA?");
    System.out.println("My GPA is: " + ((Student)me).getGPA());

    Teacher you = new Teacher("C", 30, "F", "G", 100);
    System.out.println("My teacher is: " + you);
    
    CollegeStudent him = new CollegeStudent("Jack", 19, "Male", "1023912", 3.56, 2, "Computer Science");
    System.out.println(him);
  }
}
