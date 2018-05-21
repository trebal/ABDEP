package P2017R.Problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinesIterator implements Iterator<String> {

    private BufferedReader bufferedReader;

    public LinesIterator(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public String next() throws NoSuchElementException {
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                throw new NoSuchElementException();
            } else {
                return line;
            }
        } catch (IOException e) {
            System.out.println("Error while trying to read file: " + e);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        try {
            if (bufferedReader.readLine() == null) {
                return false;
            } else {
                return true;
            }
        } catch (IOException e) {
            System.out.println("Error while trying to read file: " + e);
        }
        return true;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
