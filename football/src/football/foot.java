package football;

public class foot {
	public static int pointCalc (int wins, int draws, int losses) {
		return (wins*3+draws*1+ losses*0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int team1=pointCalc (3,4,2);
		int team2= pointCalc (5,0,2);
		int team3= pointCalc (0,0,1);
		System.out.println ("points for Team 1:"+team1);
		System.out.println ("points for Team 2:"+team2);
		System.out.println ("points for Team 3:"+team3);
	}

}
