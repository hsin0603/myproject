package com.java2.snowing;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;

import com.java2.snowing.SnowFrame.SnowCanvas;

public class Snow extends Thread {
	Random random = new Random();
	int x;
	int y = 800;
	private final SnowFrame.SnowCanvas snowCanvas;

	public Snow(SnowFrame.SnowCanvas snowCanvas) {
		this.snowCanvas = SnowCanvas;
		x = random.nextInt(800);
		y = random.nextInt(600);
	}

	@Override
	public void run() {
		for(int i = 800 ; i>0; i--){
//			System.out.println(getName()+":("+x+","+y+")");
			y++;
			x = x + random.nextInt(3)-1;
			snowCanvas.repaint();
			try{
				sleep(50);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
//			x= x-movement;
//			System.out.print(new String(new char[x]).replace("\0"," "));
//			System.out.println("雪");
			
}
}

}
