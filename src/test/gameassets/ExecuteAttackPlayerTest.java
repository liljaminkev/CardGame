package test.gameassets;

import cards.hearthstone.Romulo;
import junit.framework.TestCase;
import playerassets.Deck;
import playerassets.Hand;
import playerassets.Player;
public class ExecuteAttackPlayerTest extends TestCase{
  
  Player player;
  Hand hand;
  Deck deck;
  PlayerHero hero = new PlayerHero(15, 0);
  Romulo romulo;
  
  public void attackPlayer()
  {
    MoveAttackPlayer atk = new MoveAttackPlayer(romulo, player);
    ExecuteAttackPlayer executeAtk = new ExecuteAttackPlayer(atk);
    executeAtk.execute();
    assertEquals(11, atk.getPlayer().getHero().getHealthPoints());
  }
  
  
  public void setUp()
  {
      deck = new Deck();
      hand = new Hand();
      romulo = new Romulo();
      player = new Player(hero, deck, hand);
  }
}