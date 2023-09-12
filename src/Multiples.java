public class Multiples {
    public static void main(String[] args) {
        // how many multiples of 3 or 5 there are below 1000.
        int numMultiples = 0;
        for (int i = 1; i < 1000; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if ((divisibleBy3) || (divisibleBy5)){
                numMultiples++;
            }
        }
        System.out.println(numMultiples);
    }
}
