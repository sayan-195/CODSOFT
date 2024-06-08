import java.util.*;
public class Student_grade_calculator {

    public static void Grade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Subjects : ");
        int noOfSub = sc.nextInt();
        int maxMarks=100;
        double marks=0;
        double avgMarks;

        if(noOfSub<=0){
            System.out.println("Please Enter A valid number Of Subject");
            Grade();
        }else{
            for(int i=1;i<=noOfSub;i++){
                System.out.println("Enter Obtained Marks of Subject "+i+"(out of 100) : ");
                int getmarks = sc.nextInt();

                if(getmarks<0 || getmarks>100){
                    System.out.println("Please enter marks in the range of 0 and 100 ");
                }else{
                    marks+=getmarks;
                }
            }
            System.out.println("Total Marks : "+(int)marks);
            avgMarks=(marks/(noOfSub));
            System.out.println("Average Percentage : "+avgMarks+" %");
            if((int)avgMarks>90 && (int)avgMarks<=100){
                System.out.println("Grade : O");

            }
            else if((int)avgMarks>80 && (int)avgMarks<=90){
                System.out.println("Grade : E");
            }
            else if((int)avgMarks>70 && (int)avgMarks<=80){
                System.out.println("Grade : A");
            }
            else if((int)avgMarks>60 && (int)avgMarks<=70){
                System.out.println("Grade : B");
            }
            else if((int)avgMarks>50 && (int)avgMarks<=60){
                System.out.println("Grade : C");
            }
            else if((int)avgMarks>40 && (int)avgMarks<=50){
                System.out.println("Grade : D");
            }else{
                System.out.println("Grade : F");
            }
        }
    }
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The Number Of Subjects : ");
        // int noOfSub = sc.nextInt();
        // int maxMarks=100;
        // double marks=0;
        // double avgMarks;

        // if(noOfSub<=0){
        //     System.out.println("Please Enter A valid number Of Subject");
        // }else{
        //     for(int i=1;i<=noOfSub;i++){
        //         System.out.println("Enter Obtained Marks of Subject "+i+"(out of 100) : ");
        //         int getmarks = sc.nextInt();

        //         if(getmarks<0 || getmarks>100){
        //             System.out.println("Please enter marks in the range of 0 and 100 ");
        //         }else{
        //             marks+=getmarks;
        //         }
        //     }
        //     System.out.println("Total Marks : "+(int)marks);
        //     avgMarks=(marks/(noOfSub));
        //     System.out.println("Average Percentage : "+avgMarks+" %");
        //     if((int)avgMarks>90 && (int)avgMarks<=100){
        //         System.out.println("Grade : O");

        //     }
        //     else if((int)avgMarks>80 && (int)avgMarks<=90){
        //         System.out.println("Grade : E");
        //     }
        //     else if((int)avgMarks>70 && (int)avgMarks<=80){
        //         System.out.println("Grade : A");
        //     }
        //     else if((int)avgMarks>60 && (int)avgMarks<=70){
        //         System.out.println("Grade : B");
        //     }
        //     else if((int)avgMarks>50 && (int)avgMarks<=60){
        //         System.out.println("Grade : C");
        //     }
        //     else if((int)avgMarks>40 && (int)avgMarks<=50){
        //         System.out.println("Grade : D");
        //     }else{
        //         System.out.println("Grade : F");
        //     }
        // }
        Grade();

    }
    
}
