package BasicExamples.VisitorExample;

public class Casio extends Watch {

    /**
     * How a much a Casio sucks, from 0 to 100.
     */
    public float smell_rate;

    public Casio(long id, float price, float smell_rate) {
        super(id, price);
        this.smell_rate = smell_rate;
    }

    @Override
    public void accept(WatchVisitor watchVisitor) {
        watchVisitor.visit(this);
    }
}
