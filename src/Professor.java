import java.util.List;

public class Professor extends User {
    private List<Course> courses;
    private List<Student> advisees;

//    boolean addAdvisee(Student){
//
//    }
//
//    boolean removeAdvisee(Student){
//
//    }

    List<Student> getAdvisees(){
        return advisees;
    }
}
