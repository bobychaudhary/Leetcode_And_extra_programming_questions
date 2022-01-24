class Main {
    public static void main(String[] args) {
        int[] arr = {11,1,1,2};
        System.out.println(findIndex(arr, 2, 0));
    }
    static int findIndex(int[] arr,int target, int index){
    if(index==arr.length) {
        return -1;
    } 
    if(arr[index]==target) {
        return index;
    }
    else{
       return findIndex(arr, target, index+1);
    }
        
    }
    
}