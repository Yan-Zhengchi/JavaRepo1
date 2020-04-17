package LanQiao2;

import java.util.Scanner;

public class Test6 {
    /**
     * 给定一个单词，请使用凯撒密码将这个单词加密。
     * 　　凯撒密码是一种替换加密的技术，单词中的所有字母都在字母表上向后偏移3位后被替换成密文。即a变为d，b变为e，...，w变为z，x变为a，y变为b，z变为c。
     * 　　例如，lanqiao会变成odqtldr。
     * 输入格式
     * 　　输入一行，包含一个单词，单词中只包含小写英文字母。
     * 输出格式
     * 　　输出一行，表示加密后的密文。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        char[] chars = next.toCharArray();
        char[] temp = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='x'){
                temp[i] = 'a';
            }else if (chars[i]=='y'){
                temp[i] = 'b';
            }else if (chars[i]=='z'){
                temp[i] = 'c';
            }else {
                int x = chars[i];
                x+=3;
                temp[i] = (char) x;
            }
        }
        String s = new String(temp);
        System.out.println(s);
    }
}
