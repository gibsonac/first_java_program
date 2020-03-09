import java.lang.Math;

public class PythagoreanTheorem {
    public double calculateHypotenuse(int legA, int legB) {
        double answer = (legA * legA) + (legB * legB);
        double squareRoot = Math.sqrt(answer);
        return squareRoot;
    }
}
