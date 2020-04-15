import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CourseList {

    //holds all courses

    public int size = 0;

    private List<Course> courseList= new ArrayList<Course>();



    void addCourse(Course course){
        size+=1;
        courseList.add(course);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    void readClasses(){

        String file = "2020-Spring_ScheduleData_20191226.csv";
        BufferedReader br;
        String line = "";
        String csvSplit= ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"; //split on commas but ignore commas within ""
        String space = "^\\s+";

        try {
            br = new BufferedReader(new FileReader(file));
            line = br.readLine();
            line = br.readLine();
            while(line !=null){ //for each line in file, split into course fields and build Course object
                String[] lines = line.split(csvSplit);

                String name = lines[1].split("-")[0];
                int section = Integer.parseInt(lines[1].split("-")[1]);
                String title = lines[2];
                int crn = Integer.parseInt(lines[3]);
                String professor = lines[4];

                Course temp = new Course(name);
                temp.setCrn(crn);
                temp.setSection(section);
                temp.setTitle(title);
                temp.setProfessor(professor);

                addCourse(temp);

                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File failed");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
