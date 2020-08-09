package generic;

import java.time.LocalDate;

/**
 * @author Theon
 */
public class ArrayAlg {

    public static void main(String[] args) {
        String[] names = {"Jack", "Ashely", "Franklin", "Mike", "SuicideBoys"};
        System.out.println(getMinAndMax(names));

        LocalDate[] birthdays = new LocalDate[] {
                LocalDate.of(1993, 1, 4),
                LocalDate.of(1960, 3, 1),
                LocalDate.of(2000, 2, 15),
                LocalDate.of(2010, 9, 10)
        };
        Pair<LocalDate> minAndMaxBith = getMinAndMax(birthdays);
        System.out.println("old:" + minAndMaxBith.getFirst());
        System.out.println("young:" + minAndMaxBith.getSecond());

        //调用泛型方法, 可以显式指定泛型类型, 放在方法名之前
        String middle = ArrayAlg.<String>getMiddle(names);
        //大多数情况都可以不指定泛型类型, 编译器可以根据参数类型推断
        middle = ArrayAlg.getMiddle(names);
        System.out.println("middle:" + middle);
    }

    /**
     * 泛型方法既可以定义在泛型类中,又可以定义在非泛型类中
     * 语法为<T>放在修饰符后面
     */
    public static <T> T getMiddle(T...a) {
        return a[a.length / 2];
    }

    /**
     * 泛型方法, 从数组中获取最大和最小值
     */
    public static <T extends Comparable> Pair<T> getMinAndMax(T[] arr) {
        T min = arr[0];
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min.compareTo(arr[i]) > 0) {
                min = arr[i];
            }
            if (max.compareTo(arr[i]) < 0) {
                max = arr[i];
            }
        }
        return new Pair<>(min, max);
    }
}
