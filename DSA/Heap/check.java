public class check {
    int arr[];
    int size;
    int capacity;

    public check(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }
    int parent(int i) {
        return (i - 1) / 2;
    }
    int left(int i) {
        return 2 * i + 1;
    }
    int right(int i) {
        return 2 * i + 2;
    }

    public void insert(int x) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }
        arr[size] = x;
        size++;
        int i = size - 1;
        while (i != 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }
    public void pop() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return;
        }
        arr[0] = arr[size - 1];
        size--;
        int i = 0;
        while (i < size) {
            int left = left(i);
            int right = right(i);
            int largest = i;
            if (left < size && arr[left] > arr[largest]) {
                largest = left;
            }
            if (right < size && arr[right] > arr[largest]) {
                largest = right;
            }
            if (largest == i) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            i = largest;
        }
    }public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void heapify(int i) {
        int left = left(i);
        int right = right(i);
        int largest = i;
        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(largest);
        }
    }
    public static void main(String[] args) {
        check heap = new check(10);
        heap.insert(3);
        heap.insert(15);
        heap.insert(5);
        heap.insert(20);
        heap.insert(1);
        heap.insert(17);
        heap.print();
        heap.pop();
        heap.print();
    }
    
}
