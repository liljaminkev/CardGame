package strategyassets;


import playerassets.Player;

//interface that returns a move
public interface Strategy
{
    public int getLegalMove(Player playerA);
}
