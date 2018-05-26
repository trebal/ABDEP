package P2017R.Problem2;

public class MeanLength extends SequenceProcessor<String> {

    private int total_elements = 0;
    private double total_length = 0;

    @Override
    protected void processElement(String element) {
        total_elements += 1;
        total_length += element.length();
    }

    protected double getAverage() {
        return total_length / total_elements;
    }
}
