package P2017R.Problem2;

public class Counter extends SequenceProcessor<String> {

    int total_elements = 0;

    @Override
    protected void processElement(String element) {
        total_elements++;
    }
}
