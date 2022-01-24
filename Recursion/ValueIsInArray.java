class Main {
    public static void main(String[] args) {
        int[] arr = {11,1,1,2};
        System.out.println(valueInArray(arr, 2, 0));
    }
    static boolean valueInArray(int[] arr,int target, int index){
    if(index==arr.length) {
        return false;
    } 
    return arr[index]==target || valueInArray(arr, target, index+1);

        
    }
    
}