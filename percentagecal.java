import java.util.*;
public class percentagecal {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("WLCOME TO PERCENTAGE CALCULATOR.");
        System.out.println("NOW ADD YOUR MARKS OF EACH SUBJECTS(eg.95 out of 100).");

        System.out.println("Enter your marks of Subject-1 : ");
            float sub1 = sc.nextFloat();
        System.out.println("Enter your marks of Subject-2 : ");
            float sub2 = sc.nextFloat();
        System.out.println("Enter your marks of Subject-3 : ");
            float sub3 = sc.nextFloat();    
        System.out.println("Enter your marks of Subject-4 : ");
            float sub4 = sc.nextFloat();
        System.out.println("Enter your marks of Subject-5 : ");
            float sub5 = sc.nextFloat();  

        float sum=sub1+sub2+sub3+sub4+sub5;   
        float per = sum/500 * 100 ; 
        System.out.println("Your Percentage is " + per +" %");

    sc.close();
    }
}