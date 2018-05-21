package P2017R.Problem2;

import java.util.Iterator;

public abstract class SequenceProcessor<E> {

    public void processSequence(Iterator<E> iterator)
    {
        while (iterator.hasNext())
        {
            E element = iterator.next();
            processElement(element);
        }
    }

    protected abstract void processElement(E element);
}
