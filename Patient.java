import java.io.*;
import java.util.Scanner;
public class Patient
{
    String Patient_name;
    int Patient_age,Patient_oxy_level,hrct_report;

    public static void main(String args[])
    {
        Patient p = new Patient();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Patient Information");
        System.out.print("Enter Patient name :");
        p.Patient_name = sc.next();
        System.out.println();
        System.out.print("Enter Patient Age :");
        p.Patient_age=sc.nextInt();
        System.out.println();
        System.out.print("Enter Patient oxygen level :");
        p.Patient_oxy_level=sc.nextInt();
        System.out.println();
        System.out.print("Enter Patient HRCT report :");
        p.hrct_report=sc.nextInt();

        if (p.Patient_oxy_level<95 && p.hrct_report > 10)
        {
            throw new ArithmeticException("Patient is covid postive");
        }
    
        System.out.println("Name :"+p.Patient_name);
        System.out.println("Age :"+p.Patient_age);
        System.out.println("Patient Oxygen level :"+p.Patient_oxy_level);
        System.out.println("Hrct report :"+p.hrct_report);
    }
}