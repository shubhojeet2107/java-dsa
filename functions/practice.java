package functions;

public class practice {
    public static void main(String[] args){
        maze2("", 3, 3);
    }   

    static void maze2(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if(row > 1){
            maze2(p+'D', row-1, col);
        }
        if(col > 1){
            maze2(p+'R', row, col-1);
        }
    }
}
