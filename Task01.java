
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * 
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
 * человек может иметь несколько телефонов.
 * 
 * Пусть дан список сотрудников:
 * 
 * Написать программу, которая найдёт и выведет повторяющиеся имена с
 * количеством повторений. Отсортировать по убыванию популярности.
 */
public class Task01 {

    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        HashMap<String, Integer> sortedMap = new HashMap<>();

        myMap.put("Иван Иванов", "444, 326");
        myMap.put("Светлана Петрова", "154");
        myMap.put("Кристина Белова", "46");
        myMap.put("Анна Мусина", "37511248");
        myMap.put("Анна Крутова", "6556");
        myMap.put("Иван Юрин", "+516");
        myMap.put("Петр Лыков", "22256565");
        myMap.put("Павел Чернов", "11151, 6516515, 616566");
        myMap.put("Петр Чернышов", "111114, 16516516");
        myMap.put("Мария Федорова", "65654846");
        myMap.put("Марина Светлова", "+375226984155");
        myMap.put("Мария Савина", "55616515, 6616165, 6546544");
        myMap.put("Мария Рыкова", "11616");
        myMap.put("Марина Лугова", "8943513");
        myMap.put("Анна Владимирова", "1486313613, 65153431");
        myMap.put("Иван Мечников", "54146, 4646");
        myMap.put("Петр Петин", "1616");
        myMap.put("Иван Ежов", "1777156161, 4646464874");
        int count = 0;

        for (Entry<String, String> pair : myMap.entrySet()) {
            int ind = pair.getKey().indexOf(" ");
            String name = pair.getKey().substring(0, ind);
            for (Entry<String, String> prpr : myMap.entrySet()) {
                int ind2 = prpr.getKey().indexOf(" ");
                if (name.equals(prpr.getKey().substring(0, ind2))) {
                    count++;
                }
            }

            if (count > 1) {
                sortedMap.put(name, count);
            }
            count = 0;
        }
        System.out.println("Отсортировано в порядке убывания популярности: ");
        sortedMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}