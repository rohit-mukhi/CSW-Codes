import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question7 {

    private static void printMemoryUsage(Runtime run, SimpleDateFormat sdf, String label) {
        long freeMemory = run.freeMemory()/(1024*1024);
        long totalMemory = run.totalMemory()/(1024*1024);
        long usedMemory = (totalMemory - freeMemory)/(1024*1024);
        String timeStamp = sdf.format(new Date());
        System.out.printf("[%s]%s - Total heap : %d MB | Free heap : %d MB | Used heap : %d MB%n", timeStamp, label, totalMemory, freeMemory, usedMemory);
    }
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        printMemoryUsage(run, sdf, " | Before enrollment");
        List<Student> students = new ArrayList<>();
        for(int i=0; i<=3; i++) {
            Student student = new Student("Student" + i, 1000+i);
            student.enrolledCourses("Course A");
            student.enrolledCourses("Course B");
            students.add(student);
        }

        for(Student student : students) {
            student.display();
        }

        printMemoryUsage(run, sdf, " | After enrollemnt");

        students.clear();
        System.gc();

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Student {

    private String name;
    private int id;
    private List<String> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
        System.out.println("Student enrolled : " + this.name + " | ID : " + this.id);
    }

    public void enrolledCourses(String course) {
        courses.add(course);
        System.out.println(this.name + " enrolled in : " + course);
    }

    public void display() {
        System.out.println("\nStudent name : " + this.name);
        System.out.println("Student ID : " + this.id);
        System.out.println("Enrolled course : " + courses);
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Student Deleted\nName : " + this.name + " | ID : " + this.id);
    }
}

