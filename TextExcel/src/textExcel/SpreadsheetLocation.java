//@author Celeste Liu
package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private String cellName;
	
    @Override
    public int getRow()
    {
    	int row;
    	row = Integer.parseInt(cellName.substring(1)) - 1;
        // TODO Auto-generated method stub
        return row;
    }

    @Override
    public int getCol()
    {
    	int col; 
    	col = cellName.toUpperCase().charAt(0) - 'A';
        // TODO Auto-generated method stub
        return col;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	this.cellName = cellName; 
        // TODO: Fill this out with your own code
    }

}
