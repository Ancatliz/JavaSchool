package lesson_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson_10 {
    public static void main(String[] args) {

        long a = 23543753756L;
        int b = 13;
        float f = 35.5f;
        double d = 35463.84773D;
        Number n = 5;
        Number[] mas = new Number[]{a, b, f, d};

        Integer c =(Integer) n;// родительский положили в дочерний (контрариантность)

        ///////
        String test = "gfdg";
        Integer inn = 5;
//        getValue(inn);
//        getValue(test);



        List<Integer> list = new ArrayList<>();

        Cat<Integer> integerCat = new Cat<>();
        integerCat.setInfo(5); //тут () мы уже не можем создать строку так как у нас Cat<Integer>
        System.out.println(integerCat.getInfo());

        Cat<String> stringCat = new Cat<>();
        stringCat.setInfo("dskhfksw");//тут () мы уже не можем создать Integer так как у нас Cat<String>
        System.out.println(stringCat.getInfo());

        Cat<MiniCat> miniCatCat = new Cat<>();
        MiniCat miniCat = new MiniCat();

        miniCatCat.setInfo(miniCat);
        miniCatCat.getInfo().test1();

    }


    public static <T extends Number> Integer getValue(T value) {
        System.out.println(value);
//       return new String((String) value); // переводит вводимое значение value в строку(String)
        return value.intValue();

    }public static <E extends TestInf> Integer getValue(E value) {
        System.out.println(value);
        return value.test();
    }



    public static void test(Cat cat) {
        if (cat instanceof Cat) {
            cat.test1();
        } else {
            System.out.println("Нас взломали");
        }
    }

}
