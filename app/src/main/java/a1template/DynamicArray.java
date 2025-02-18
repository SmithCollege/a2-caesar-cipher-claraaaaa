// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{

    int length;
    T[] contents;
    int offset;
    
    /** Returns the value stored at a given index
     * @param i index of element to read
     * @return value stored at the given index
     */
    // public DynamicArray(){
    //     length=10;
    //     contents = new T[10];
    // }

    public DynamicArray(int offset,T[] array){
        this.offset=offset;
        this.length=array.length;
        this.contents = array;
    }

    public DynamicArray(T[] array){
        this.length=array.length;
        contents = array;

    }
    public T get(int i){
        return contents[i];

    };

    /** Returns the value stored at a given index plus the offset
     * @param i index of element to read
     * @param offset adjust index by this value
     * @return value stored at the given index
     */
    public T get(int i, int offset){
        return contents[i+offset];

    };

    /** Stores the given value at the given index
     * @param i index of locaßtion to store
     * @param val value to store at given index
     */
    public void set(int i, T val){
        contents[i]=val;

    };


}