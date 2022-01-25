/*
Input: "abc"
Output: [ abc,  ab,  ab99,  ac,  a,  a99,  a98c,  a98,  a9899,  bc,  b,  b99,  c,  ,  99,  98c,  98,  9899,  97bc,  97b,  97b99,  97c,  97,  9799,  9798c,  9798,  979899]
*/

import java.util.ArrayList;
import java.util.List;
class Main {
    public static void main(String[] args) {
        System.out.println(asciiReturn(" ", "abc"));
    }
    static ArrayList<String> asciiReturn(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> list =  new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> first = asciiReturn(p+ch, up.substring(1));
        ArrayList<String> second = asciiReturn(p, up.substring(1));
        ArrayList<String> third = asciiReturn(p+(ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}