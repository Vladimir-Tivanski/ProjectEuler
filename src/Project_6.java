public class Project_6 {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int squareOfSums = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += Math.pow(i, 2);
            squareOfSums += i;
        }
        squareOfSums = (int)Math.pow(squareOfSums, 2);
        int difference = squareOfSums - sumOfSquares;
        System.out.println(difference);
    }
}