/**
 * @class MainTest
 * @package algorithm.tree
 * @date 2020/8/12 9:01
 * Copyright (c) 2019 ZheJiang Loong Airlines CO.,Ltd, All Rights Reserved.
 * ???????????????????????????????????????
 */
package algorithm.tree;

import algorithm.tree.printer.BinaryTrees;

import java.util.Comparator;

/**
 * @date 2020/8/12 9:01
 */
public class MainTest {

    private static class PersonComparetor implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    }
    private static class PersonComparetor2 implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o2.getAge() - o1.getAge();
        }
    }

    static void test1(){
        Integer data[] = new Integer[]{7, 4, 9, 2, 5, 8, 11, 3, 12, 1};
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        BinaryTrees.print(bst);

    }



    public static void main(String[] argus){
        test1();
        
    }
}
