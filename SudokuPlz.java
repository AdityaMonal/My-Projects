package Sudoku;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class SudokuPlz{
    public boolean isSafe(int [][]board,int row,int col, int n){
        //row col check
        for (int i=0; i<board.length-1; i++){
            if(board[row][i]==n){
                return false;
            }
            if(board[i][col]==n){
                return false;
            }
        }
        //grid check
        //find start row and start col of grid (first elem of grid)
        int u=board.length;
        int k= (int)Math.sqrt(u);
        int sr=row/k *k;
        int sc=col/k *k;
        for(int i=0; i<k; i++){
            for(int j=0; j<k; j++){
                if(board[sr+i][sc+j]==n){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(int [][]board,int row,int col){
        
        if(row==board.length){
            return true;
        }
        
        
        int nrow=0;
        int ncol=0;
        if(col!=board.length-1){
            nrow=row;
            ncol=col+1;
        }
        else{
            nrow=row+1;
            ncol=0; 
        }
        if(board[row][col]!=0){
            if(helper(board,nrow,ncol)){
                return true;
            }
        }
        else{
            for(int i=1; i<=board.length; i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=i;
                    if(helper(board,nrow,ncol)){
                        return true;
                    }
                    else{
                        board[row][col]=0;
                    }
                }
            }
            
        }
        return false;
    }
    public void sudokuSolver(int [][]board){
        helper(board,0,0);
    }
    public void printSudoku(int [][]board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

