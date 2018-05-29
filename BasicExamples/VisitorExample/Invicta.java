package BasicExamples.VisitorExample;

public class Invicta extends Watch {

    /**
     * How classy can be an Invicta, from 0 to 100.
     * Almost always higher than 90.
     */
    public float class_rate;

    public Invicta(long id, float price, float class_rate) {
        super(id, price);
        this.class_rate = class_rate;
    }

    @Override
    public void accept(WatchVisitor watchVisitor)
    {
        watchVisitor.visit(this);
    }
}
