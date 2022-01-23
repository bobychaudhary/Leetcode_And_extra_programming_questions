/* 1234 = 1+2+3+4 = 10 */
class Main {
    public static void main(String[] args) {
    System.out.println(sum(1234));
    }
    static int sum(int n) {
        if(n==0) return 0;
    
    return (n%10) + sum(n/10);
}
}