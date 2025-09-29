// Base Class
class Course {
    String title;
    String instructor;
    String enrollmentDate;

    Course(String title, String instructor, String enrollmentDate) {
        this.title = title;
        this.instructor = instructor;
        this.enrollmentDate = enrollmentDate;
    }

    // Method to be overridden
    public void showProgress() {
        System.out.println("Progress for course: " + title);
    }
}

// Video Course
class VideoCourse extends Course {
    int completionPercentage;
    int watchTime; // in hours

    VideoCourse(String title, String instructor, String enrollmentDate,
                int completionPercentage, int watchTime) {
        super(title, instructor, enrollmentDate);
        this.completionPercentage = completionPercentage;
        this.watchTime = watchTime;
    }

    @Override
    public void showProgress() {
        System.out.println("\n--- Video Course ---");
        System.out.println("Title: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrollment Date: " + enrollmentDate);
        System.out.println("Completion: " + completionPercentage + "%");
        System.out.println("Watch Time: " + watchTime + " hours");
    }
}

// Interactive Course
class InteractiveCourse extends Course {
    int quizScore;
    int projectsCompleted;

    InteractiveCourse(String title, String instructor, String enrollmentDate,
                      int quizScore, int projectsCompleted) {
        super(title, instructor, enrollmentDate);
        this.quizScore = quizScore;
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public void showProgress() {
        System.out.println("\n--- Interactive Course ---");
        System.out.println("Title: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrollment Date: " + enrollmentDate);
        System.out.println("Quiz Score: " + quizScore + "%");
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}

// Reading Course
class ReadingCourse extends Course {
    int pagesRead;
    int notesTaken;

    ReadingCourse(String title, String instructor, String enrollmentDate,
                  int pagesRead, int notesTaken) {
        super(title, instructor, enrollmentDate);
        this.pagesRead = pagesRead;
        this.notesTaken = notesTaken;
    }

    @Override
    public void showProgress() {
        System.out.println("\n--- Reading Course ---");
        System.out.println("Title: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrollment Date: " + enrollmentDate);
        System.out.println("Pages Read: " + pagesRead);
        System.out.println("Notes Taken: " + notesTaken);
    }
}

// Certification Course
class CertificationCourse extends Course {
    int examAttempts;
    boolean certified;

    CertificationCourse(String title, String instructor, String enrollmentDate,
                        int examAttempts, boolean certified) {
        super(title, instructor, enrollmentDate);
        this.examAttempts = examAttempts;
        this.certified = certified;
    }

    @Override
    public void showProgress() {
        System.out.println("\n--- Certification Course ---");
        System.out.println("Title: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrollment Date: " + enrollmentDate);
        System.out.println("Exam Attempts: " + examAttempts);
        System.out.println("Certified: " + (certified ? "Yes ✅" : "No ❌"));
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Course v1 = new VideoCourse("Java Basics", "Alice", "01-09-2025", 75, 10);
        Course i1 = new InteractiveCourse("Python Hands-on", "Bob", "05-09-2025", 85, 3);
        Course r1 = new ReadingCourse("OS Theory", "Charlie", "10-09-2025", 120, 15);
        Course c1 = new CertificationCourse("AWS Cloud", "David", "12-09-2025", 2, true);

        // Polymorphism in action
        v1.showProgress();
        i1.showProgress();
        r1.showProgress();
        c1.showProgress();
    }
}
