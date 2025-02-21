// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;
/**
 * An interface that have multiple methods for array
 * @author Binah, Clara
 */
public class DynamicArray<T> implements IndexAccess<T>{

    int length;
    //static Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    int offset;
    T[] contents;

    //
    // public DynamicArray(){
    //     length = 10;
    //     contents = new T[10];
    // }

    // public DynamicArray(int length){
    //     this.length = length;
    //     this.contents = new T[length];
    // }

    public DynamicArray(int offset, T[] array){
        this.length = array.length;
        this.contents = array;
        this.offset = offset;
    }


    /** Returns the value stored at a given index
     * @param i index of element to read
     * @return value stored at the given index
     */
    public T get(int i)
    {
        return contents[i];
    }

    /** Returns the value stored at a given index plus the offset
     * @param i index of element to read
     * @param offset adjust index by this value
     * @return value stored at the given index
     */
    public T get(int i, int offset)
    {
        return contents[(i + offset)%length];
    }

    /** Stores the given value at the given index
     * @param i index of locaßtion to store
     * @param val value to store at given index
     */
    public void set(int i, T val)
    {
        contents[i] = val;
    }

}