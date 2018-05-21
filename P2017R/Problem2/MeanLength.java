package P2017R.Problem2;

public class MeanLength extends SequenceProcessor<String> {

    double total_length = 0;
    int total_elements = 0;

    @Override
    protected void processElement(String element) {
        total_elements++;
        total_length += element.length();
    }

    public double getAverage() {
        return total_length / total_elements;
    }
}
