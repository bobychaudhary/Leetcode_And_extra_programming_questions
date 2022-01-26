/*
Input: "", 3, 3;
Output:
DDRR
DRDR
DRRD
RDDR
RDRD
RRDD
*/

class Main {
    public static void main(String[] args) {
        path("",3,3);
    }
    static String path(String p, int row, int column) {
        if(row==1 && column==1) {
            System.out.println(p);
            return p;
        }
        if(row>1) {
            path(p+'D', row-1, column);
        }
        if(column>1) {
            path(p+'R', row, column-1);
        }
        return p;
    }
}public class PrintNQueenPath {
    
}
