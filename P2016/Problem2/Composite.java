package P2016.Problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Composite extends Component {

    private ArrayList<Component> components = new ArrayList<>();

    public List<Component> getComponents() {
        return Collections.unmodifiableList(components);
    }

    @Override
    public void accept(NoncyclicComponentVisitor countVisitor) {

    }
}
