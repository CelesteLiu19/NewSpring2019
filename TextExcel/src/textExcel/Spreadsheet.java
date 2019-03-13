//@author Celeste Liu
package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int numOfRows = 20;
	private int numOfCols = 12; 
	private Cell[][] spreadsheet = new Cell[numOfRows][numOfCols];
	
	public Spreadsheet() {
		//makes the 2D array of Empty Cells
		for (int r = 0; r < getRows(); r++) {
			for (int c = 0; c < getCols(); c++) {
				spreadsheet [r][c] = new EmptyCell();
				//comment
			}
		}
	}
	
	@Override
	public String processCommand(String command)
	{
		
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return numOfRows;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return numOfCols;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
