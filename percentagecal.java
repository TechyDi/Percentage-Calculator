import java.util.*;
public class percentagecal {
   static float sub1 , sub2 , sub3 , sub4 , sub5 ;
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

         System.out.println("WLCOME TO PERCENTAGE CALCULATOR.");
        // System.out.println("NOW ADD YOUR MARKS OF EACH SUBJECTS(eg.95 out of 100).");

        //     while(true){
        //         System.out.println("Enter your marks of Subject-1 : ");
        //         sub1 = sc.nextFloat();

        //             if(sub1<=100)
        //          break;
        //             else{
        //         System.out.println("Invalid Marks. Try Again.");
        //     }
        // }   
        //     while(true){
        //         System.out.println("Enter your marks of Subject-2 : ");
        //         sub2 = sc.nextFloat();

        //             if(sub2<=100)
        //         break;
        //             else{
        //         System.out.println("Invalid Marks. Try Again.");
        //     }
        // }
        //     while(true){
        //         System.out.println("Enter your marks of Subject-3 : ");
        //         sub3 = sc.nextFloat(); 

        //             if(sub3<=100)
        //         break;
        //             else{
        //         System.out.println("Invalid Marks. Try Again.");
        //     }
        // }
        //     while(true){
        //         System.out.println("Enter your marks of Subject-4 : ");
        //         sub4 = sc.nextFloat();

        //             if(sub4<=100)
        //         break;
        //             else{
        //         System.out.println("Invalid Marks. Try Again.");
        //     }
        // }
        //     while(true){
        //         System.out.println("Enter your marks of Subject-5 : ");
        //         sub5 = sc.nextFloat();  

        //             if(sub5<=100)
        //         break;
        //             else{
        //         System.out.println("Invalid Marks. Try Again.");
        //     }
        // }
        
        // // float sum = sub1+sub2+sub3+sub4+ sub5 ;   
        // // float per = sum/500 * 100 ; 
        // System.out.println("Your Percentage is " + (sub1+sub2+sub3+sub4+ sub5)/500 * 100 +" %");

        System.out.println("Do You Want To Convert Your Percenatge to CGPA or SGPA ?");
            String st = new String("Yes");
            String st2 = new String("No");
        System.out.println(st);
        System.out.println(st2);
                st = sc.nextLine();
                st2 = sc.nextLine();

            if(st.equalsIgnoreCase("Yes")) {
                int No1 , No2 ;
                    System.out.println("Choose The Option As Your Choice.\n No1. CGPA \n No2. SGPA");
                        No1 = sc.nextInt();
                        No2 = sc.nextInt();

            }
            else if (st)

    sc.close();
        }
        
    }