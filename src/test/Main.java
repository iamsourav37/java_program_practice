package test;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        print(N);


    }
    static void print(int n){
        if(n>0){
            System.out.println(n);
            print(n-1);
        }
    }
}
