package lambdasinaction.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lin on 2018/7/16.
 */
public class revert {
    public static void arraryToList(){
//        List<String> mlist = new ArrayList<>();
//        String[] array = new String[] {"zhu", "wen", "tao"};
//        // String数组转List集合
//        for (int i = 0; i < array.length; i++) {
//            mlist.add(array[i]);
//        }
//        // 输出List集合
//        for (int i = 0; i < mlist.size(); i++) {
//            System.out.println("mlist-->" + mlist.get(i));
//        }

        String[] array = new String[] {"zhu", "wen", "tao"};
        // String数组转List集合
        List<String> mlist = Arrays.asList(array);
        // 输出List集合
        for (int i = 0; i < mlist.size(); i++) {
            System.out.println("mlist-->" + mlist.get(i));
        }
    }

    public static void listToArray(){
//        List<String> mlist = new ArrayList<>();
//        mlist.add("zhu");
//        mlist.add("wen");
//        mlist.add("tao");
//        String[] array = new String[mlist.size()];
//        // List转换成数组
//        for (int i = 0; i < mlist.size(); i++) {
//            array[i] = mlist.get(i);
//        }
//        // 输出数组
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("array--> " + array[i]);
//        }

        List<String> mlist = new ArrayList<>();
        mlist.add("zhu");
        mlist.add("wen");
        mlist.add("tao");
        // List转成数组
        String[] array = mlist.toArray(new String[0]);
        // 输出数组
        for (int i = 0; i < array.length; i++) {
            System.out.println("array--> " + array[i]);

        }
        }


    public static void main(String[] args) {
        arraryToList();
        listToArray();
    }
}
