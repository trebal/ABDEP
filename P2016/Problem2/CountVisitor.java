package P2016.Problem2;

public class CountVisitor extends NoncyclicComponentVisitor {

    private  int leafAmount = 0;
    @Override
    public void visit(Leaf leaf) {
        leafAmount += 1;
    }

    public int getLeafAmount()
    {
        return leafAmount;
    }
}
