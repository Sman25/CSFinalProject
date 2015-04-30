// Scout

public class Scout extends Piece
{
	public Scout(int team, int x, int y)
	{
		super(team, x, y, 9);
	}

	// Scout can move any distance in 1 direction
	@Override
	public int move(int x, int y)
	{
		int xDif = x - getX();
		int yDif = y - getY();
		if(xDif != 0 && yDif != 0)
		{
			return -1;
		}

		if(xDif != 0)
		{
			if(yDif == 0)
			{
				this.setPosition(x, y);
				return 0;
			}

			else
			{
				return -1;
			}
		}

		else if(yDif != 0)
		{
			if(xDif == 0)
			{
				this.setPosition(x, y);
				return 0;
			}

			else
			{
				return -1;
			}
		}

		else
		{
			return -1;
		}
	}
}