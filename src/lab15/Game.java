package lab15;
/**
 * 
 * @author admin
 *
 *
 */
public class Game {
	// minimum and maximum number of players.
	// Write a class encapsulating a PC-based game, which inherits from a Game
	// class.
	// A PC-based game has the following additional attributes:
	// the minimum megabytes of RAM needed to play the game,
	// the number of megabytes needed on the hard drive to install the game,
	// and the minimum GHz performance of the cpu. Code the constructor and
	// the toString method of the new class. You also need to include a client
	// class to test your code.
	private int minPlayers;
	private int maxPlayers;

	public Game(int min, int max) {
		minPlayers = min;
		maxPlayers = max;
	}

	public int getMinPlayers() {
		return minPlayers;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

}
