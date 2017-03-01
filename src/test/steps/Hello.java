package test.steps;

/**
 * Created by jeni on 2017/3/1.
 */
public class Hello{
    private final  String greeting;

    public  Hello(String greeting){
        this.greeting = greeting;
    }

    public String sayHi(){

        return greeting + " World!";
    }
}