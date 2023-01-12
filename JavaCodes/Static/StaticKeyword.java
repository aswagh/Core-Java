package Static;

/**
 * StaticKeyword
 */
public class StaticKeyword {
    public static int count = 1;

    public static int staticVar;
    public int nonStaticVar;

    StaticKeyword() {
        System.out.println(count++);
    }

    public String nonStaticMethod() {
        staticVar += 10;
        return "We can modify the value of statick Variable in non static method = " + staticVar +
                "\n we can call static method through non static method" + staticMethod();

    }

    public static String staticMethod() {
        // nonStaticVar = 10;
        return "We cannot use and modify the value of non static varilable in statick method " +
                "\n we can not call non static method through static method";

    }

}