public class ProfessorStrategy implements UserStrategy {

    @Override
    public void checkProgram() {
        System.out.println("This is the Program of Study and Comittee Form as seen by a Professor");

    }

    @Override
    public void checkProgress() {

    }

    @Override
    public void printInfo() {

    }
}
