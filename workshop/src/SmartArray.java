import java.util.ArrayList;

public class SmartArray {
    private Integer[] data;
    private int size;

    public SmartArray() {
        this.data = new Integer[4];
        this.size = 0;
    }

    public void add(int element) {
        if(this.size == this.data.length) {
            this.data = grow();
        }
        this.data[size] = element;
        this.size++;
    }

    public int get(int index) {
        validateIndex(index);
        return this.data[index];
    }

    private void validateIndex(int index) {
        if(index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }
    }

    public int size() {
        return this.size;
    }

    public int remove(int index) {
        validateIndex(index);
        int element = this.data[index];
        this.size--;

        for(int i = index ; i < this.size; i++) {
            this.data[i] = this.data[i + 1];
        }

        this.data[this.size] = null;
        return element;
    }

    public boolean contains(int element) {
        for(int i = 0; i < this.size; i++) {
            if(this.data[i] == element) {
                return true;
            }
        }

        return false;
    }

    private Integer[] grow() {
        Integer[] newData = new Integer[this.data.length * 2];

        System.arraycopy(this.data, 0, newData, 0, this.data.length);
//        for(int i = 0; i < this.data.length; i++) {
//            newData[i] = this.data[i];
//        }

        return newData;
    }

}
