public class StudentStrategy implements UserStrategy {

    @Override
    public void checkProgram() {
        System.out.println("This is the Program of Study and Comittee Form as seen by a student" );

    }

    @Override
    public void checkProgress() {

    }

    @Override
    public void printInfo() {

    }
}