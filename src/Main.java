import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMinOfThree(6,4,10));
        System.out.println(findMinOfFour(30,60,100,9));
        printMin(2,5,9,4);
    }
    public static int findMinOfThree(int a,int b,int c){
        int min=a;
        if(a>b && b>c)
            return c;
        else {
            if (a>b && c>b)
                return b;
        }
        return a;
    }
    public static int findMinOfFour(int a,int b,int c,int d){
        int min=a,min1=c;
        if (a > b)
            min = b;
        if (c > d)
            min1 = d;
        if (b > d)
            min = d;
        else {
            if (a > c) {
                min = c;
            }
        }
        return min;
    }
    public static int findMinOfTwoRecursion(int a,int b){
        int min1;
        if (a<b)
            min1=a;
        else
            min1=b;
        return min1;
    }
    public static int findMinOfThreeRecursion(int a,int b,int c){ //функция не задействуется
        return findMinOfTwoRecursion(findMinOfTwoRecursion(a,b),c);
    }
    public static int findMinOfFourRecursion(int a,int b,int c,int d){
        return findMinOfTwoRecursion(findMinOfTwoRecursion(findMinOfTwoRecursion(a,b),c),d) ;
    }
    public static void printMin(int a,int b,int c,int d){
        System.out.println(findMinOfFourRecursion(a,b,c,d));
    }
}