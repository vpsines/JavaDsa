package Stacks;

public class CustomStack {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);

    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull(){
        return data.length-1 == ptr;
    }
}
