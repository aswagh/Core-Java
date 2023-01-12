package Static;

public class Main {

    public static void main(String[] args) {
        StaticKeyword staticKeyword = new StaticKeyword();
        System.out.println(staticKeyword.nonStaticMethod());

        System.out.println("static valriable with Class Name  " + StaticKeyword.count);
        System.out.println("static valriable  with instance of class " + staticKeyword.count);

        System.out.println("Static method with Class Name " + StaticKeyword.staticMethod());
        System.out.println("Static method with instance of class " + staticKeyword.staticMethod());

    }
}
