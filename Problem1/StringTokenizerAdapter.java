package Problem1;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenizerAdapter extends StringTokenizer implements Iterator<Object> {

    public StringTokenizerAdapter(String str, String delim, boolean returnDelims) {
        super(str, delim, returnDelims);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
