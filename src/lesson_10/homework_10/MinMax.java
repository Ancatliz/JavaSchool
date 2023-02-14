package lesson_10.homework_10;

import java.util.ArrayList;

public class MinMax <T>{
     T min;
     T max;

    public MinMax() {
    }

    public MinMax(T min, T max) {
        this.min = min;
        this.max = max;
    }

    public T getMin() {
        return min;
    }
    public void setMin(T min) {
        this.min = min;
    }
    public T getMax() {
        return max;
    }
    public void setMax(T max) {
        this.max = max;
    }


//    public void minMax(ArrayList<? extends Number> numbers){
//
//        for (Number revealMinMax:numbers) {
//
//            if (revealMinMax < min){
//                min = revealMinMax;
}
