package com.kodilla.sudoku;
import java.util.List;

public class SudokuPrinter {

    public void print(SudokuBoard sudokuBoard){
        System.out.println("                      Sudoku board:" );
        List<SudokuRow> sudokuBoards = sudokuBoard.getSudokuRowList();
        for (int n=0; n < 9; n++) {
            if (n==3||n==6){
                System.out.println("   ---------------------------------------------------");
            }
            for (int j = 0; j < sudokuBoards.get(n).getSudokuRowElements().size(); j++) {
                if (j==2||j==5) {
                    System.out.print(sudokuBoards.get(n).getSudokuRowElements().get(j) + "     | ");
                } else {
                    System.out.print(sudokuBoards.get(n).getSudokuRowElements().get(j) + "  ");
                }
            }
            System.out.println();

        }
    }
}