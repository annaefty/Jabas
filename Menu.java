import java.util.*;

public class Menu {
        public static ArrayList<Data> info=new ArrayList<Data>();
        
        public static void main(String[] args) {
                System.out.println("Welcome to The Database");
                int id;
                Scanner reader = new Scanner(System.in);
                String answer="";
                System.out.println("Would you like to check your Database or make changes ?");
                System.out.println("If you do insert -yes-");
                answer = reader.nextLine();
                if(answer.equalsIgnoreCase("yes")){
                        System.out.println("If you would like to check your Database insert the number -1-");
                        System.out.println("If you would like to add info to your Database insert the number -2-");
                        System.out.println("If you would like to remove info from your Database insert the number -3-");
                        System.out.println("If you would like to exit insert -exit-");
                        answer = reader.nextLine();
                        while(true){ 
                                if(answer.equals("1")){
                                        PrintDatabase.printData(info);
                                }
                                else if(answer.equals("2")){
                                        
                                        InsertData.addData(info);
                                        
                                }
                                else if(answer.equals("3")){
                                         try{
                                                 System.out.println("Insert the Id number of the info you wish to remove");
                                                 id = reader.nextInt();
                                                 RemoveData.deleteData(id,info);
                                                 answer=reader.nextLine();
                                         }
                                         catch (Exception e){
                                                  System.out.println("Wrong input. Id number is an integer number");
                                                  System.out.println("Now you will return to the main menu.");
                                         }
                                }
                                else if(answer.equalsIgnoreCase("exit")){
                                        System.out.println("Hope to see you again!!!");
                                        break;
                                }
                                else{
                                        System.out.println("Insert valid input!");
                                }
                                System.out.println("If you would like to check your Database insert the number -1-");
                                System.out.println("If you would like to add info to your Database insert the number -2-");
                                System.out.println("If you would like to remove info from your Database insert the number -3-");
                                System.out.println("If you would like to exit insert -exit-");
                                
                                answer=reader.nextLine();
                                
                        }
                        
                }  
                else{
                        System.out.println("Bye!!!");
                }
                
                reader.close();
        }
        
}
