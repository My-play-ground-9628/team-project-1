public class algorithm{
    public static void main(String[] args) {
        printStar(0, 0);
    }
    public static void printStar(int col, int row){
        if (col == (5-row)){
            row++;
            col = 0 ;
            System.out.println();
        }
        if (row == 5 ) return;
        System.out.print("* ");
            col++;
        printStar(col, row);
    }

}