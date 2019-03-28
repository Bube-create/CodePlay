import java.io.*;

public class CodePlayApp {
    String userName;
    int userLevel;
    int userPoints;
    int[] userMainCode;
    boolean userWins;
    char[] codeFound;
    
    static int deadCount;
    static injuredCount;
    static int points;
    
    static int[] compSpaceOne;
    static int[] compSpaceTwo;
    static int[] compSpaceThree;
    static int[] compSpaceFour;
    static int[] userTestCode;
    static String rewardText;
    
    public static void mainGameProcessor (int[] userMainCode, int[] userTestCode){
        for ( int i = 0; i < userMainCode.length; i++){
            if (userMainCode[i] == userTestCode[i]){
                deadCount++;
                points+= 5;
                codeFound[i] = 'i';
            }
            else if (userMainCode[0] == userTestCode[i]){
            injuredCount++;
            points += 2;
        }
        else if (userMainCode[1] == userTestCode[i]){
            injuredCount++;
            points += 2;
        }
        else if (userMainCode[2] == userTestCode[i]){
            injuredCount++;
            points += 2;
        }
        else if (userMainCode[3] == userTestCode[i]){
            injuredCount++;
            points += 2;
        }
    }
        
    }
    public static void allVariableInitilize(){
        injuredCount = 0;
        deadCount = 0;
        points = 0;
        for (int i = 0; i < userTestCode.length; i++){
            userTestCode[i] = 0;
        }
    }
    
    public static boolean setUserWins (char[] codeFound){
        int foundCounter = 0;
        for (int i + 0; i < codeFound.length; i++){
            if (codeFound[i] == 'i'){
                foundCounter++;
            }
        }
        if (foundCounter >= 4) {
            return true;
        }
        else {
            return false;
        }
        
    }
	
	public static void compSampleSpaceGenerator (int[] userMainCode, int userLevel){
	    if (userLevel == 2){
	        playerWants(2);
	        for (int i = 0, j = -3; j < 4; i++, j++){
	            compSpaceOne[i] = userMainCode[0] + j % 10;
	            compSpaceTwo[i] = userMainCode[1] + j % 10;
	            compSpaceThree[i] = userMainCode[2] + j % 10;
	            compSpaceFour[i] = userMainCode[3] + j % 10;
	        }
	   else if (userLevel == 2){
	        playerWants(2);
	        for (int i = 0, j = -3; j < 3; i++, j++){
	            compSpaceOne[i] = userMainCode[0] + j % 10;
	            compSpaceTwo[i] = userMainCode[1] + j % 10;
	            compSpaceThree[i] = userMainCode[2] + j % 10;
	            compSpaceFour[i] = userMainCode[3] + j % 10;
	        }
	    }
	}
	
	public static void playerWants (int userLevel){
	    if (userLevel == 2){
	        compSpaceOne = new int[7];
	        compSpaceTwo = new int[7];
	        compSpaceThree = new int[7];
	        compSpaceFour = new int[7];
	    }
	    else if (userLevel == 2){
	        compSpaceOne = new int[5];
	        compSpaceTwo = new int[5];
	        compSpaceThree = new int[5];
	        compSpaceFour = new int[5];
	    }
	}
	
	public static int[] setCompMainCode (){
	    Random rand = new Random();
	    int[] compCode = new int[4];
	    for (int i = 0; i < compCode.length; i++){
	        compCode[i] = rand.nextInt(10);
	    }
	}
	
	
	
	
   /* public static int[] getUserInput (){
        String userInput;
        Scanner input = new Scanner(System.in);
        userInput = input.next();
        Character test;
        char[] userChar = new char[userInput.length];
        int[] userMainCode = new Int[userChar.length];
        for (int i = 0; i < userMainCode.length; i++){
          if (test.charAt(userInput[i]).isDigit == true){
            userChar[i] == test.charAt(userInput[i]);
          }
          for (int i = 0; i < userMainCode.length; i++){
            if (userChar[i])
          }
        }
    }
	public static void main (String[] args) {
		System.out.println("GfG!");
	}*/
}
