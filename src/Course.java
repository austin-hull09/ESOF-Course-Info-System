import java.util.List;

public class Course {

    //holds information about each course
    //did not implement hashtable schedule as I did not have persistent users

    private String name;
    private int section;
    private String title;
    private int crn;

    private String professor;
    List<String> offerings;

    public int getCredits() {
        return credits;
    }

    private int credits = 3;
    String description = "Description from DegreeWorks";
    List<Course> prerequisites;

    //setters and getters
    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

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
        System.out.println("Prerequisites include: ...");
    }


    //stub methods
    boolean addStudent(Student student){
        System.out.println("Student added!");
        return true;
    }

    boolean dropStudent(Student student){
        System.out.println("Student dropped!");
        return true;
    }



}
