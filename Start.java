import java.util.*;

public class Start {

    public static void main(String[] args) throws Exception {
        int userInput;        

        boolean flag = true;

        Scanner input = new Scanner(System.in);
        
        ArrayList<Data> info = new ArrayList<Data>();

        while(flag) {
            System.out.println("--------------------------------------");
            System.out.println("Welcome to your database!");
            System.out.println("Choose between the following options");
            System.out.println("0 : Add new data");
            System.out.println("1 : Remove existing data");
            System.out.println("2 : Display existing data");
            System.out.println("3 : Exit the database");
            System.out.println("--------------------------------------");
            try {
                
                userInput = input.nextInt(); 
                
                switch(userInput) {
                    case 0:
                        InsertData.addData(info);
                        break;
                    case 1:
                        System.out.println("Enter an ID number of the entry you wish to remove");
                        userInput = input.nextInt();
                        RemoveData.deleteData(userInput, info);
                        break;
                    case 2:
                        DisplayData.showData(info);
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        System.out.println("Please choose between the numbers above, please try again!");
                        break;
                }
            } catch(Exception e) {
                
                System.out.println( e + "Invalid input!");
                System.out.println("Input must be a number.");
            }
        }

    }

}