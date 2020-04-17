package DP;

public class Backpack {
    /**
     * 已知：一个背包重4kg，
     * 现在有物品，一个吉他1kg，价值1500元
     * 一个音响4kg，价值3000
     * 一个电脑3kg，价值2000
     * 请问如何拿物品，才能保证背包中的价值最大
     * @param args
     */
    public static final int BACKPACK_VOLUME = 4;
    public static final int NUMS = 3;
    public static void main(String[] args) {
        int[] v = {1500,3000,2000};
        int[] w = {1,4,3};
        int max = 0;
        int[][] list = new int[NUMS+1][BACKPACK_VOLUME+1];
        for (int i = 0; i < list.length; i++) {
            list[i][0] = 0;
        }
        for (int i = 0; i < list[0].length; i++) {
            list[0][i] = 0;
        }
        for (int i = 1; i < list.length; i++) {
            for (int j = 1; j < list[0].length; j++) {
                if (j < w[i-1]) {
                    list[i][j] = list[i - 1][j];
                } else {
                    if (list[i - 1][j] > v[i-1] + list[i - 1][j - w[i-1]]) {
                        list[i][j] = list[i - 1][j];
                    } else {
                        list[i][j] = v[i-1] + list[i - 1][j - w[i-1]];
                    }

                }
            }
        }
       /* for (int i = 0; i <NUMS; i++) {
            for (int j = 0; j <BACKPACK_VOLUME; j++) {
                if(i==0||j==0){
                    list[i][j] = 0;
                }else {
                    if (j < w[i+1]) {
                        list[i][j] = list[i - 1][j];
                    } else {
                        if (list[i - 1][j] > v[i+1] + list[i - 1][j - w[i+1]]) {
                            list[i][j] = list[i - 1][j];
                        } else {
                            list[i][j] = v[i+1] + list[i - 1][j - w[i+1]];
                        }

                    }
                }
            }
        }*/
        for (int i = 0; i <=NUMS; i++) {
            for (int j = 0; j <=BACKPACK_VOLUME; j++) {
                System.out.print(list[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
