import java.util.*;


public class RemoveData {
        public static ArrayList<Data> deleteData(int id, ArrayList<Data> info){
                if (info.size() == 0){
                        System.out.println("The database is Empty.Nothing to remove\n");
                        return info;
                } else {                                             
                        int index;
                        boolean unfound = false;
                        for(Data x: info){
                                if (x.getId() == id) {
                                        index = info.indexOf(x);
                                        info.remove(index);
                                        unfound = true; 
                                        break;
                                }
                        }
                        if (unfound == false) {
                                System.out.println("The item with id number "+ id +" was not found\n");
                                return info;
                        }
                }
                return info;
        }
}