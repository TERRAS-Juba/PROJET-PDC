package Noyau;

import java.util.Iterator;
import java.util.Map;

public class IteratorMap implements IteratorBien {
    private Map<String, Bien> table;
    private Iterator iterationState;

    public IteratorMap(Map<String, Bien> table) {
        this.table = table;
        this.iterationState = this.table.entrySet().iterator();
    }

    @Override
    public Bien getNext() {
        Map.Entry mapentry = (Map.Entry) this.iterationState.next();
        Bien bien = (Bien) mapentry.getValue();
        return bien;

    }

    @Override
    public boolean hasNext() {
        return this.iterationState.hasNext();
    }
}
