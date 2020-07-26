package interfacepractice;

import java.util.Arrays;
import java.util.Comparator;

/**
 * String类型本身已实现了Comparable接口,按照字典排序
 * 为了实现对String类型的自定义比较,需要自己额外实现一个Comparator
 * @author Theon
 */
public class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    public static void main(String[] args) {
        //对一个String数组按照字符串长度排序
        String[] names = {"Franklin", "Mike", "Trevor"};
        Arrays.sort(names, new StringLengthComparator());
        for (String name: names
             ) {
            System.out.println(name);
        }
    }
}
