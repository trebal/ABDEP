package P2015;

public abstract class AbstractTableModel {

    public abstract int getRowCount();

    public abstract int getColumnCount();

    public abstract Object getValue(int r, int c);
}
