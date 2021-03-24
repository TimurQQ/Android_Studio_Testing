package ilyasov.my_first_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int a = 10;
    int b = 20;
    int c = 0;
    boolean d = true;

    boolean e = false;
    Random random = new Random();

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView messageText = (TextView) findViewById(R.id.messageText);

        String display_msg1 = String.join("\n",
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
        boolean h = random.nextBoolean();
        String display_msg2;
        if (h) {
            display_msg2 = "the 'h' is true!";
        }
        else   {
            display_msg2 = "the 'h' is not true!";
        }

        String names[] = {"Timur", "Vasia", "Vadim", "Kirill N", "Kirill", "Tanya", "Sergey"};
        int index = random.nextInt() % names.length;

        switch (names[index]) {
            case "Timur":
                display_msg2 += "\nCool man - " + "Timur";
                break;
            case "Vasia":
                display_msg2 += "\nInteresting man - " + "Vasia";
                break;
            case "Vadim":
                display_msg2 += "\nClever man - " + "Vadim";
                break;
            case "Kirill N":
                display_msg2 += "\nMysterious man - " + "Kirill N";
                break;
            case "Kirill":
                display_msg2 += "\nСrazy man - " + "Kirill";
                break;
            case "Tanya":
                display_msg2 += "\nPretty woman - " + "Tanya";
                break;
            case "Sergey":
                display_msg2 += "\nFormost man - " + "Sergey";
                break;
        }
        messageText.setText(display_msg1 + display_msg2);

        // ДЗ Слайд 107
        int month = 3;
        String season;
        switch (month) {
            case 1: case 2: case 12:
                season = "Зимушка-зима";
                break;
            case 3: case 4: case 5:
                season = "Весна";
                break;
            case 6: case 7: case 8:
                season = "Лето";
                break;
            case 9: case 10: case 11:
                season = "Осень";
                break;
            default:
                season = "Не знаю";
                break;
        }
        //Circles
        for (int i = 0; i< 10; ++i) {
            Log.d("FOR", Integer.toString(i));
        }
        int i = 0;
        while(i < 10) {
            Log.d("WHILE", Integer.toString(i));
            ++i;
        }
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j : a) {
            Log.d("FOR_EACH", Integer.toString(j));
        }
        i = 0;
        do {
            Log.d("DO_WHILE", Integer.toString(i));
            ++i;
        } while(i < 10);
        // Конецц
    }
}