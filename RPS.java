import java.util.Scanner;

public class RPS {
    private final String[] possibilities = {"Rock", "Paper", "Scissors"};;
    private int you_score;
    private int ai_score;
    RPS(){
        you_score = 0;
        ai_score = 0;
    }

    private String aiChoice(){
        int choice = 0;
        while (true){
            choice = (int) (Math.random()*10);
            if (choice>=0 && choice<possibilities.length){
                return possibilities[choice];
            }
        }
    }
    private boolean playAgain(){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play again? 'Y' for yes and 'N' for no");
        char choice = in.next().charAt(0);
        if (choice=='Y' || choice=='y'){
            this.ai_score =0;
            this.you_score = 0;
            return true;
        } else if (choice=='N' || choice=='n') {
            return false;
        }else{
            System.out.println("Invalid input!\nThanks for playing our game");
        }
        return false;
    }

    void start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Rock, Paper, Scissors game");
        for (int i=0;i<3;i++){
            String ai_choice = this.aiChoice();
            System.out.println("Enter your choice: ");
            String choice = "";
            while (true) {
               choice = in.next();
               if (choice.equals("Rock") || choice.equals("Paper") || choice.equals("Scissors")){
                   break;
               }else {
                   System.out.println("Invalid choice, Please try again: ");
               }
            }
            if (choice.equals("Rock") && ai_choice.equals("Scissors")){
                System.out.println("Ai choice was " + ai_choice + ". You've won this round!");
                this.you_score++;
                System.out.println("Score is:\nYou: " + this.you_score + "\nAi: " + this.ai_score);
                System.out.println();
            } else if (choice.equals("Rock") && ai_choice.equals("Paper")) {
                System.out.println("Ai choice was " + ai_choice + ". Ai've won this round!");
                this.ai_score++;
                System.out.println("Score is:\nYou: " + this.you_score + "\nAi: " + this.ai_score);
                System.out.println();
            } else if (choice.equals("Paper") && ai_choice.equals("Rock")) {
                System.out.println("Ai choice was " + ai_choice + ". You've won this round!");
                this.you_score++;
                System.out.println("Score is:\nYou: " + this.you_score + "\nAi: " + this.ai_score);
                System.out.println();
            } else if (choice.equals("Paper") && ai_choice.equals("Scissors")) {
                System.out.println("Ai choice was " + ai_choice + ". Ai've won this round!");
                this.ai_score++;
                System.out.println("Score is:\nYou: " + this.you_score + "\nAi: " + this.ai_score);
                System.out.println();
            } else if (choice.equals("Scissors") && ai_choice.equals("Rock")) {
                System.out.println("Ai choice was " + ai_choice + ". Ai've won this round!");
                this.ai_score++;
                System.out.println("Score is:\nYou: " + this.you_score + "\nAi: " + this.ai_score);
                System.out.println();
            } else if (choice.equals("Scissors") && ai_choice.equals("Paper")) {
                System.out.println("Ai choice was " + ai_choice + ". You've won this round!");
                this.you_score++;
                System.out.println("Score is:\nYou: " + this.you_score + "\nAi: " + this.ai_score);
                System.out.println();
            } else {
                System.out.println("Ai choice was " + ai_choice + ". this round ended with a draw!");
                i--;
                System.out.println("Score is:\nYou: " + this.you_score + "\nAi: " + this.ai_score);
                System.out.println();
            }
            System.out.println();
        }
        if (this.you_score > this.ai_score){
            System.out.println("Congrats!! You have won!");
            System.out.println();
        } else if (this.ai_score > this.you_score) {
            System.out.println("Hard luck!! Ai have won!");
            System.out.println();
        }
        if (playAgain()){
            System.out.println();
            this.start();
        }else {
            System.out.println();
            System.out.println("Thanks for playing our game");
        }
    }
}
