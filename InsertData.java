import java.util.*;

public class InsertData {

        public static ArrayList<Data> addData(ArrayList<Data> info){
                
                Scanner input = new Scanner(System.in);
                
                String answer;

                System.out.println("Creating new Id...");
                Data data = new Data();
                System.out.println("Created new entry with id: " + data.getId());
                
                System.out.println("Insert your data in the database.");
                answer = input.nextLine();
                
                data.insertInfo(answer); 

                while(true){

                        System.out.println("Do you want to add more data?");
                        System.out.println("To continue type: yes");
                        answer = input.nextLine();

                        if(answer.equalsIgnoreCase("yes")){
                                System.out.println("Insert information about this product");
                                answer = input.nextLine();
                                data.insertInfo(answer);
                        } else {
                                System.out.println("-Return to main menu-");
                                break;
                        }
                }
                info.add(data);

                return info;
        }
}
