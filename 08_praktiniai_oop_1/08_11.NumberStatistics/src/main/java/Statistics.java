
public class Statistics {

private int count;
private int sum;
private double average;

    public Statistics(int count) {
        this.count = 0;
        this.sum = 0;
    }
    public void addNumber(int number) {
        ++count;
        sum+= number;
    }
    public int getCount(){

        return count;
    }
    public int sum(){

        int sum1 = this.sum;
        return sum1;
    }

    public double average() {
        if(count == 0) return 0;
        return (double) sum /count;
    }
}
