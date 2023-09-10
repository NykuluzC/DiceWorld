package main;

public class Game{
  //Constructor
  private GameWindow gameWindow;
  private GamePanel gamePanel;
  public Game(){
    gamePanel = new GamePanel();
    gameWindow = new GameWindow(gamePanel);
  }
}
