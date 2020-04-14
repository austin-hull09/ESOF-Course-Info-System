import java.util.Scanner;

public class UserInterface {
    public UserInterface(){
        Scanner in = new Scanner(System.in);
        boolean run = true;
        User user = new User();

        //check if student, professor, or adviser
        System.out.println("Welcome to Course Information System!");
        System.out.println("Select A for Adviser, P for Professor, or S for Student");
        String input = in.next().toLowerCase();
        switch(input){
            case "a":
                System.out.println("You are an adviser!");
                user = new Professor();
                break;
            case "p":
                System.out.println("You are a professor!");
                user = new Professor();
                break;
            case "s":
                System.out.println("You are a student!");
                user = new Student();
                break;
        }

        CourseList cl = new CourseList();
        cl.readClasses();

        //user interface
        while(run){
            System.out.println("Make a Selection or press Q to quit");
            System.out.println("1: Check Course Information");
            System.out.println("2: See Program of Study");
            System.out.println("3: Determine Major/Minor Courses");
            System.out.println("4: Enter User Information");
            input = in.next().toLowerCase();
            in.nextLine();

            switch(input){
                case("q"):
                    run = false;
                    break;
                case("1"):
                    System.out.println("Enter course: ");
                    input= in.nextLine().toLowerCase();
                    int count = 0;
                    int sections = 0;
                    while(input.compareTo(cl.getCourseList().get(count).getName().toLowerCase())!= 0){
                        count+=1;
                    }

                    System.out.println();
                    cl.getCourseList().get(count).getInfo();

                    while(input.compareTo(cl.getCourseList().get(count).getName().toLowerCase())== 0){
                        count+=1;
                        sections+=1;
                    }

                    System.out.println("There are "+sections+" section(s) of this class");
                    System.out.println();
                    break;

                case("2"):
                    user.checkProgram();
                    break;

                case("3"):

                case("4"):
                    user.enterInfo();
                    break;
            }

        }

    }
}
