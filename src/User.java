import java.util.Scanner;

//creates user objects, whether professor or student

public class User {

    Personal_Info info;
    UserStrategy strategy;

    public User() {

    }

    //moved print method to User class from strategy class
    void printInfo() {
        System.out.println("Name: "+ this.info.getName()+ "\n"+
                "NetID: "+ this.info.getNetID()+ "\n"+
                "SSN: "+ this.info.getSsn()+ "\n"+
                "Address: "+ this.info.getAddress()+ "\n"+
                "Phone: "+ this.info.getPhone()+ "\n"+
                "Major: "+ this.info.getMajor()+ "\n"+
                "Minor: "+ this.info.getMinor());

    }

    void checkProgram() {//calls to either StudentStrategy or ProfessorStrategy to check program
        strategy.checkProgram();
    }

    void checkProgress() {//calls to either StudentStrategy or ProfessorStrategy to check progress
        strategy.checkProgress();
    }

    public void setStrategy(){//implemented in User and Professor classes
    }


    void enterInfo() {//enter Personal_Info
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = in.nextLine();

        System.out.println("Enter netID: ");
        String netID = in.nextLine();

        System.out.println("Enter SSN: ");
        String ssn = in.nextLine();

        System.out.println("Enter address: ");
        String address = in.nextLine();

        System.out.println("Enter phone number: ");
        String phone = in.nextLine();

        System.out.println("Enter major: ");
        String major = in.nextLine();

        System.out.println("Enter minor (or N/A if none)");
        String minor = in.nextLine();


        this.info = new Personal_Info();
        this.info.setName(name);
        this.info.setNetID(netID);
        this.info.setSsn(ssn);
        this.info.setAddress(address);
        this.info.setPhone(phone);
        this.info.setMajor(major);
        this.info.setMinor(minor);
    }
}