package lk.peruma.tictactoe;

import android.app.AlertDialog;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class Game5X5 extends AppCompatActivity {

    private State currentPlayer;
    private int colorCurrentPlayer,colorWinningBackground;
    private boolean gameCompleted, vsComputer;
    private int availableSquares;
    private int ScoreO=0,ScoreX=0;

    private State[][] squares;

    TextView textGameStatus;
    TextView scoreO,scorex;
    Button Reset;
    Button btn002,btn012,btn022,btn032,btn042;
    Button btn102,btn112,btn122,btn132,btn142;
    Button btn202,btn212,btn222,btn232,btn242;
    Button btn302,btn312,btn322,btn332,btn342;
    Button btn402,btn412,btn422,btn432,btn442;
    Button btnNewGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game5_x5);
        Reset=findViewById(R.id.resetScore);
        scorex=findViewById(R.id.scorex);
        scoreO=findViewById(R.id.scoreo);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScoreX=0;ScoreO=0;
                scorex.setText(String.valueOf(ScoreX));
                scoreO.setText(String.valueOf(ScoreO));
                initializeGame();
            }
        });
        btn002 = findViewById(R.id.button002);
        btn012 = findViewById(R.id.button012);
        btn022 = findViewById(R.id.button022);
        btn032 = findViewById(R.id.button032);
        btn042 = findViewById(R.id.button042);

        btn102 = findViewById(R.id.button102);
        btn112 = findViewById(R.id.button112);
        btn122 = findViewById(R.id.button122);
        btn132 = findViewById(R.id.button132);
        btn142 = findViewById(R.id.button142);

        btn202 = findViewById(R.id.button202);
        btn212 = findViewById(R.id.button212);
        btn222 = findViewById(R.id.button222);
        btn232 = findViewById(R.id.button232);
        btn242 = findViewById(R.id.button242);

        btn302 = findViewById(R.id.button302);
        btn312 = findViewById(R.id.button312);
        btn322 = findViewById(R.id.button322);
        btn332 = findViewById(R.id.button332);
        btn342 = findViewById(R.id.button342);

        btn402 = findViewById(R.id.button402);
        btn412 = findViewById(R.id.button412);
        btn422 = findViewById(R.id.button422);
        btn432 = findViewById(R.id.button432);
        btn442 = findViewById(R.id.button442);

        textGameStatus = (TextView) findViewById(R.id.textGameStatus2);
        btnNewGame = (Button) findViewById(R.id.buttonNewGame2);
        btnNewGame.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        initializeGame();
                    }
                }
        );

        initializeGame();
    }



    private void systemMove(){
        int row,column;

        while (true) {
            row = (int) (Math.random() * 5 + 0);
            column = (int) (Math.random() * 5 + 0);
            if(squares[row][column] == State.Blank)
            {
                String buttonTag = "["+row+"]["+column+"]";

                GridLayout grid = (GridLayout) findViewById(R.id.activity_game2);
                int count = grid.getChildCount();
                for(int i=0;i<count;i++){
                    View v = grid.getChildAt(i);
                    if (v instanceof Button){
                        if(v.getTag()!=null && v.getTag().equals(buttonTag)) {
                            onClick(v);
                            return;
                        }
                    }
                }
            }
        }
    }
    public void onClick(View v) {

        if (!gameCompleted) {

            Button button = (Button) v;

            button.setText(currentPlayer.toString());
            button.setTextColor(colorCurrentPlayer);
            button.setClickable(false);

            if(btn002.getId() == v.getId()){
                squares[0][0] = currentPlayer;
                availableSquares--;
            }
            else if(btn012.getId() == v.getId()){
                squares[0][1] = currentPlayer;
                availableSquares--;
            }
            else if(btn022.getId() == v.getId()){
                squares[0][2] = currentPlayer;
                availableSquares--;
            }
            else if(btn032.getId() == v.getId()){
                squares[0][3] = currentPlayer;
                availableSquares--;
            }
            else if(btn042.getId() == v.getId()){
                squares[0][4] = currentPlayer;
                availableSquares--;
            }
            else if(btn102.getId() == v.getId()){
                squares[1][0] = currentPlayer;
                availableSquares--;
            }
            else if(btn112.getId() == v.getId()){
                squares[1][1] = currentPlayer;
                availableSquares--;
            }
            else if(btn122.getId() == v.getId()){
                squares[1][2] = currentPlayer;
                availableSquares--;
            }
            else if(btn132.getId() == v.getId()){
                squares[1][3] = currentPlayer;
                availableSquares--;
            }
            else if(btn142.getId() == v.getId()){
                squares[1][4] = currentPlayer;
                availableSquares--;
            }
            else if(btn202.getId() == v.getId()){
                squares[2][0] = currentPlayer;
                availableSquares--;
            }
            else if(btn212.getId() == v.getId()){
                squares[2][1] = currentPlayer;
                availableSquares--;
            }
            else if(btn222.getId() == v.getId()){
                squares[2][2] = currentPlayer;
                availableSquares--;
            }
            else if(btn232.getId() == v.getId()){
                squares[2][3] = currentPlayer;
                availableSquares--;
            }
            else if(btn242.getId() == v.getId()){
                squares[2][4] = currentPlayer;
                availableSquares--;
            }
            else if(btn302.getId() == v.getId()){
                squares[3][0] = currentPlayer;
                availableSquares--;
            }
            else if(btn312.getId() == v.getId()){
                squares[3][1] = currentPlayer;
                availableSquares--;
            }
            else if(btn322.getId() == v.getId()){
                squares[3][2] = currentPlayer;
                availableSquares--;
            }
            else if(btn332.getId() == v.getId()){
                squares[3][3] = currentPlayer;
                availableSquares--;
            }
            else if(btn342.getId() == v.getId()){
                squares[3][4] = currentPlayer;
                availableSquares--;
            }
            else if(btn402.getId() == v.getId()){
                squares[4][0] = currentPlayer;
                availableSquares--;
            }
            else if(btn412.getId() == v.getId()){
                squares[4][1] = currentPlayer;
                availableSquares--;
            }
            else if(btn422.getId() == v.getId()){
                squares[4][2] = currentPlayer;
                availableSquares--;
            }
            else if(btn432.getId() == v.getId()){
                squares[4][3] = currentPlayer;
                availableSquares--;
            }
            else if(btn442.getId() == v.getId()){
                squares[4][4] = currentPlayer;
                availableSquares--;
            }

            updateScore();

            if (!gameCompleted) {
                if (availableSquares == 0){
                    gameCompleted = true;
                    textGameStatus.setText("Game Drawn!");
                    return;
                }
                else {
                    changePlayer();
                    textGameStatus.setText("Current Player: "+currentPlayer.name());
                    if(currentPlayer == State.O && vsComputer)
                        systemMove();
                }
            }
            else{
                textGameStatus.setText("Winner: "+currentPlayer.name());
                if (currentPlayer.equals(State.X)){
                    ScoreX+=1;
                    scorex.setText(String.valueOf(ScoreX));
                }
                else if (currentPlayer.equals(State.O)){
                    ScoreO+=1;
                    scoreO.setText(String.valueOf(ScoreO));
                }
            }

        }
    }
    private void changePlayer(){
        currentPlayer = currentPlayer.equals(State.X)? State.O: State.X;
        colorCurrentPlayer=  colorCurrentPlayer == Color.argb(255,236,26,97)?  Color.argb(255,55,37,2):Color.argb(255,236,26,97);
    }

    private void initializeGame(){
        colorCurrentPlayer = Color.argb(255,236,26,97);
        colorWinningBackground = Color.parseColor("#FF34B5E5");

        squares = new State[5][5];
        gameCompleted = false;
        availableSquares = 25;
        currentPlayer = State.X;

        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                squares[i][j] = State.Blank;
//setting all boxes into an empty text
        btn002.setText("");
        btn012.setText("");
        btn022.setText("");
        btn032.setText("");
        btn042.setText("");

        btn102.setText("");
        btn112.setText("");
        btn122.setText("");
        btn132.setText("");
        btn142.setText("");

        btn202.setText("");
        btn212.setText("");
        btn222.setText("");
        btn232.setText("");
        btn242.setText("");

        btn302.setText("");
        btn312.setText("");
        btn322.setText("");
        btn332.setText("");
        btn342.setText("");

        btn402.setText("");
        btn412.setText("");
        btn422.setText("");
        btn432.setText("");
        btn442.setText("");
//making all boxes clickable
        btn002.setClickable(true);
        btn012.setClickable(true);
        btn022.setClickable(true);
        btn032.setClickable(true);
        btn042.setClickable(true);
        btn102.setClickable(true);
        btn112.setClickable(true);
        btn122.setClickable(true);
        btn132.setClickable(true);
        btn142.setClickable(true);
        btn202.setClickable(true);
        btn212.setClickable(true);
        btn222.setClickable(true);
        btn232.setClickable(true);
        btn242.setClickable(true);
        btn302.setClickable(true);
        btn312.setClickable(true);
        btn322.setClickable(true);
        btn332.setClickable(true);
        btn342.setClickable(true);
        btn402.setClickable(true);
        btn412.setClickable(true);
        btn422.setClickable(true);
        btn432.setClickable(true);
        btn442.setClickable(true);



//Setting Background for all boxes in the grid view
        btn002.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn012.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn022.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn032.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn042.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        btn102.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn112.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn122.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn132.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn142.setBackgroundColor(getResources().getColor(R.color.colorPrimary));


        btn202.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn212.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn222.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn232.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn242.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        btn302.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn312.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn322.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn332.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn342.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        btn402.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn412.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn422.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn432.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        btn442.setBackgroundColor(getResources().getColor(R.color.colorPrimary));


        textGameStatus.setText("Current Player: "+currentPlayer.name());

        vsComputer = getIntent().getStringExtra("GameType").equalsIgnoreCase("Computer")?true:false;

        if(vsComputer){
            setTitle("TicTacToe - Play Against Computer");
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder
                    .setTitle("You Vs. Computer")
                    .setMessage("You start the game. You're 'X'.\n\nGood Luck!")
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .setPositiveButton("Close", null)
                    .show();
        }
        else
            setTitle("TicTacToe - Play Against Human");

    }
    private void updateScore(){
        if(squares[0][0] == currentPlayer && squares[0][1] == currentPlayer && squares[0][2] == currentPlayer&& squares[0][3] == currentPlayer&& squares[0][4] == currentPlayer){
            btn002.setBackgroundColor(colorWinningBackground);
            btn012.setBackgroundColor(colorWinningBackground);
            btn022.setBackgroundColor(colorWinningBackground);
            btn032.setBackgroundColor(colorWinningBackground);
            btn042.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }

        if(squares[1][0] == currentPlayer && squares[1][1] == currentPlayer && squares[1][2] == currentPlayer&& squares[1][3] == currentPlayer&& squares[1][4] == currentPlayer){
            btn102.setBackgroundColor(colorWinningBackground);
            btn112.setBackgroundColor(colorWinningBackground);
            btn122.setBackgroundColor(colorWinningBackground);
            btn132.setBackgroundColor(colorWinningBackground);
            btn142.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }

        if(squares[2][0] == currentPlayer && squares[2][1] == currentPlayer && squares[2][2] == currentPlayer&& squares[2][3] == currentPlayer&& squares[2][4] == currentPlayer){
            btn202.setBackgroundColor(colorWinningBackground);
            btn212.setBackgroundColor(colorWinningBackground);
            btn222.setBackgroundColor(colorWinningBackground);
            btn232.setBackgroundColor(colorWinningBackground);
            btn242.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }
        if(squares[3][0] == currentPlayer && squares[3][1] == currentPlayer && squares[3][2] == currentPlayer&& squares[3][3] == currentPlayer&& squares[3][4] == currentPlayer){
            btn302.setBackgroundColor(colorWinningBackground);
            btn312.setBackgroundColor(colorWinningBackground);
            btn322.setBackgroundColor(colorWinningBackground);
            btn332.setBackgroundColor(colorWinningBackground);
            btn342.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }
        if(squares[4][0] == currentPlayer && squares[4][1] == currentPlayer && squares[4][2] == currentPlayer&& squares[4][3] == currentPlayer&& squares[4][4] == currentPlayer){
            btn402.setBackgroundColor(colorWinningBackground);
            btn412.setBackgroundColor(colorWinningBackground);
            btn422.setBackgroundColor(colorWinningBackground);
            btn432.setBackgroundColor(colorWinningBackground);
            btn442.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }

        if(squares[0][0] == currentPlayer && squares[1][0] == currentPlayer && squares[2][0] == currentPlayer&& squares[3][0] == currentPlayer&& squares[4][0] == currentPlayer){
            btn002.setBackgroundColor(colorWinningBackground);
            btn102.setBackgroundColor(colorWinningBackground);
            btn202.setBackgroundColor(colorWinningBackground);
            btn302.setBackgroundColor(colorWinningBackground);
            btn402.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }

        if(squares[0][1] == currentPlayer && squares[1][1] == currentPlayer && squares[2][1] == currentPlayer&& squares[3][1] == currentPlayer&& squares[4][1] == currentPlayer){
            btn012.setBackgroundColor(colorWinningBackground);
            btn112.setBackgroundColor(colorWinningBackground);
            btn212.setBackgroundColor(colorWinningBackground);
            btn312.setBackgroundColor(colorWinningBackground);
            btn412.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }

        if(squares[0][2] == currentPlayer && squares[1][2] == currentPlayer && squares[2][2] == currentPlayer&& squares[3][2] == currentPlayer&& squares[4][2] == currentPlayer){
            btn022.setBackgroundColor(colorWinningBackground);
            btn122.setBackgroundColor(colorWinningBackground);
            btn222.setBackgroundColor(colorWinningBackground);
            btn322.setBackgroundColor(colorWinningBackground);
            btn422.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }
        if(squares[0][3] == currentPlayer && squares[1][3] == currentPlayer && squares[2][3] == currentPlayer&& squares[3][3] == currentPlayer&& squares[4][3] == currentPlayer){
            btn032.setBackgroundColor(colorWinningBackground);
            btn132.setBackgroundColor(colorWinningBackground);
            btn232.setBackgroundColor(colorWinningBackground);
            btn332.setBackgroundColor(colorWinningBackground);
            btn432.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }
        if(squares[0][4] == currentPlayer && squares[1][4] == currentPlayer && squares[2][4] == currentPlayer&& squares[3][4] == currentPlayer&& squares[4][4] == currentPlayer){
            btn042.setBackgroundColor(colorWinningBackground);
            btn142.setBackgroundColor(colorWinningBackground);
            btn242.setBackgroundColor(colorWinningBackground);
            btn342.setBackgroundColor(colorWinningBackground);
            btn442.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }

        if(squares[0][0] == currentPlayer && squares[1][1] == currentPlayer && squares[2][2] == currentPlayer&& squares[3][3] == currentPlayer&& squares[4][4] == currentPlayer){
            btn002.setBackgroundColor(colorWinningBackground);
            btn112.setBackgroundColor(colorWinningBackground);
            btn222.setBackgroundColor(colorWinningBackground);
            btn332.setBackgroundColor(colorWinningBackground);
            btn442.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }

        if(squares[0][4] == currentPlayer && squares[1][3] == currentPlayer && squares[2][2] == currentPlayer&& squares[3][1] == currentPlayer&& squares[4][0] == currentPlayer){
            btn042.setBackgroundColor(colorWinningBackground);
            btn132.setBackgroundColor(colorWinningBackground);
            btn222.setBackgroundColor(colorWinningBackground);
            btn312.setBackgroundColor(colorWinningBackground);
            btn402.setBackgroundColor(colorWinningBackground);
            gameCompleted = true;
            return;
        }


    }



    private enum State{
        X,O,Blank
    }
}
