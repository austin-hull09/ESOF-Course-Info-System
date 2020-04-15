public class Student extends User {

    //creates student from user

    public Student(){
        this.setStrategy();
    }

    @Override
    public void setStrategy() {
        this.strategy = new StudentStrategy();
    }
}
