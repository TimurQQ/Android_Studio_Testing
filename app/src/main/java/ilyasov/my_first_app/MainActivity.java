package ilyasov.my_first_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    byte a = 120;
    short b = 15700;
    int c = 453543543;
    long d = 8948924893289389485L;
    float e = 1.4523f;
    double f = 3.1415;
    char g = 'T';
    boolean h = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView messageText = (TextView) findViewById(R.id.messageText);
        String display_msg = String.join("\n",
                "byte: " + Byte.toString(a),
                "short: " + Short.toString(b),
                "int: " + Integer.toString(c),
                "long: " + Long.toString(d),
                "float: " + Float.toString(e),
                "double: " + Double.toString(f),
                "char: " + Character.toString(g),
                "boolean: " + Boolean.toString(h));
        messageText.setText(display_msg);
    }
}