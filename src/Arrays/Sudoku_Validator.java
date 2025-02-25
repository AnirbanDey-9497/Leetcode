package src.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Sudoku_Validator {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rowSet= new HashSet[9];
        Set<Character>[] columnSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];

        for (int i=0;i<9;i++)
        {
            rowSet[i]=new HashSet<>();
            columnSet[i]=new HashSet<>();
            gridSet[i]=new HashSet<>();
        }

        for(int i=0; i<9; i++)
        {
            for(int j=0;j<9;j++)
            {
                int grid_No=(i/3)*3+(j/3);
                if(board[i][j]!='.')
                {

                    boolean isPresentInRow = rowSet[i].contains(board[i][j]);
                    boolean isPresentInColumn = columnSet[j].contains(board[i][j]);
                    boolean isPresentInGrid = gridSet[grid_No].contains(board[i][j]);

                    if (isPresentInColumn||isPresentInGrid||isPresentInRow)
                    {
                        return false;
                    }
                }
                rowSet[i].add(board[i][j]);
                columnSet[j].add(board[i][j]);
                gridSet[grid_No].add(board[i][j]);

            }
        }
        return true;
    }
}
