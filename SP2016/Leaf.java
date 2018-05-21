package SP2016;

public class Leaf extends Component {
    @Override
    public void accept(ComponentVisitor v) {
        v.visit(this);
    }
}
