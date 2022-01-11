package com;

public class TestTable {

	public static void main(String[] args) {
		Table.tableCount();
		Table t1 = new Table(3, 3); 
		Table t2 = new Table(4, 2);
		Table t3 = new Table();
		t1.calculateCells(); // result = 3 * 3
		t2.calculateCells(); // result = 4 * 2
		t3.calculateCells();
		Table.tableCount();
	}

}
