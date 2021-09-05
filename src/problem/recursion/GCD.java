package problem.recursion;

public class GCD {
    public static void main(String[] args) {

        System.out.println("GCD : "+ gcd(10,6));

    }

    static int count = 0;
    static int gcd(int a, int b){
        count++;
        System.out.println("Count: "+count);

        if(a<0 || b<0)
            return -1;


            if(b == 0)
                return a;
            else
                return gcd(b, a%b);
    }
}
