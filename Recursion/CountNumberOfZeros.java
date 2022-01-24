/* 1020202: 3*/
class Main {
    public static void main(String[] args) {
        System.out.println(helper(1020304,0));
    }
    static int helper(int n, int c) {
        if(n==0) {
            return c;
        }
        int rem=n%10;
        if(rem==0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}