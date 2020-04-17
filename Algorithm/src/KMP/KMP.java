package KMP;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String string1 = "ABDABDbABDABDCasdv";
        String string2 = "ABDABDC";
        int[] next = kmpNext(string2);
        int index = kmpSearch(string1,string2,next);
        System.out.println("index = " + index);
    }
    public static int[] kmpNext(String dest){
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i = 1,j=0; i <dest.length() ; i++) {
            while(j>0&&dest.charAt(i)!=dest.charAt(j)){
                j=next[j-1];
            }
            if(dest.charAt(i)==dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
    public static int kmpSearch(String str1,String str2,int[] next){
        int index = -1;
        for (int i = 0,j = 0; i < str1.length(); i++) {
            while(j>0&&str1.charAt(i)!=str2.charAt(j)){
                j = next[j-1];
            }
            if (str1.charAt(i)==str2.charAt(j)){
                j++;
                if(j ==str2.length()){
                    index = i-j+1;
                    return index;
                }
            }
        }
        return index;
    }
}
