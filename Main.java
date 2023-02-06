import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasBuiltArray = false;
        boolean again = true;
        Array array = null;

        StringBuilder menu = new StringBuilder();
        menu.append("Select one of the options below:\n");
        menu.append("\t1- Create an array.\n");
        menu.append("\t2- Find min.\n");
        menu.append("\t3- Find max.\n");
        menu.append("\t4- Find average and display differences.\n");
        menu.append("\t5- Find sum of odd indexed elements.\n");
        menu.append("\t6- Find sum of even indexed elements.\n");
        menu.append("\t7- Exit\n");

        do{
            System.out.println(menu);
            System.out.print("So? ");
            char reponse = scanner.nextLine().charAt(0);
            scanner.nextLine();

            switch(reponse){
                case '1':
                    System.out.println("Enter the size of your array: ");
                    int size = scanner.nextInt();
                    scanner.nextLine();
                                        
                    System.out.println("Creating an Array with size " + size);
                    array = new Array(size);
                    hasBuiltArray = true;
                    break;

                case '2':
                    if(!hasBuiltArray){
                        System.out.println("First you have to create an array Sir/Mam.\n");
                        break;
                    }

                    System.out.println("Finding the minimum of your array...");
                    int min = array.findMin();
                    System.out.println("Your array's minimum value is " + min);
                    break;

                case '3':
                    if(!hasBuiltArray){
                        System.out.println("First you have to create an array Sir/Mam.\n");
                        break;
                    }

                    System.out.println("Finding the maximum of your array...");
                    int max = array.findMax();
                    System.out.println("Your array's maximum value is " + max);
                    break;

                case '4':
                    if(!hasBuiltArray){
                        System.out.println("First you have to create an array Sir/Mam.\n");
                        break;
                    }

                    System.out.println("Finding the average of your array...");
                    int ave = array.findAverage();
                    System.out.println("Your array's average value is " + ave);
                    System.out.println("Differences of your array's elements and average:");
                    String diff = array.displayDifferences();
                    System.out.println(diff);
                    break;
                
                case '5':
                    if(!hasBuiltArray){
                        System.out.println("First you have to create an array Sir/Mam.\n");
                        break;
                    }

                    System.out.println("Finding the sum of your array's odd indexed elements...");
                    int sumOdd = array.findSumOdd();
                    System.out.println("It is " + sumOdd);
                    break;
                
                case '6':
                    if(!hasBuiltArray){
                        System.out.println("First you have to create an array Sir/Mam.\n");
                        break;
                    }

                    System.out.println("Finding the sum of your array's even indexed elements...");
                    int sumEven = array.findSumEven();
                    System.out.println("It is " + sumEven);
                    break;

                case '7':
                System.out.println("It was a pleasure.");
                again = false;            
            }
        }while(again);

        scanner.close();
    }
}