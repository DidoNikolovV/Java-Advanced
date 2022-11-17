import java.util.ArrayList;

public class SmartArray {
    private int[] data;
    private int size;

    public SmartArray() {
        this.data = new int[4];
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
        if(index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }
        return this.data[index];
    }

    public int size() {
        return this.size;
    }

    private int[] grow() {
        int[] newData = new int[this.data.length * 2];

        System.arraycopy(this.data, 0, newData, 0, this.data.length);
//        for(int i = 0; i < this.data.length; i++) {
//            newData[i] = this.data[i];
//        }

        return newData;
    }

}
