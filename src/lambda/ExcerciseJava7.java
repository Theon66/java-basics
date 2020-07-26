package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java7的实现方式,与lambda对照
 * @author Theon
 */
public class ExcerciseJava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewus", "Carroll", 42),
                new Person("Thomas", "Carlyle", 56),
                new Person("Bruce", "Wayne", 30),
                new Person("Michael", "Jackson", 60)
        );

        //按照姓来排序
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });


        //编写一个打印所有列表元素的方法
        System.out.println("所有元素:");
        printCondionaly(people, new Condition() {
            @Override
            public Boolean test(Person p) {
                return true;
            }
        });

        //编写一个打印所有姓以"C"开头的元素方法
        System.out.println("姓以\"C\"开头");
        printCondionaly(people, new Condition() {
            @Override
            public Boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

    }

    public static void printCondionaly(List<Person> people, Condition condition) {
        for (Person p: people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

}

interface Condition {
    Boolean test(Person p);
}