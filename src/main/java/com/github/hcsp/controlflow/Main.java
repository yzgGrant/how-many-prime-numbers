package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(howManyPrimeNumbers(3));
    }

    /**
     * 给定一个数字n，返回1到n之间的质数（素数）个数，不包括n本身。
     *
     * <p>例如，n=5，返回2，因为1到5之间有2个质数：2和3。
     *
     * <p>提示：对于正整数n，如果用2到Math.sqrt(n)+1之间的所有整数去除，均无法整除，则n为质数。
     *
     * @param n 给定的数字
     * @return 1到n之间(不包括n)质数的个数
     */
    public static int howManyPrimeNumbers(int n) {
        if(n<=2) {
            return 0;
        } else if(n==3){
            return 1;
        } else{
            int count = 1;
            boolean isPrime = true;
            for (int i = 3; i <= n - 1; i++) {
                for (int j = 2; j <= Math.sqrt(i) + 1; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
                isPrime = true;
            }
        return count;
        }
    }
//        int count=0;
//        boolean isPrime = true;
//        for(int i = 1;i<=n-1;i++){
//
//            for(int j=2;j<=Math.sqrt(i)+1;j++){
//                if(i%j==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
//                count++;
//            }
//            isPrime = true;
//        }
//        return count;
//    }

}
