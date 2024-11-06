package biography.of_a.famous.person;

import java.util.Scanner;

public class BiographyOf_aFamousPerson {
    
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Famous Actor");
        String name = scanner.nextLine();
        
        System.out.print("Birth Name");
        String birthname = scanner.nextLine();
        
        System.out.print("Birthplace");
        String pob = scanner. nextLine();
        
        System.out.print("Age");
        String age = scanner.nextLine();
        
        System.out.print("Height in Meters");
        String height = scanner.nextLine();
        
        System.out.print("Gender");
        String gender = scanner.nextLine();
        
        System.out.print("Father's Name");
        String father = scanner.nextLine();
        
        System.out.print("Net Worth");
        String nw = scanner.nextLine();
        
        System.out.print("Number of Children");
        String numOfchildren = scanner.nextLine();
        
        System.out.print("Occupation");
        String job = scanner.nextLine();
        
        // Output
        System.out.println("------ Biography ------");
        System.out.println("Name: " + name);
        System.out.println("Real Name: " + birthname);
        System.out.println("Place of Birth: " + pob);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("Father: " + father);
        System.out.println("Net Worth: " + nw);
        System.out.println("Number of Children: " + numOfchildren);
        System.out.println("Occupation: " + job);
                                
      
    }
    
}
