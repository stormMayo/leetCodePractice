package leetcode;

import sun.management.Agent;

/**
 * 67
 */
public class AddBinary {
    public static void main(String[] argus){
        String s = addBinary("110", "1001");
        System.out.println(s);


    }

    public static String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int aLength = aChars.length;
        int bLength = bChars.length;
        //make the longest chars as aChars
        while(aLength <= bLength){

        }
        char[] result = new char[aChars.length + 1];


        for(int i = aChars.length - 1 ; i >= 0 ; i--){

        }
        String substring = result.toString().substring(1);


        return result.toString().startsWith("0") ?result.toString().substring(1) : result.toString();
    }


    public static class Node<T>{
        T item;
        Node<T> prev;
        Node<T> next;
        Node(Node<T> prev,T item,Node<T> next){
            this.item = item;
            this.prev = prev;
            this.next = next;

        }
    }
}
