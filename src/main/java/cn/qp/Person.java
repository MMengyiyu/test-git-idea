package cn.qp;

/**
 * @author qipan
 * @date 2019/12/24 15:58
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        final Person person = new Person();
        // 访问name
        person.name = "zs";
        System.out.println(person.getName());

    }
}
