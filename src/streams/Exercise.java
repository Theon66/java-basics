package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * streams练习
 * @author Theon
 */
public class Exercise {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Eli", "Mike", "Franklin", "Trevor");

        //使用流代替for循环, 计算名字长度大于4的数量
        long count = names.stream().filter(name -> name.length() > 4).count();
        System.out.println(count + "个长度大于4的名字");

        //把名字长度大于4的元素放入一个新集合
        List<String> namesOver4 = names
                .stream().filter(name -> name.length() > 4)
                .collect(Collectors.toList());
        System.out.println("名字长度大于4的新集合:" + namesOver4);
    }
}
