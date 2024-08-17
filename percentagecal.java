import java.util.*;
public class percentagecal {
   static float sub1 , sub2 , sub3 , sub4 , sub5 ;
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("WLCOME TO PERCENTAGE CALCULATOR.");
        System.out.println("NOW ADD YOUR MARKS OF EACH SUBJECTS(eg.95 out of 100).");

            while(true){
                System.out.println("Enter your marks of Subject-1 : ");
                sub1 = sc.nextFloat();

                    if(sub1<=100)
                 break;
                    else{
                System.out.println("Invalid Marks. Try Again.");
            }
        }   
            while(true){
                System.out.println("Enter your marks of Subject-2 : ");
                sub2 = sc.nextFloat();

                    if(sub2<=100)
                break;
                    else{
                System.out.println("Invalid Marks. Try Again.");
            }
        }
            while(true){
                System.out.println("Enter your marks of Subject-3 : ");
                sub3 = sc.nextFloat(); 

                    if(sub3<=100)
                break;
                    else{
                System.out.println("Invalid Marks. Try Again.");
            }
        }
            while(true){
                System.out.println("Enter your marks of Subject-4 : ");
                sub4 = sc.nextFloat();

                    if(sub4<=100)
                break;
                    else{
                System.out.println("Invalid Marks. Try Again.");
            }
        }
            while(true){
                System.out.println("Enter your marks of Subject-5 : ");
                sub5 = sc.nextFloat();  

                    if(sub5<=100)
                break;
                    else{
                System.out.println("Invalid Marks. Try Again.");
            }
        }
        
        float sum = sub1+sub2+sub3+sub4+ sub5 ;   
        float per = sum/500 * 100 ; 
        System.out.println("Your Percentage is " + per +" %");
//METHOD----------------------------------------------------------------------------------------1
    // sc.nextLine();
    
        // System.out.println("Do You Want To Convert Your Percenatge to CGPA or SGPA ?(YES or No)");
        // System.out.println("A. YES");
        // System.out.println("B. NO");
        //     String st = new String();
        //    st = sc.next();
        //         switch (st) {
        //             case "YES":
        //             System.out.println("Make a Choice:(1 or 2) \n 1. CGPA \n 2. SGPA");
        //                 float choice = sc.nextFloat();
        //                     if(choice==1){
        //                         System.out.println("Your CGPA is "+per/9.5);
        //                         break;
        //                     }else if(choice==2){
        //                         System.out.println("Your SGPA is "+(per+7.5)/10);
        //                         break;
        //                     }

                        
        //                 break;

        //             case "NO":
        //                         System.out.println("Thank you. Visit again");
        //                 break;
                
        //             default:
        //                 break;
        //         }


//METHOD-----------------------------------------------------------------------------------------------2
        System.out.println("Do You Want To Convert Your Percenatge to CGPA or SGPA ?(YES or No)");
            String st = new String();
            System.out.println("1. YES \n2. No ");
            st = sc.next();

            if(st.equalsIgnoreCase("YES")) { //Yeah
                 
                    System.out.println("Choose The Option As Your Choice.\n No1. CGPA \n No2. SGPA");
                           String st3 = sc.next();
                            if(st3.equalsIgnoreCase("CGPA")){
                                System.out.println("Your CGPA is "+per/9.5);
                            }else if(st3.equalsIgnoreCase("SGPA")){
                                System.out.println("Your SGPA is "+(per+7.5)/10);
                            }
                         }
            
            else if (st.equalsIgnoreCase("NO")){ //no
                System.out.println("Thank You For Using Calculator");  
            }
        
            

    sc.close();
        }
        
    }