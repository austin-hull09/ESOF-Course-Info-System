import java.util.List;

public class Professor extends User {
    private List<Course> courses;
    private List<Student> advisees;

    public Professor(){
        this.setStrategy();
    }

    boolean addAdvisee(Student student){
        return true;
    }

    boolean removeAdvisee(Student student){
        return true;
    }

    List<Student> getAdvisees(){
        return advisees;
    }

    @Override
    public void setStrategy() {
        this.strategy = new ProfessorStrategy();
    }
}
