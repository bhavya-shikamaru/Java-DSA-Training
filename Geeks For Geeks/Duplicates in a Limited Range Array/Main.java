class Solution { 
    public ArrayList<Integer> findDuplicates(int[] arr) { 
        ArrayList<Integer> ls = new ArrayList<>(); 
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){ 
                if(arr[i] == arr[i+1]){ 
                    ls.add(arr[i]); 
                } 
            } 
        return ls; 
        } 

    } 