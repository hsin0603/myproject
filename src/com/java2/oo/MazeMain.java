//有一個遊戲場地，長寬由執行當時決定，場地中亂數產生陷阱，陷井數也由當時才決定
//有一個玩家，初始HP100，走一步消耗1HP,撞*道邊界扣5HP，陷阱扣20HP

package com.java2.oo;

import java.awt.print.Paper;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MazeMain {
  
    
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] token = line.split(",");
			int col = Integer.parseInt(token[0]);
			int row = Integer.parseInt(token[1]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
    class Maze{
    	int row,col;
    	int trapCount;
    	int[] traps;
    	int[] positions;
        Player player;
    	
    	
		public Maze(int row, int col, int trapCount) {
			super();
			this.row = row;
			this.col = col;
			this.trapCount = trapCount;
			
		}
    }
    class Player{
    	int  hp = 100;
    	int position = 0;
    }
}
