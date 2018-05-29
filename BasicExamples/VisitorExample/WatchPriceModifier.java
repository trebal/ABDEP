package BasicExamples.VisitorExample;

/**
 * Note that methods for each visit are different. While a Casio
 * sucks even more the more expensive it is, Invicta stays classy.
 */
public class WatchPriceModifier implements WatchVisitor {

    public static float rate = 1.15f;

    @Override
    public void visit(Casio casio) {
        casio.price *= rate;
        if (rate > 1.0f) {
            casio.smell_rate += 1.0f;
        } else {
            casio.smell_rate -= 1.0f;
        }
    }

    @Override
    public void visit(Invicta invicta) {
        invicta.price *= rate;
    }
}
