package b_lists.utils;

public class DynamicArray {
    private int size = 0;
    private int [] data = new int[10];
    private static final int EXPANSION_MULTIPLIER = 2;

    private void ensureCapacity() {
        if (size == data.length) {
            int[] newData = new int[data.length*EXPANSION_MULTIPLIER];

            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }

            data = newData;
        }
    }

    public void add(int value){
        ensureCapacity();
        data[size] = value;
        size++;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public int indexOf(int value){
        for(int i = 0; i < size; i++){
            if(data[i] == value){
                return i;
            }
        }
        return -1;
    }

}
