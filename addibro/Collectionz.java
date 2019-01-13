package addibro;

import java.util.Collection;

/**
 * Collectionz
 */
public class Collectionz<T> {
    public void printCollection(Collection<T> collection) {
        System.out.println(collection.getClass().getSimpleName() + ": " + collection);
    }
    
}