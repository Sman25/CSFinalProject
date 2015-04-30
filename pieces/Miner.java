// Miner
package pieces;

public class Miner extends Piece
{
	public Miner(int team, int x, int y)
	{
		super(team, x, y, 8);
	}

	// Miner beats bomb.
	@Override
	public int fight(int otherPieceType)
	{
		if(otherPieceType == 11)
		{
			return 0;
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