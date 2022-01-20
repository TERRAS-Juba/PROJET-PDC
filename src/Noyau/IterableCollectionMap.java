package Noyau;

import java.util.Map;

public class IterableCollectionMap implements IterableCollection{
private Map table;

    public IterableCollectionMap(Map table) {
        this.table = table;
    }

    @Override
    public IteratorBien createIterator() {
        return new IteratorMap(table);
    }
}
