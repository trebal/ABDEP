package P2017R.Problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

//TODO: the next method uses readLine, which will lend to read and waste a line only to check if there is a next element.
public class LinesIterator implements Iterator<String> {

    private BufferedReader bufferedReader;
    private String nextElement;

    public LinesIterator(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
        nextElement();
    }

    /**
     * Gets the next element from the bufferedReader.
     * @return A String if there is next element, null otherwise.
     */
    private void nextElement() {
        try {
            nextElement = bufferedReader.readLine();
        } catch (IOException e) {
            nextElement = null;
        }
    }

    @Override
    public String next() {
        String next = nextElement;
        if (next != null) {
            nextElement();
            return next;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean hasNext() {
        return nextElement != null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
