package P2017R.Problem2;

public class Counter extends SequenceProcessor<String> {

    private int total_elements = 0;

    @Override
    protected void processElement(String element) {
        total_elements += 1;
    }

    protected int getTotalElements() {
        return total_elements;
    }
}
