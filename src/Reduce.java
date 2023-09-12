public class Reduce {
    public static void main(String[] args) {
        //Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
        int numSteps = 0;
        int n = 100;
        while (n != 0){
            boolean even = n % 2 == 0;
            if (even){
                n /= 2;
            }else{
                n -= 1;
            }
            numSteps++;
        }
        System.out.println(numSteps);
    }
}
