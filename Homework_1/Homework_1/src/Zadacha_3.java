import java.util.Scanner;

public class Zadacha_3 {
    public static void main(String[] arguments) {
    	
    	Scanner input = new Scanner(System.in,"UTF-8");
    	
        System.out.println("Enter First name:");
        String firstname = input.nextLine();
        
        System.out.println("Enter Last name:");
        String lastname = input.nextLine();
        
        System.out.println("Enter age:");
        byte age = input.nextByte();
        
        System.out.println("Enter sex: M - Male; F - Female:");
        char sex = input.next().charAt(0);
        
        System.out.println("Enter ID number:");
        long ID = input.nextLong();
        
        System.out.println("Enter Bulgarian Mobile Number (Without starting with 0 or +359):");
        int BMN = input.nextInt();
        
        System.out.print("First name: ");
        System.out.println(firstname);
        
        System.out.print("Last name: ");
        System.out.println(lastname);
        
        System.out.print("Age: ");
        System.out.println(age);
        
        System.out.print("Sex: ");
        System.out.println(sex);
        
        System.out.print("ID number: ");
        System.out.println(ID);
        
        System.out.print("Mobile Number: +359 ");
        System.out.println(BMN);
        
        input.close();
    }
}