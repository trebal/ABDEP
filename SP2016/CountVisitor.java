package SP2016;

import java.util.ArrayList;
import java.util.List;

public class CountVisitor implements ComponentVisitor {

    private int counter = 0;
    private List<Component> visited = new ArrayList<>();

    @Override
    public void visit(Leaf l) {
        if(!visited.contains(l))
        {
            visited.add(l);
            counter+=1;
        }
    }

    @Override
    public void visit(Composite c) {
        if(!visited.contains(c))
        {
            visited.add(c);

            /*for (Component subc : c.getComponents())
            {
                subc.accept(this);
            }*/
        }
    }
}
