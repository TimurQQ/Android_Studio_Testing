package ilyasov.my_first_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView messageText = (TextView) findViewById(R.id.messageText);
        boolean h = random.nextBoolean();
        String display_msg;
        if (h) {
            display_msg = "the 'h' is true!";
        }
        else   {
            display_msg = "the 'h' is not true!";
        }

        String names[] = {"Timur", "Vasia", "Vadim", "Kirill N", "Kirill", "Tanya", "Sergey"};
        int index = random.nextInt() % names.length;

        switch (names[index]) {
            case "Timur":
                display_msg += "\nCool man - " + "Timur";
                break;
            case "Vasia":
                display_msg += "\nInteresting man - " + "Vasia";
                break;
            case "Vadim":
                display_msg += "\nClever man - " + "Vadim";
                break;
            case "Kirill N":
                display_msg += "\nMysterious man - " + "Kirill N";
                break;
            case "Kirill":
                display_msg += "\nСrazy man - " + "Kirill";
                break;
            case "Tanya":
                display_msg += "\nPretty woman - " + "Tanya";
                break;
            case "Sergey":
                display_msg += "\nFormost man - " + "Sergey";
                break;
        }
        messageText.setText(display_msg);

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
        // Конецц
    }
}