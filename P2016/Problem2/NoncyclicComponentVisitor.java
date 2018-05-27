package P2016.Problem2;

import java.util.ArrayList;

public abstract class NoncyclicComponentVisitor implements ComponentVisitor {

    private ArrayList<Component> visited = new ArrayList<>();

    private boolean isVisited(Component component) {
        return visited.contains(component);
    }

    private void addVisited(Component component) {
        visited.add(component);
    }

    @Override
    public void visit(Composite composite) {
        addVisited(composite);
        for (Component component : composite.getComponents()) {
            if (!isVisited(component)) {
                addVisited(component);
                component.accept(this);
            }
        }
    }

    @Override
    public abstract void visit(Leaf leaf);
}
