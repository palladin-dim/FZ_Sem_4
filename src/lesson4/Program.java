package lesson4;

import java.util.Set;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Human> map = new HashMap<>();
        map.put("Андрей", new Human("Андрей", 34));
        map.put("Александр", new Human("Александр", 30));
        map.put("Сергей", new Human("Сергей", 40));

        System.out.println(map.get("Сергей")); // выводит объект класса Human с именем "Сергей" и возрастом 40

        // перебор всех элементов таблицы
        for (Bucket<String, Human> bucket : map.buckets) {
            Set<String> keys = bucket.keySet();
            for (String key : keys) {
                System.out.println(bucket.get(key));
            }
        }
    }
}
