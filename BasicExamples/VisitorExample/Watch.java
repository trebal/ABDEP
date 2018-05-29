package BasicExamples.VisitorExample;

public abstract class Watch {

    private final long id;
    public float price;

    public Watch(long id, float price) {
        this.id = id;
        this.price = price;
    }

    /**
     * Declaring this method in the superclass allows us to not
     * having to create a functional interface with the method accept.
     *
     * @param watchVisitor The WatchVisitor which does operations on
     *                     the visited object.
     */
    public abstract void accept(WatchVisitor watchVisitor);
}
