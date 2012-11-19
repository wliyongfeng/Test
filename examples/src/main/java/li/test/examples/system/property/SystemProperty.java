package li.test.examples.system.property;

public class SystemProperty {
    public static void main(String[] args) {
        System.out.println(System.clearProperty("file.separator"));
        System.out.println(System.clearProperty("java.class.path"));
        System.out.println(System.clearProperty("java.vendor"));
        System.out.println(System.clearProperty("java.home"));
        System.out.println(System.clearProperty("java.vendor.url"));
        System.out.println(System.clearProperty("java.version"));
        System.out.println(System.clearProperty("line.separator"));
        System.out.println(System.clearProperty("os.arch"));
        System.out.println(System.clearProperty("os.name"));
        System.out.println(System.clearProperty("os.version"));
        System.out.println(System.clearProperty("path.separator"));
        System.out.println(System.clearProperty("user.dir"));
        System.out.println(System.clearProperty("user.home"));
        System.out.println(System.clearProperty("user.name"));
        
        System.setProperty("li.value", "great");
        System.out.println(System.getProperty("li.value"));
    }

}
