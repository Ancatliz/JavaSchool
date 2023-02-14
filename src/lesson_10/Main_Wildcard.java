package lesson_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_Wildcard {
    public static void main(String[] args) {

    //Wildcard - это особая конструкция, которая позволяет изменить логику Generics
    // и сделать их не только инвариантными,
    // но и ковариантными и контравариантными.
    // Для этого используется конструкция ? extends или ? super
    List<Integer> i = Arrays.asList(1,2,3,4);
    List<? extends Number> n = i; // как реализация ковариантности. Разрешаем положить в лист всех наследников Number

    List<Number> n2 = new ArrayList<>();
    List<? super Integer> i2  = i; // как реализация контравариантными. Разрешаем положить элементы родителей.


    /**
     * The Get and Put Principle или PECS (Producer Extends Consumer Super)
     * Это означает, что ценой удобства Generics мы платим ограничением
     * на вставку или добавление элементов
     *
     * extends (перевод - Фотография) - данный модификатор для дженерика значит,
      что данный тип являетcя producer.
     * Данный элемент продюсирует свои данные (предоставляет) но не изменяет или добавляет их.
     *
     * super - данный модификатор создаёт Consumer, который является неким читателем.
     * Он получает данные, но не отдаёт их.
     */

    List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(13);
        integerList.add(18);

        System.out.println(integerList.get(2));

}

    /**
     * Пример работы Producer
     * Где мы можем получать элемнты, но не добалвять мх
     *
     */
    private static void test(List<? extends Number> numbers) {
        System.out.println(numbers.get(3));
//        numbers.add(3); // не можем добавлять
    }

    /**
     * Пример работы Consumer.
     * Где мы можем добавлять эллементы, но не получать их
     */
    public static Integer getElement(List<? super Integer> list) {
        list.add(4);
        System.out.println(list);
//        return list.get(1); // не можем читать //Пример типичной ошибки с Producer.
       // Он может говорить о своих данных, но новые не получает
        return null;
    }
    /** Но при использовании super в массиве или коллекции мы сможем прочитать если будем  выводить через
     * Sout в консоль, т.к. под камотом в Sout закопан toString который обходит это правило. Пример ниже.
    List<? super Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);
        System.out.println(intList);
     */
}

