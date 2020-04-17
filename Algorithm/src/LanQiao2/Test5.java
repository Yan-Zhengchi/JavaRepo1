package LanQiao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    /*给定三个整数 a, b, c，如果一个整数既不是 a 的整数倍也不是 b 的整数倍还不是 c 的整数倍，则这个数称为反倍数。
            　　请问在 1 至 n 中有多少个反倍数。
    输入格式
　　输入的第一行包含一个整数 n。
            　　第二行包含三个整数 a, b, c，相邻两个数之间用一个空格分隔。
    输出格式
　　输出一行包含一个整数，表示答案。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            integers.add(scanner.nextInt());
        }
        int num  =0;
        for (int i = 1;i <= n;i++){
            if ((i%integers.get(0)!=0)&&(i%integers.get(1)!=0)&&(i%integers.get(2)!=0)){
                num++;
            }
        }
        System.out.println(num);
    }
}
