package tacom.numeros.primos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int primo = 0;

        for (int x = 0; x <= (x +1); x++) {
            for (int y = 1; y <= x; y++) {
                if (x % y == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                try {
                    Thread.sleep(3000L);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Número primo : " + primo);
            }
            primo = 0;
        }
    }
}