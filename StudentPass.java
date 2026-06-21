public class StudentPass {
      public static void main(String[] args) {
        int marks = 30;
        boolean sportsQuota = true;

        if (marks >= 35 || sportsQuota) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }
    }
}
