import java.util.Scanner;

public class theory{
	
	public static void main(String[] args){
		boolean[] access = new boolean[12];
		String info = "The goal is to hack the words to access the secret facility inside the floor, you have to solve famous riddles to understand the paragraphs you will find and you need to insert each instruction in order to pass through, it's like reprogramming me.\n There is x riddles figure the number of riddles, in order not to get bored.";
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < access.length; i++)access[i] = false;
		System.out.println("Words Detective");
		System.out.println(info);
		System.out.println("Put the first initial letter, to show how to get a single word with a capital start.");
		if(keyboard.nextLine() == "W Word"){
			access[0] = true;
		}
		System.out.println("'Dozens' got six letters in order to pass to twelvth, super!");
		if(keyboard.nextLine() == "Subtract one letter"){
			access[1] = true;
		}
		System.out.println("A Dozen move from it's own base to an upper base and added number of rounds around the black cube, write my ip.");
		if(keyboard.nextLine() == "127.0.0.1"){
			access[2] = true;
		}
		System.out.println("Portable used my ip before 4999 ports.");
		if(keyboard.nextLine() == "Flask"){
			access[3] = true;
		}
		System.out.println("Cube that used the same port number.");
		if(keyboard.nextLine() == "17.098619406795"){
			access[4] = true;
		}
		System.out.println("How about a number of atoms?");
		if(keyboard.nextLine() == "Chlorine"){
			access[5] = true;
		}
		System.out.println("Spiritual second digit.");
		if(keyboard.nextLine() == "7"){
			access[6] = true;
		}
		System.out.println("Numbers relation are to ... questions.");
		if(keyboard.nextLine() == "Four"){
			access[7] = true;
		}
		System.out.println("Use it for defining [(2, 2), (3, 3)] with no brackets.");
		if(keyboard.nextLine() == "xmin, ymin, xmax, ymax"){
			access[8] = true;
		}
		System.out.println("how many and what shape are in the following 2:1 dimensions space");
		System.out.println("************");
		System.out.println("************");
		System.out.println("************");
		System.out.println("************");
		System.out.println("************");
		System.out.println("************");
		if(keyboard.nextLine() == "Two cubes"){
			access[9] = true;
		}
		System.out.println("What color is the big star");
		if(keyboard.nextLine() == "Blue"){
			access[10] = true;
		}
		System.out.println("How far did you reach?(10:1, 8:#, 14:2 b c)");
		if(keyboard.nextLine() == "Word dozen, 49991774, two blue cubes"){
			access[11] = true;
		}
		for(int i = 0; i < access.length; i++){
			if(access[i] != true){
				return;
			}
		}
		System.out.println("Winners are Winners!!");
	}
}
