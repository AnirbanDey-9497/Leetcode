package src.Arrays;

import java.util.HashSet;

public class Sudoku_Validator2 {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i=0; i<9 ; i++)
        {
            for(int j=0;j<9;j++)
            {

                char num=board[i][j];

                if(num!='.')
                {
                    String row= num+"row"+i;
                    String column= num+"column"+j;
                    String grid=num+"grid"+i/3+"has"+j/3;

                    if(!seen.add(row)|| !seen.add(column)|| !seen.add(grid))
                    {
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
