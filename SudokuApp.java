import java.awt.*;
import java.awt.event.*;    
import Sudoku.SudokuPlz;
   
public class SudokuApp extends Frame implements ActionListener{
	TextField t[][]= new TextField[9][9];
	Button b = new Button("Solve");
    SudokuApp(){
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });  
		
		
		int x=70, y=50;
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				t[i][j]=new TextField();
				t[i][j].setBounds(x,y,20,20);
				x+=30;
				add(t[i][j]);
			}
			y+=30;
			x=70;
		}
		
		
        
        b.setBounds(200-40,400-50,80,30);
        add(b);
		b.addActionListener(this);
        setSize(400,400);
        setTitle("Sudoku Solver Application");
        setLayout(null);
        setVisible(true);

    }
	
	public void actionPerformed(ActionEvent e){
			int board[][]=new int[9][9];
			
			for(int i=0; i<9; i++){
				for(int j=0; j<9; j++){
					
					String x=t[i][j].getText();
					if(x.isEmpty() || x==" ")
						board[i][j]=0;
					else{
						x=x.substring(0,1);
						board[i][j]=Integer.parseInt(x);
					}
				}
			}
			SudokuPlz ob= new SudokuPlz();
			if(e.getSource()==b){
				ob.sudokuSolver(board);
				for(int i=0; i<9; i++){
					for(int j=0; j<9; j++){
						//String s=String.valueOf(board[0][0]);
						t[i][j].setText(String.valueOf(board[i][j]));
						t[i][j].setEditable(false);  
					}
				}
			}
			
	}

    public static void main(String[] args) {
        SudokuApp ob = new SudokuApp();
    }
}