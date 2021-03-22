package ilyasov.my_first_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a = 10;
    int b = 20;
    int c = 0;
    boolean d = true;
    boolean e = false;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView messageText = (TextView) findViewById(R.id.messageText);

        String display_msg = String.join("\n",
                "Операторы сравнения: ",
                "a = " + a,
                "b = " + b,
                "a == b = " + (a == b),
                "a != b = " + (a != b),
                "a > b = " + (a > b),
                "a < b = " + (a < b),
                "b >= a = " + (b >= a),
                "b <= a = " + (b <= a),
                "Арифметические операторы",
                "c = a + b = " + (c = a + b),
                "a + b = " + (a + b),
                "a - b" + (a - b),
                "a * b = " + (a * b),
                "b / a = " + (b / a),
                "b % a = " + (b % a),
                "c += a = " + (c += a),
                "c -= a = " + (c -= a),
                "c *= a = " + (c *= a),
                "c /= a = " + (c /= a),
                "Булевы операции",
                "d = " + d,
                "e = " + e,
                "d | e = " + (d | e),
                "d & e = " + (d & e),
                "d ^ e = " + (d ^ e),
                "!d = " + (!d),
                "!e = " + (!e)
                );
        messageText.setText(display_msg);
    }
}