package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Theon
 */
public class ExcerciseLambda {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewus", "Carroll", 42),
                new Person("Thomas", "Carlyle", 56),
                new Person("Bruce", "Wayne", 30),
                new Person("Michael", "Jackson", 60)
        );

        //按照姓来排序
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));


        //编写一个打印所有列表元素的方法
        System.out.println("所有元素:");
        printCondionaly(people, p -> true);


        //编写一个打印所有姓以"C"开头的元素方法
        System.out.println("姓以\"C\"开头");
        printCondionaly(people, p -> p.getLastName().startsWith("C"));

    }

    public static void printCondionaly(List<Person> people, Predicate<Person> predicate) {
        for (Person p: people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }
    }

}

