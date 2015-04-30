// Bomb

public class Bomb extends Piece
{
	public Bomb(int team, int x, int y)
	{
		super(team, x, y, 11);
	}

	// Bomb cannot move
	@Override
	public int move(int x, int y)
	{
		return -1;
	}

	// Bomb should never be attacking
	@Override
	public int fight(int otherPieceType)
	{
		return -1;
	}
}