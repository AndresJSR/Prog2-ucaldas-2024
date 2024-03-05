import java.util.Scanner;
public class Animal {
Scanner sc = new Scanner(System.in);
public String name_Animal = "";
public String originPlace_Animal = "";
public String species_Animal = "";

    public void inPutDataUser (){
        System.out.println("Enter animal name");
        name_Animal = sc.nextLine();
        System.out.println("Enter animal origin place");
        originPlace_Animal = sc.nextLine();
        System.out.println("Enter animal species");
        species_Animal = sc.nextLine();
    }
 



}