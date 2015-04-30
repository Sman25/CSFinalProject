// Piece: Base class for all game pieces.
package pieces;

public class Piece
{	
	public static final int WHITE = 1;				// White team
	public static final int BLACK = 2;				// Black team

	private int teamColor;							// Team color
	private int xCor;								// Current x-coordinate
	private int yCor;								// Current y-coordinate
	private int type;								// Type of piece

	// New piece with team, location, type
	public Piece(int team, int x, int y, int t)
	{
		teamColor = team;
		xCor = x;
		yCor = y;
		type = t;
	}

	// Returns x-coordinate
	public int getX()
	{
		return xCor;
	}

	// Returns y-coordinate
	public int getY()
	{
		return yCor;
	}

	// Sets new position
	public void setPosition(int x, int y)
	{
		xCor = x;
		yCor = y;
	}

	// Returns team color
	public int getTeam()
	{
		return teamColor;
	}

	public int getType()
	{
		return type;
	}

	// Sets new x and y coordinate
	// Returns 0 if legal, -1 if illegal
	public int move(int x, int y)
	{
		// New x should only differ by 1 from old
		if(!(x - xCor == 1 || x - xCor == -1))
		{
			// New y should only differ by 1 from old
			if(!(y - yCor == 1 || y - yCor == -1))
			{
				return -1;							// Returns with error
			}
			// Y values differ by 1
			else
			{
				// X coordinates are the same
				if(x - xCor == 0)
				{
					// Sets new position, returns normal
					yCor = y;
					return 0;
				}
				else
				{
					return -1;						// Returns with error
				}
			}
		}
		// X values differ by 1
		else
		{	
			// Y values are the same
			if(y - yCor == 0)
			{
				// Set new position, returns normal
				xCor = x;
				return 0;
			}
			else
			{
				return -1;							// Returns with error
			}
		}
	}

	// Returns the winner of a fight between this piece and another
	// 0 if win, 1 if tie, 2 if loss, -1 if error
	public int fight(int otherPieceType)
	{
		// If bomb
		if(otherPieceType == 11)
		{
			return 2;
		}

		// If flag
		if(otherPieceType == 12)
		{
			// End game
		}

		if(this.getType() < otherPieceType)
		{
			return 0;
		}

		else if(this.getType() > otherPieceType)
		{
			return 2;
		}

		else
		{
			return 1;
		}
	}
}