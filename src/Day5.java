import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("******** While loop *********");
        while (count < 3){
            System.out.println(count);
            count++;
        }

        System.out.println();

        // do while loop
        int a = 0;
        System.out.println("******** Do while loop *********");
        do {
          System.out.println(a);
          a++;
        }while (a < 3);

        System.out.println();

        // for loop
        System.out.println("******** For loop *********");
        for (int i = 0; i < 3; i++){
            System.out.println(i);
        }
        System.out.println();

        // foreach loop (enhanced for loop)
        // need an array, because for each loops can only loop over a collection
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("******** For each loop *********");

        for (int num : nums){
            System.out.println(num);
        }

        System.out.println();

        Scanner in = new Scanner(System.in);
        carPrompt(in);
        shorterCarPrompt(in);
    }
    public static void shorterCarPrompt(Scanner input){
        String car = "";

        // do-while loops do end in a semi-colon
        // while loops do not end in a semi-colon
        do{
            if(car.trim().equalsIgnoreCase("Volkswagen") ||
                    car.trim().equalsIgnoreCase("VW")){
                System.out.println("That brand sucks, pick a better one!");
            }

            System.out.print("Enter a valid car brand: ");
            car = input.nextLine();
        }while(car.trim().equalsIgnoreCase("Volkswagen") ||
               car.trim().equalsIgnoreCase("VW") ||
                car.trim().equalsIgnoreCase("")) ;
    }

    public static void carPrompt(Scanner input){
        System.out.print("Enter a car: ");
        String car = input.nextLine();

        // if the input is not valid, we repeat the prompt
        while (car.trim().equalsIgnoreCase("Volkswagon") ||
            car.trim().equalsIgnoreCase("VW") ||
            car.trim().equalsIgnoreCase("")) {
              System.out.println("That car sucks, pick a better one");
              System.out.print("Enter a car brand: ");
            car = input.nextLine();
        }

        System.out.println("Great Choice!");
    }

}
