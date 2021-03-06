/**Author: Austin Hull
 * github.com/austin-hull09
 */

import java.util.Scanner;


//creates print messages and menus for user

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
            default:
                throw new IllegalStateException("Unexpected value: " + input);
        }


        //read in classes from csv
        CourseList cl = new CourseList();
        cl.readClasses();

        //user interface for menus
        while(run){
            System.out.println("Make a Selection or press Q to quit");
            System.out.println("1: Check Course Information");
            System.out.println("2: See Program of Study");
            System.out.println("3: Determine Major/Minor Courses");
            System.out.println("4: Enter User Information");
            System.out.println("5: Print User Information");
            input = in.next().toLowerCase();
            in.nextLine();

            switch(input){
                case("q"):
                    run = false;
                    break;

                case("1")://Get course information- Requirement A.10
                    System.out.println("Enter course: ");
                    input= in.nextLine().toLowerCase();
                    cl.getCourse(input);
                    break;

                case("2"): //get program of study and committee form- Requirement A.11
                    user.checkProgram();
                    break;

                case("3"): //check major progress- Requirement A.13
                    user.checkProgress();
                    break;

                case("4"): //enter personal info
                    user.enterInfo();
                    break;

                case("5"): //print personal info
                    if(user.info!=null)
                        user.printInfo();
                    else
                        System.out.println("No user info found!");
            }
            System.out.println();

        }

    }
}
