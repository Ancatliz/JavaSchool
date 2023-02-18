package lesson_11.homework_11;

import java.util.*;

//Задача 1
public class Metod {
    public static ArrayList<Integer> sortMet(Integer diapazon){
        ArrayList <Integer> element = new ArrayList <>();
        Random random = new Random();
        for (int i = 0; i <diapazon; i++) {
        Integer e =  random.nextInt();
        element.add(e);
        }
       Collections.sort(element);
        System.out.println(element);
        return element;
    }

    //Задача 2
    public static HashSet<String> list(String text) {
        text = text.replace(",", "");
        List<String> list = Arrays.asList((text.split(" ")));
        HashSet<String> set = new HashSet<String>(list);
        return set;
}

    //Задача3
    public static Map<Character, Integer> counterSymbol(String string){
        char[] chars = string.toCharArray();
        Map<Character,Integer> counterMap = new HashMap<>();
        for (char i = 0; i < chars.length; i++) {
            if (counterMap.get(chars[i]) == null) {
                counterMap.put(chars[i], 1);
            }
            else {
                Integer element =  counterMap.get(chars[i])+1;
                counterMap.put(chars[i], element);
            }
        }
        return counterMap;
    }
}

