package P2016.Problem2;

public class Leaf extends Component {

    private int info;

    public int getInfo() {
        return info;
    }

    @Override
    public void accept(NoncyclicComponentVisitor countVisitor) {
        countVisitor.visit(this);
    }
}
