//TCS NQT Question No:1

import java.util.*;

class TCS1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }

        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }

        for (int i = count; i <n ; i++) {
            arr[i]=0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}



class TCS2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] digits = new int[n];
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int num = arr[i] + carry;
            if (num == 10) {
                digits[i] = 0;
            } else {
                digits[i] = num;
                carry = 0;
                break;
            }
        }
        if (carry == 1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        System.out.println(Arrays.toString(digits));
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Game{
    public static void main(String...args){
        String key =
                "  ___\n" +
                        " /    \\\n" +
                        "| ()() |\n" +
                        " \\_  _/\n" +
                        "   ||\n" +
                        "   ||\n" +
                        "   ||\n"+
                        " {J  L} ";

        System.out.println(key);
        // Print the treasure box ASCII art to the console
        String treasureBoxArt =
                "  ___________________________________________\n" +
                        " /                                           \\\n" +
                        "|                                             |\n" +
                        "|   ___             ___             ___       |\n" +
                        "|  |   |           |   |           |   |      |\n" +
                        "|  |   |           |   |           |   |      |\n" +
                        "|  |___|           |___|           |___|      |\n" +
                        "|___________________| + |_____________________|\n" +
                        "                    |_0_|                     |\n"+
                        "|  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     |\n" +
                        "|  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     |\n" +
                        "|  $$$$$$$       TRESSURE BOX     $$$$$$$     |\n" +
                        "|  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     |\n" +
                        "|  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     |\n" +
                        "|  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     |\n" +
                        "|  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     |\n" +
                        "|  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     |\n" +
                        "|_____________________________________________|\n";



        // Print the "Game Over" ASCII art to the console
        System.out.println("!!!!!Welcome to the Tressure huting !!!!");String gameOverArt =
                "  _____                         ____                 _ \n" +
                        " / ____|                       / __ \\               | |\n" +
                        "| |  __  __ _ _ __ ___   ___  | |  | |_   _____ _ __| |\n" +
                        "| | |_ |/ _` | '_ ` _ \\ / _ \\ | |  | \\ \\ / / _ \\ '__| |\n" +
                        "| |__| | (_| | | | | | |  __/ | |__| |\\ V /  __/ |  |_|\n" +
                        " \\_____|\\__,_|_| |_| |_|\\___|  \\____/  \\_/ \\___|_|  (_)";



        boolean condition=true;
        while(condition){

            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter the 'Y' for New game and 'N' for exit:");
            String start=scanner.nextLine().toUpperCase();
            if(start.equals("N")){
                condition=false;}
            else{

                System.out.print("Enter the 'RIGHT' or 'left' to next level:");
                String lvl1=scanner.nextLine().toUpperCase();


                if(lvl1.equals("RIGHT")){
                    System.out.println("woovvvv congrats, you in the next level");
                    System.out.print("you are in the lake make a choice 'SWIM' or 'WAIT':");
                    String lvl2=scanner.nextLine().toUpperCase();
                    if(lvl2.equals("WAIT")){
                        System.out.println("Ossom,you make an good choice the boat was came and pick up you to a island");
                        System.out.println("There is a four caves here{ ENETR '1'forgo to (cave-1)||'2' for (cave-2) ||'3'for (cave-3) ||'4'for (cave-4)}");
                        int lvl3=scanner.nextInt();
                        if (lvl3==1){
                            System.out.println("oh! oh!,The room full of an fire,you turn into an ash");
                            System.out.println(gameOverArt);

                        }
                        else if(lvl3==2){
                            System.out.println("wow,you'll find a tressure.Hava a blast.");
                            System.out.println(treasureBoxArt);
                        }
                        else if(lvl3==3){
                            System.out.println("alash! the room full of an snake.you died");
                            System.out.println(gameOverArt);
                        }
                        else if(lvl3==4){
                            System.out.println("ahhhh! its devils cava you lose");
                            System.out.println(gameOverArt);
                        }
                    }
                    else if(lvl2.equals("SWIM")){
                        System.out.println("'Ahhhhhh'No,you will attacked by an hungry crocodiles .you lose,");
                        System.out.println(gameOverArt);
                    }

                }
                else if(lvl1.equals("LEFT"))
                {
                    System.out.println("sorry there is a dead end you lose");
                    System.out.println(gameOverArt);
                }
                else
                {
                    System.out.println("You enterd a invalid choice you lose");
                    System.out.println(gameOverArt);
                }
            }
        }
    }}
