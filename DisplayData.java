import java.util.*;

public class DisplayData {
        public static ArrayList<Data> showData(ArrayList<Data> info){
                if (info.size() == 0){
                        System.out.println("The database is Empty. Nothing to display!");
                        return info;
                } else {                                             
                    for(int i = 0; i < info.size(); i++) {
                        System.out.println("Id:" + info.get(i).getId());
                        System.out.println("Data:" + info.get(i).getInfo());
                        System.out.println();
                    }
                }
                return info;
        }
}