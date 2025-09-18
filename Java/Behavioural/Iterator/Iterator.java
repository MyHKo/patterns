public class Iterator<T> {
    int currentElementIndex;
    boolean hasNext;
    T[] collection;


    public Iterator(T[] externalCollection){
        collection = externalCollection;
        currentElementIndex = 0;
        hasNext = collection.length > 0;
    }

    public boolean hasNext(){
        return hasNext;
    }

    public T next(){
        if(hasNext){
            return collection[currentElementIndex++];
        }
        hasNext = collection.length - currentElementIndex > 1
    }

}
