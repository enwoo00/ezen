package p0212;

import java.util.ArrayList;

public class ListTest5 {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.setCpu("i7");
		c1.setHdd("512GB");
		c1.setRam("8");
		
		Computer c2 = new Computer();
		c2.setCpu("i3");
		c2.setHdd("2TB");
		c2.setRam("32");
		
		Computer c3 = new Computer();
		c3.setCpu("i5");
		c3.setHdd("4TB");
		c3.setRam("16");
		
		Computer c4 = new Computer();
		c4.setCpu("i7");
		c4.setHdd("128GB");
		c4.setRam("16");
		
		Computer c5 = new Computer();
		c5.setCpu("i5");
		c5.setHdd("1TB");
		c5.setRam("8");
		
		
		Computer[] computer = new Computer[5];
		
		computer[0]=c1;
		computer[1]=c2;
		computer[2]=c3;
		computer[3]=c4;
		computer[4]=c5;
		
		for(Computer c : computer) {
			System.out.println(c);
		}
		/*
		ArrayList<Computer> computerList = new ArrayList<> ();
		computerList.add(c1);
		computerList.add(c2);
		computerList.add(c3);
		computerList.add(c4);
		computerList.add(c5);
		
		for(Computer c : computerList) {
			System.out.println(c);
		}
		*/
	}
}
