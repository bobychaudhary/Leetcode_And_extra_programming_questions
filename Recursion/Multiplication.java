class Main {
    public static void main(String[] args) {
    
    int ans=sum(10);
    System.out.println(ans);
    }
    static int sum(int n) {
        if(n<=1) {
         return n;
        }
        // return n*sum(n-1);
        return n+sum(n-1);
    
    }
}