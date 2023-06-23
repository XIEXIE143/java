package rpg.item;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

// public enum ItemType {
//     WEAPON, ARMOR, SHIELD;
// }

public class ItemList{
    private static String CS_PATH = "data/rpg/item.csv";
    public ArrayList<Item> list = new ArrayList<>();
    public Map<long, Item> map = new HashMap<>();

    public ItemList(){
        this.loadCsv();
    }

    public void loadCsv(){
        FileInputStream file;
        InputStreamReader reader;
        BufferedReader buffer;

        try{
            file = new FileInputStream(CSV_PATH);
            reader = new InputStreamReader(file);
            buffer = new BufferedReader(reader);

            String line = buffer.readLine();
            System.out.println(line);
        
        } catch (Exception e) {
            System.out.println(CSV_PATH + "が読み込めませんでした");
        }finally{
        }
}
}