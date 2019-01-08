import java.util.*;

public class Data {
        private static int counter = 0;
        private int id = 0;
        private ArrayList<String> info = new ArrayList<String>();
        public Data() {
                this.counter++;
                this.id = this.counter;
        }
        public void insertInfo(String newInfo){
                this.info.add(newInfo);
        }
        public ArrayList<String> getInfo(){
                return this.info;
        }
        public int getId(){
                return this.id;
        }
        public void setId(int id){
                this.id = id;
        }
        
}
