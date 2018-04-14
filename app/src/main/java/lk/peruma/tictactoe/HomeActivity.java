package lk.peruma.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnHuman, btnComputer;
    Spinner player1, player2;
    Spinner boardtype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnComputer = (Button) findViewById(R.id.buttonComputer);
        btnHuman = (Button) findViewById(R.id.buttonHuman);
        boardtype = findViewById(R.id.boardSpinner);
        player1 = findViewById(R.id.player1spinner);
        player2 = findViewById(R.id.player2spinner);

        setTitle("TicTacToe - Select Game Type");
    }

    public String getboardtype() {
        String Activity;
        if (boardtype.getSelectedItem().toString().equalsIgnoreCase("3X3")) {
            Activity = "lk.peruma.tictactoe.GameActivity";
        } else
            Activity = "lk.peruma.tictactoe.Game5X5";
        return Activity;
    }

    public void onClick(View v) {
        Intent gameIntent = new Intent(getboardtype());
        if (v.getId() == btnComputer.getId()) {
            gameIntent.putExtra("GameType", "Computer");
            startActivity(gameIntent);
        }
        if (v.getId() == btnHuman.getId()){
            gameIntent.putExtra("GameType", "Human");
            gameIntent.putExtra("firstplayer", player1.getSelectedItem().toString());
            if (player1.getSelectedItem().equals(player2.getSelectedItem())) {
                Toast.makeText(this, "You Can't Choose Samething", Toast.LENGTH_SHORT).show();
            } else {
                startActivity(gameIntent);
            }
        }
    }
}


