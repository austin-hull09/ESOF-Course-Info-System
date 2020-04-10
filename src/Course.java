import java.util.Hashtable;
import java.util.List;

public class Course {
    private String name;
    private int section;
    private String title;
    private int crn;

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    private String professor;
//    Hashtable<Integer, List<String, String>> schedule;
    List<String> offerings;

    public int getCredits() {
        return credits;
    }

    private int credits = 3;
    String description = "Description from DegreeWorks";
    List<Course> prerequisites;

    public Course(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getSection() { return section; }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCrn(int crn){
        this.crn = crn;
    }

    public int getCrn() {
        return crn;
    }

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.title);
        System.out.println("Credits: " + this.credits);
        System.out.println(this.description);
        System.out.println("Prerequisites include: ");
    }
    //    boolean addStudent(Student){
//
//    }
//
//    boolean dropStudent(Student){
//
//    }
//
//    Professor getProfessor(){
//
//    }
//
//    String getCourseInfo(){
//
//    }

}
