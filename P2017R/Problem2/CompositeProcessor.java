package P2017R.Problem2;

import P2017R.Problem1.LinesIterator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeProcessor<E> extends SequenceProcessor<E> {

    private List<SequenceProcessor<E>> components = new ArrayList<>();

    public void addProcessor(SequenceProcessor<E> sp) {
        components.add(sp);
    }

    @Override
    protected void processElement(E element) {
        for (SequenceProcessor<E> sp : components) {
            sp.processElement(element);
        }
    }

/*    public void process() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("path.txt"));
        Iterator<String> it = new LinesIterator(reader);

        Counter counter = new Counter();
        MeanLength meanLength = new MeanLength();

        SequenceProcessor<String> compost = new CompositeProcessor<>();
        compost.addProcessor(counter);
        compost.addProcessor(meanLength);
        compost.processElement(it);

        System.out.println(counter.getCounter());
        System.out.println(counter.getCounter());
    }*/
}
