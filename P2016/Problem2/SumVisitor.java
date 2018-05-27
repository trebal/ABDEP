package P2016.Problem2;

public class SumVisitor extends NoncyclicComponentVisitor {

    private int information = 0;

    @Override
    public void visit(Leaf leaf) {
        information += leaf.getInfo();
    }

    public int getLeafAmount() {
        return information;
    }
}
