//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alex", "w12345");
        System.out.println(s1.getName());
        s1.setName("Bob");
        System.out.println(s1.getName());
        s1.setID("w209754");
        Student s2 = new Student("Alex", "w12345");
        System.out.println(s1.getID());
        Module m1 = new Module("w218", 45, 34);
        s1.addModule(m1);
        s1.showPass();
        Module m2 = new Module("w305", 60, 24);
        s2.addModule(m2);
        s2.showPass();

    }
}