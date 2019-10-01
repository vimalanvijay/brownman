package app;
import java.util.Scanner;

class Game{
    protected
    static int row=3;
    static int col=3;
    static char player1='X';
    static char player2='O';

    char[][]Board=new char[row][col];
    int row_in;
    int col_in;
    char player=player1;
    char oppoent=player2;

    public final static void clearConsole(){
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }
            else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e){
            //  Handle any exceptions.
        }
    }
    void initializeBoard(char [][]Board)
    {  
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                Board[i][j]=' ';
            }
        }
    }

    void printBoard(char [][]Board){
        for(int i=0;i<row;i++){
            System.out.println(" -------");
            System.out.print(i+1);
            System.out.print("|");
           

            for(int j=0;j<col;j++){
                System.out.print(Board[i][j]);
                System.out.print("|");
                
            }
            
            System.out.print("\n");
        }
    }

    void userInput(char[][]Board){
        Scanner scan=new Scanner(System.in);
               
        System.out.print("Enter row: ");
        row_in=scan.nextInt();
        System.out.print("Enter col: ");
        col_in=scan.nextInt();

    }

    boolean checkEmpty(char[][]Board,int x, int y){
        if(Board[x][y]==' ')
            return true;
        else return false;
    }

    boolean checkFull(char[][]Board){
        
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(Board[i][j]!=' '){
                    count++; 
                }
                    
            }
        }

        if(count==9){
            return true;
        }else{
            return false;
        }
    }

    void changePlayer(){

        if(player==player1){
            player=player2;
            oppoent=player1;
        }
            
        
        else{
            player=player1;
            oppoent=player2;
        }
           
    }

    boolean checkVictory(char[][] Board){
        if( (Board[0][0]==player) && (Board[0][0]==Board[1][0]) && (Board[1][0]==Board[2][0]) )
            return true;
        else if((Board[0][0]==player) && (Board[0][0]==Board[1][1]) && (Board[1][1]==Board[2][2]))
            return true;
        else if((Board[0][0]==player) && (Board[0][0]==Board[0][1]) && (Board[0][1]==Board[0][2]))
            return true;
        else if((Board[0][1]==player) && (Board[0][1]==Board[1][1]) && (Board[1][1]==Board[1][2]))
            return true;
        else if((Board[0][2]==player) && (Board[0][2]==Board[1][2]) && (Board[1][2]==Board[2][2]))
            return true;
        else if((Board[1][0]==player) && (Board[1][0]==Board[1][1]) && (Board[1][1]==Board[1][2]))
            return true;
        else if((Board[2][0]==player) && (Board[2][0]==Board[2][1]) && (Board[2][1]==Board[2][2]))
            return true;
        else if((Board[0][2]==player) && (Board[0][2]==Board[1][1]) && (Board[1][1]==Board[0][1]))
            return true;
            
        else return false;
    }

    void playGame(){
        System.out.print("\033\143");

        System.out.println("\n");
        System.out.println("****** WELCOME TO TIC TAC TOE ******");
        System.out.println("\n"); 
        Scanner scan=new Scanner(System.in);
        int count=0;
       


        System.out.println("Who starts? Player 1=X or Player 2=O");
        int choose= scan.nextInt();
        if(choose==1){
            player=player1;
            System.out.println("****** Player 1 starts ****** \n");
            
        }else{
            player=player2;
            System.out.println("****** Player 2 starts ****** \n");
        }      

        initializeBoard(Board);
        printBoard(Board);

        do{
            System.out.println("\nIt is "+player+"'s turn.");
            userInput(Board);

            if(checkEmpty(Board, row_in-1, col_in-1)==true){
                Board[row_in-1][col_in-1]=player;
                printBoard(Board);
                count++;
                if(checkVictory(Board)){
                    System.out.println(player+" is the winner!");
                    break;
                }
            }else{
                System.out.println("Error. That space is filled already!");
                changePlayer();
            }
            

            changePlayer();

            if(count==9){
                System.out.println("It's a draw match! :( ");
            }

        }while((!checkFull(Board)));
       

      

    }
    
}