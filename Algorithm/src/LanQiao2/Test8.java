package LanQiao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int min = 10;
        int max = 0;
        long num = 0;
        if (m==1){
            min = 1;
        }else{
            for (int i = 0; i < m-2; i++) {
                min*=10;
            }
            max = (min*10-1)/9*n;
        }
        for (int i = min; i <=max ; i++) {
            String s = String.valueOf(i);
            char[] chars = s.toCharArray();
            ArrayList<Character> characters1 = new ArrayList<>();
            ArrayList<Character> characters2 = new ArrayList<>();
            for (int j = 0; j < chars.length; j++) {
                if(j%2==0){
                    characters2.add(chars[j]);
                }else{
                    characters1.add(chars[j]);
                }
            }
            /*System.out.print(characters1.size()+"   ");
            System.out.println(characters2.size());*/
            int temp = 0;
            for (int j = 0; j < m / 2; j++) {

                if (characters1.get(j)>characters2.get(j)&&characters1.get(j)<characters2.get(j+1)){
                    temp++;
                }
            }
            if (temp == m/2){
                num++;
            }
        }
        System.out.println(num);
        
    }
}
