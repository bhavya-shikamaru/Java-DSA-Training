class Solution {

    void mergeSort(int arr[], int left, int right) {
        if(left < right){
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
        else{
            return;
        }
    }
    public static void merge(int[] arr, int low, int mid, int high){
    ArrayList<Integer> temp = new ArrayList<>();
    int i = low, j = mid + 1;
    while(i <= mid && j <= high){
        if(arr[i] < arr[j]){
            temp.add(arr[i]);
            i++;
        }
        else{
            temp.add(arr[j]);
            j++;
        }
    }
    while(i <= mid){
        temp.add(arr[i]);
        i++;
    }
    while(j <= high){
        temp.add(arr[j]);
        j++;
    }
    for(int k = 0; k < temp.size(); k++){
        arr[low + k] = temp.get(k);
    }
        
    }
}