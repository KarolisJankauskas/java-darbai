package validating;

public class Calculator {

    public int factorial(int num) {

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        if (num < 0){
            throw new IllegalArgumentException("num cant be negative");
        };

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        if (setSize <0 || subsetSize<0){
            throw new IllegalArgumentException("Parameters can't be positive ");
        }
        if (subsetSize > setSize){
          throw new IllegalArgumentException("Subset size can't exceed Size ");
        };

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);


        return numerator / denominator;
    }
}
