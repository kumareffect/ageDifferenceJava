import java.util.Scanner;

public class AgeDifference{
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter the day of Birthday of Ej Rani");
        String dayEj = scanner.nextLine();
        System.out.println("Enter the month of Birthday of Ej Rani");
        String monthEj = scanner.nextLine();
        System.out.println("Enter the year of Birthday of Ej Rani");
        String yearEj = scanner.nextLine();

        int day1 = Integer.parseInt(dayEj);
        int month1 = Integer.parseInt(monthEj);
        int year1 = Integer.parseInt(yearEj);



        System.out.println("Enter the day of Birthday of Kumar");
        String dayKumar = scanner.nextLine();
        System.out.println("Enter the month of Birthday of Kumar");
        String monthKumar = scanner.nextLine();
        System.out.println("Enter the year of Birthday of Kumar");
        String yearKumar = scanner.nextLine();

        int day2 = Integer.parseInt(dayKumar);
        int month2 = Integer.parseInt(monthKumar);
        int year2 = Integer.parseInt(yearKumar);


        System.out.println("The different between Kumar and Ej Rani Date of Birth is "+ (year1 - year2) + "years "+ (month2 - month1) +"months " + (day2 - day1) + "days");

        if(year1 > year2){
            System.out.println("Tum mujhse " + (year1 - year2) +" saal small ho? \n Hello chhoti larki kya haal chaal hai?");
        }
    }
}