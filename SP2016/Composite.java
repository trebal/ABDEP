package SP2016;

public class Composite extends Component {
    @Override
    public void accept(ComponentVisitor v) {
        v.visit(this);
    }
}
