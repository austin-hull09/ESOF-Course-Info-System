/**Author: Austin Hull
 * github.com/austin-hull09
 */

import java.util.List;

public class Student extends User {

    //creates student from user

    private int current_semester;
    private Professor advisor;
    private List<Course> degreeProgress;
    private List<Course> registeredClasses;

    public Student(){
        this.setStrategy();
    }

    @Override
    public void setStrategy() {
        this.strategy = new StudentStrategy();
    }
}
