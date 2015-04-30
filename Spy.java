// Spy

public class Spy extends Piece
{
	public Spy(int team, int x, int y)
	{
		super(team, x, y, 10);
	}

	// Spy beats 1 if the spy is the one attacking. Everything else beats it
	@Override
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
		
		if(otherPieceType == 1)
		{
			return 0;
		}
		else if(otherPieceType == this.getType())
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
}