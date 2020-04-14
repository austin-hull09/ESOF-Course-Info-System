public class Student extends User {

    public Student(){
        this.setStrategy();
    }

    @Override
    public void setStrategy() {
        this.strategy = new StudentStrategy();
    }
}
