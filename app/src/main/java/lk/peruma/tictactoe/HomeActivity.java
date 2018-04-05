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
    Spinner boardtype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnComputer = (Button) findViewById(R.id.buttonComputer);
        btnHuman = (Button) findViewById(R.id.buttonHuman);
        boardtype=findViewById(R.id.boardSpinner);

        setTitle("TicTacToe - Select Game Type");
    }

    public String getboardtype(){
        String Activity;
        if (boardtype.getSelectedItem().toString().equalsIgnoreCase("3X3")){
            Activity="lk.peruma.tictactoe.GameActivity";
        }
        else
            Activity="lk.peruma.tictactoe.Game5X5";
        return Activity;
    }

    public void onClick(View v){
        Intent gameIntent = new Intent(getboardtype());
        if (v.getId() == btnComputer.getId())
            gameIntent.putExtra("GameType","Computer");
        if (v.getId() == btnHuman.getId())
            gameIntent.putExtra("GameType","Human");

        startActivity(gameIntent);
    }

}
