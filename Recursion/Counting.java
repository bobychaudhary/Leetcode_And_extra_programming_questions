/* print: 5 4 3 2 1 1 2 3 4 5 */    
    
    class Main {
    public static void main(String[] args) {
        count(5);
        count2(1);
        
    }
    static void count(int n) {
        if(n==1) {
            System.out.print(1);
    return;    }
        System.out.print(n+" ");
        count(n-1);
    }
    static void count2(int n) {
        if(n==5) {
            System.out.print(5);
    return;    }
        System.out.print(n+" ");
        count2(n+1);
    }
}