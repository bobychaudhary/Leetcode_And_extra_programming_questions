/*
Input: 3, 3;
Output: 6
*/

class Main {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
    static int count(int row, int column) {
        if(row==1 || column==1) {
            return 1;
        }
        int row2 = count(row-1, column);
        int column2 = count(row, column-1);
        return row2+column2;
    }
}