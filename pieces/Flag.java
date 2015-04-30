// Flag
package pieces;

public class Flag extends Piece
{
	public Flag(int team, int x, int y)
	{
		super(team, x, y, 12);
	}

	// Flag cannot move
	@Override
	public int move(int x, int y)
	{
		return -1;
	}

	// Flag should never be attacking
	public int fight(int otherPieceType)
	{
		return -1;
	}
}