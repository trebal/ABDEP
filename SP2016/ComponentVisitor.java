package SP2016;

public interface ComponentVisitor {

    void visit(Leaf l);
    void visit(Composite c);
}
