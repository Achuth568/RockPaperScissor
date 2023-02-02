import java.util.Scanner;
import java.util.Random;


public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		
		String rps[]={"r","p","s"};
		String computerMove=rps[new Random().nextInt(rps.length)];
		String playermove;
		
		while(true){
			
			System.out.println("choose one of r ,p and s");
			
			playermove=sc.nextLine();
			
			
			if(playermove.equals("r")||playermove.equals("p")||playermove.equals("s") ){
				break;
			}
		
				System.out.println(playermove+"invalid move");
			
		}
			System.out.println("computermove "+computerMove);
			
			if(playermove.equals(computerMove)){
				System.out.println("the game was tie");
			}
			else if(playermove.equals("r")){
				if(computerMove.equals("p")){
					System.out.println("you loose");
				}
				else if(computerMove.equals("s")){
					System.out.println("you won");
				}
			}
			
			else if(playermove.equals("p")){
				if(computerMove.equals("r"))
				{
					System.out.println("you won");
				}
				else if(computerMove.equals("s")){
					System.out.println("you loose");
				}
			}
			
			else if(playermove.equals("s")){
				if(computerMove.equals("r")){
					System.out.println("you loose");
				}
				else if(computerMove.equals("p")){
					System.out.println("you win");
				}
			}
			
			System.out.println("play again?(y/n)");
			String playagain =sc.nextLine();
			if(!playagain.equals("y")){
				break;
			}
			
		}
		
		sc.close();
		}
	}


