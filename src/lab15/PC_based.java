package lab15;

public class PC_based extends Game {
	private int min_ram;
	private int mg_for_hd;
	private double minGz;

	public PC_based(int min, int max, int mr, int md, double per) {
		super(min, max);
		setmegabytes_for_ram(mr);
		setmg_for_hd(md);
		setminGz(per);
	}

	public void setmegabytes_for_ram(int r) {
		min_ram = r;
	}

	public void setmg_for_hd(int r) {
		mg_for_hd = r;
	}

	public void setminGz(double r) {
		minGz = r;
	}
	//the minimum megabytes of RAM needed to play the game
	public int getmin_ram() {
		return min_ram;
	}
	//the number of megabytes needed on the hard drive to install the game
	public int getmg_for_hd() {
		return mg_for_hd;
	}
	//the minimum GHz performance of the cpu
	public double getminGz() {
		return minGz;
	}

	public String toString() {
		return "Minimum players: " + getMinPlayers() + "\nMaximum players: " + getMaxPlayers()
				+ "\nThe minimum required for ram is " + min_ram +" mega bytes\n"
				+ "The minimum required for hard drived is " + mg_for_hd +" megabytes\n"
				+ "The minimum required for CPU performance is " + minGz +" Hz.\n";
	}
}
