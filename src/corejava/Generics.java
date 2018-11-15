package corejava;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        getValue("test");
        getAnyValue(1);
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        setValue(stringList);
        setValue(stringList);
        CAR<Integer> car = new CAR<>();
        car.testMethod();

    }

    /*
    * can pass values which extends strings
    * */
    public static <T extends String> void getValue(T args) {

    }

    /*
    * Can pass any value
    * */
    public static <T> T getAnyValue(T args) {
        return args;
    }

    /*
    * pass List of strings
    * */
    public static <T extends String> void setValue(List<T> args) {

    }

    /*
    * Pass a list of Integer
    * */
    public static void setValue(ArrayList<? extends Integer> args) {

    }


    //Need to mention the type on defining the class
    public static class CAR<ANY> {
        ANY n;

        public CAR(){

        }

        public ANY testMethod(){
            return n;
        }
    }
}
