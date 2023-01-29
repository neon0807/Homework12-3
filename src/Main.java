import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        Predicate<Integer> checkPositiveNumber = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 0) {
                    return true;
                } else return false;
            }
        };


        Predicate<Integer> checkPositiveNumber1 = integer -> {
            if (integer > 0) {
                return true;
            } else return false;
        };


        Consumer<String> welcome = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет " + s);
            }
        };


        Consumer<String> welcome1 = s -> System.out.println("Привет " + s);



        Function<Double, Long> rounding = new Function<>(){
            @Override
            public Long apply(Double aDouble) {
                return aDouble.longValue();
            }
        };


        Function<Double, Long> rounding1 = Double::longValue;


        Supplier<Integer> number = new Supplier<Integer>() {
            @Override
            public Integer get() {
                int a = (int) (Math.random() * 100);
                return a;
            }
        };


        Supplier<Integer> number1 = () -> {
            int a = (int) (Math.random() * 100);
            return a;
        };




        ArrayList<Integer> evenNum = new ArrayList<>();
        ArrayList<Integer> noEvenNum = new ArrayList<>();

        Predicate<Integer> condition = integer -> {
            if (integer % 2 == 0) {
                return true;
            }
            return false;
        };

        Function<Integer, ArrayList> ifTrue = integer -> {
            evenNum.add(integer);
            return evenNum;

        };


        Function<Integer, ArrayList> ifFalse = integer -> {
            noEvenNum.add(integer);
            return noEvenNum;
        };


    }
    public static <T, U> Function<T,U> ternaryOperator
            (Predicate <? super T> condition,
             Function <? super T, ? extends U> ifTrue,
             Function <? super T, ? extends U> ifFalse){
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }

}




