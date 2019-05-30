package EraseOrArrays;
 import java.util.Arrays;
public class StringSort {
	public static void main(String[] args) {
		String[] SoccerPlayer = new String[11];
		SoccerPlayer [0] = "Messi";
				SoccerPlayer [0] = "Mbappe";
				SoccerPlayer [1] = "Benzema";
				SoccerPlayer [2] = "Ronaldo";
				SoccerPlayer [3] = "Pique";
				SoccerPlayer [4] = "Puyol";
				SoccerPlayer [5] = "Casillas";
				SoccerPlayer [6] = "Salah";
				SoccerPlayer [7] = "Grizman";
				SoccerPlayer [8] = "Azamat";
				SoccerPlayer [9] = "Ozil";
				SoccerPlayer [10] = "Pogba";
				
				Arrays.sort(SoccerPlayer);
				System.out.println(Arrays.toString(SoccerPlayer));
				String PlayerPower[] = new String[11];
				PlayerPower[0] = "90";
				PlayerPower[1] = "95";
				PlayerPower[2] = "8";
				PlayerPower[3] = "88";
				PlayerPower[4] = "87";
				PlayerPower[5] = "56";
				PlayerPower[6] = "87";
				PlayerPower[7] = "91";
				PlayerPower[8] = "98";
				PlayerPower[9] = "9";
				PlayerPower[10] = "3";
				
			Arrays.sort(PlayerPower);
			System.out.println(Arrays.toString(PlayerPower ));
				
		
	}

}
