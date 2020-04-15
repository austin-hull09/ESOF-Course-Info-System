public class StudentStrategy implements UserStrategy {

    //strategy pattern for students

    @Override
    public void checkProgram() {
        System.out.println("This is your Program of Study and Comittee Form");
    }

    @Override
    public void checkProgress() {

        System.out.println("You have completed: ...");
        System.out.println("You still need to complete: ...");
    }


}