/**import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the Endowment id");
        String id=sc.nextLine();
        System.out.println("Enter the Holder Name");
        String H_name=sc.nextLine();
        System.out.println("Enter the Endowment Type");
        String E_type=sc.nextLine();
        System.out.println("Enter the Registration date");
        String R_date=sc.nextLine();

        Endowment ew=new Endowment(id,H_name,E_type,R_date);
        ew.setEndowmentId(id);
        ew.setHolderName(H_name);
        ew.setEndowmentType(E_type);
        ew.setRegistratiomDate(R_date);


        if(E_type.equals("Educational")) {
            System.out.println("Enter the Educational Institution");
            String E_institution = sc.nextLine();
            System.out.println("Enter the Educational Division");
            String E_division = sc.nextLine();

            EducationalEndowment ee=new EducationalEndowment(id,H_name,E_type,R_date,E_institution,E_division);
            ee.setEducationalInstitution(E_institution);
            ee.setEducationalDivision(E_division);
            double res=ee.calculateEndowment();
            System.out.printf("Endowmwnt Amount %.2f",res);

        }
        else if(E_type.equals("health")){
            System.out.println("Enter Health Care Center");
            String H_center = sc.nextLine();
            System.out.println("Enter Holder Age");
            int H_age = sc.nextInt();

            HealthEndowment he=new HealthEndowment(id,H_name,E_type,R_date,H_center,H_age);
            he.setHealthCareCenter(H_center);
            he.setHolderAge(H_age);
            double res=he.calculateEndowment();
            System.out.printf("Endowmwnt Amount %.2f",res);
        }
        else {
            System.out.println(E_type +" is an invalid endowmwnt type");


        }


    }
}
**/