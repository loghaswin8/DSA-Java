public class Str {
    public static void main(String[] args) {
        String name = "Hi My name: is Loghaswin and I will be successful, believe it";

        name = name.replaceAll(":", "");
        name = name.replaceAll(",", "");
        name = name.replaceAll("\\s", "");
        name = name.toLowerCase();

        System.out.println(name);

    }
}
