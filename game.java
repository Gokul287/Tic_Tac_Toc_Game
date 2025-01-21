import java.util.*;
public class game {
    public static void main(String[] args) {
        System.out.println("helo");
        Scanner sc= new Scanner(System.in);
        int n=3;
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=' ';
            }
        }

        char player ='X';
        boolean gameOver = false;
        while(!gameOver) {
            printBoard(arr);
            System.out.println("Enter "+player +" value");
            int r=sc.nextInt();
            int c=sc.nextInt();

            if(arr[r][c]==' ')
            {
                arr[r][c]=player;
                gameOver= haveWon(arr,player);
                if(gameOver)
                {
                    printBoard(arr);
                    System.out.println(player+" won!!");
                }
                else{
                    player = (player=='X')?'O':'X';
                }
            }
            else {
                System.out.println("Wrong move  try Again!!");
            }

        }
    }

    public static boolean haveWon(char [][] arr,char player)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]== player && arr[i][2]== player && arr[i][2]== player )
                return true;

        }
        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[0][j]== player && arr[1][j]== player && arr[2][j]== player)
                return true;
        }
        if(arr[0][0] == player && arr[1][1]==player && arr[2][2]==player)
            return true;
        if(arr[0][2] == player && arr[1][1]==player && arr[2][0]==player)
            return true;

        return false;
    }
    public static void printBoard(char[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" |");
            }
            System.out.println();
        }

    }
}
