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

    private int[] grow() {
        int[] newData = new int[this.data.length * 2];

        for(int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }

        return newData;
    }

}
