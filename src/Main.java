public class EmployeeOnboardingSystem {


    final static String COMPANY_NAME = "HDFC Life";

    public static void main(String[] args) {

        String name = "Tanish Mhatre";
        int age = 22;
        String city = "Navi Mumbai";
        float joiningPercentage = 56.4f;
        char performanceGrade;


        System.out.println("Welcome to " + COMPANY_NAME + "!");
        System.out.println("Employee: " + name + " | Age: " + age + " | City: " + city);
        System.out.println("Joining Percentage: " + joiningPercentage);


        if (joiningPercentage > 90) {
            performanceGrade = 'A';
        } else if (joiningPercentage >= 75) {
            performanceGrade = 'B';
        } else if (joiningPercentage >= 60) {
            performanceGrade = 'C';
        } else {
            performanceGrade = 'D';
        }

        System.out.println("Performance Grade: " + performanceGrade);


        switch (performanceGrade) {
            case 'A':
                System.out.println("HR Feedback: Star Performer");
                break;
            case 'B':
                System.out.println("HR Feedback: Strong Start");
                break;
            case 'C':
                System.out.println("HR Feedback: Satisfactory");
                break;
            case 'D':
                System.out.println("HR Feedback: Needs Mentorship");
                break;
            default:
                System.out.println("HR Feedback: Invalid Grade");
        }


        System.out.println("\n--- Prime Employee Codes ---");
        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // not a prime
                }
            }
            if (!isPrime) continue;
            System.out.print(i + " ");
        }


        System.out.println("\n\n--- Badge Pattern ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        float monthlyCTC = 60000.50f;
        int monthlyCTCInt = (int) monthlyCTC;
        int annualCTC = monthlyCTCInt * 12;
        annualCTC += 10000; // bonus

        System.out.println("\nMonthly CTC (float): " + monthlyCTC);
        System.out.println("Monthly CTC (int): " + monthlyCTCInt);
        System.out.println("Annual CTC (after bonus): " + annualCTC);
    }
}
