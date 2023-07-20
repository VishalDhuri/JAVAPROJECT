package assign;
import java.util.Scanner;
public class project {

		    public static void main(String[] args) {
		    	        String[] levelWords = {"holiday","programming","bootcamp","flowchart","wordscapes"};
		    	        
		    	        String[][] words = {{"hi","hay","day","had","lay","dal","lad","lid","hold","lady","hail"},
		    	                            {"go","an","in","no","on","map","mom","gap","gag","pig","man","ping","pong","pram","prom","ramp"},
		    	                            {"am","at","to","cab","cap","cob","cop","map","mop","act","bat","camp","comb","boom","pact","atom"},
		    	                            {"of","at","or","to","caw","cow","how","who","calf","claw","flaw","flow","fowl","wolf","crow","half"},
		    	                            {"we","do","as","cap","caw","cop","cow","paw","cod","dew","pad","cape","cope","crap","crew","crop","pace"}};

		    	        Scanner s = new Scanner(System.in);
		    	        int lives = 5;
		    	        System.out.println("WELCOME TO WORDSCAPES");
		    	        int level = 0;
		    	        int score = 0;
		    	        do{
		    	            System.out.println("Level "+(level+1));
		    	            System.out.println("Create 3 words using the given letters");
		    	            System.out.println(levelWords[level]);
		    	            System.out.println();

		    	            int wordCount = 0;
		    	            boolean match = false;
		    	            String word = "";
		    	            String oldWord = "";

		    	            while(wordCount == 0 || wordCount <3){
		    	                match = false;
		    	                System.out.println("Word: ");
		    	                word = s.next();
		    	                if(!(word.equalsIgnoreCase(oldWord))){
		    	                    for(String w : words[level]){
		    	                        if(word.equalsIgnoreCase(w)){
		    	                            wordCount++;
		    	                            score++;
		    	                            oldWord = word;
		    	                            match = true;
		    	                            break;
		    	                    }
		    	                }
		    	            }
		    	            if(!(match)){
		    	                System.out.println("Wrong Guess");
		    	                lives--;
		    	            }
		    	            if(lives ==0){
		    	                System.out.println("GameOver!! Better Luck next time!");
		    	                System.out.println("Your Score is "+score);
		    	                break;
		    	            }
		    	        }
		    	                wordCount = 0;
		    	                match = false;
		    	                word = "";

		    	                if(lives == 0){
		    	                    break;
		    	                }
		    	                if(level == 4){
		    	                    System.out.println("Thanks for playing the game!!!");
		    	                    System.out.println("your score is "+score);
		    	                    break;
		    	                }else{
		    	                    System.out.println("Do you want to continue to next level?(y/n)");
		    	                    char choice = s.next().charAt(0);
		    	                    if(choice == 'y'|| choice == 'Y'){
		    	                        level++;
		    	                    }else{
		    	                        System.out.println("Thanks for playing the game!!");
		    	                        System.out.println("your score is "+score);
		    	                        break;
		    	                    }
		    	                }
		    	            }while(level<5);
		    	    }
		    	}
