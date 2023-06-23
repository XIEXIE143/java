package exam.lesson;

import java.util.HashMap;

public class MapApp {
    public static void main(String[] args) {
        HashMap<String, String> foodMap = new HashMap<>();
        foodMap.put("F0001", "Apple");
        foodMap.put("F0002", "Peach");
        foodMap.put("F0003", "Grape");

        String selectFood = foodMap.get("F0002");
        System.out.println(selectFood);

        for (String foodName : foodMap.values()){
            System.out.println(foodName);
        }
        System.out.println("--- keySet() ---");
        for (String code : foodMap.keySet()){
            System.out.println(code);
        }
    }
}