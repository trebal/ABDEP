package P2016.Problem2;

public interface ComponentVisitor {

    void visit(Leaf leaf);

    void visit(Composite composite);

}
