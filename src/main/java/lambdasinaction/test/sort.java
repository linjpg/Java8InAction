package lambdasinaction.test;

import java.util.TreeSet;

/**
 * Created by lin on 2018/7/16.
 */
public class sort {
    /**
     * 把字符串去重，并升序排序
     * @param str
     * @return
     */
    public static String sort2(String str) {

        //把String变成单一字符数组
        String[] chars = str.split("");

        //把字符串数组放入TreeSet中，根据set元素不重复的特性去掉重复元素。根据treeSet的有序性排序
        TreeSet<String> treeSet = new TreeSet();
        for (String s : chars) {
            treeSet.add(s);
        }

        //把treeSet拼接成字符串
        str = "";
        for (String s : treeSet) {
            str += s;
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "cbbkac";
        System.out.println("去重排序前：" + s);
        s = sort2(s);
        System.out.println("去重排序后：" + s);
    }

}
