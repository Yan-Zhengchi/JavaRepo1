package LanQiao2;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] ints = new int[n][m];
        int num = 1;
        int i = 0;
        int j = 0;
        int temp = 0;
        while (num <= n * m) {
            //向右,i不变，j++
            if (temp % 4 == 0) {
                for (int l = j; l < m; l++) {
                    if (ints[i][l] == 0) {
                        ints[i][l] = num;
                        num++;
                        j = l;
                    } else {
                        break;
                    }
                }
                i++;
                temp++; //j==4,i==1
            } else if (temp % 4 == 1) {
                //向下，j不变，i++
                for (int k = i; k < n; k++) {
                    if (ints[k][j] == 0) {
                        ints[k][j] = num;
                        num++;
                        i = k;
                    } else {
                        break;
                    }
                }
                j--;
                temp++;//j==3,i==3
            } else if (temp % 4 == 2) {
                //向左，i不变，j--
                for (int k = j; k >= 0; k--) {
                    if (ints[i][k] == 0) {
                        ints[i][k] = num;
                        num++;
                        j = k;
                    } else {
                        break;
                    }
                }
                i--;
                temp++;//j==0,i==2
            } else if (temp % 4 == 3) {
                //向上，j不变，i--
                for (int k = i; k >= 0; k--) {
                    if (ints[k][j] == 0) {
                        ints[k][j] = num;
                        num++;
                        i = k;
                    } else {
                        break;
                    }
                }
                j++;
                temp++;//j==1,i==1
            }
        }
        System.out.println(ints[r - 1][c - 1]);
    }
}
