/**Author: Austin Hull
 * github.com/austin-hull09
 */

import java.util.Scanner;

public class ProfessorStrategy implements UserStrategy {

    //strategy pattern for professors/advisers

    @Override
    public void checkProgram() {
        System.out.println("What student's form would you like to see?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("This is the Program of Study and Comittee Form for " + name);

    }

    @Override
    public void checkProgress() {
        System.out.println("What student's progress would you like to see?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name + " has completed: ...");
        System.out.println(name + " still needs to complete: ...");

    }

}
