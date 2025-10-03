package mx.edu.tesoem.isc.tsdmh_7s21_252_haea_p1t3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultadoActivity extends AppCompatActivity {

    TextView lblresp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resultado);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lblresp2 = findViewById(R.id.lblresp2);
        Bundle datos = getIntent().getExtras();
        if (datos.containsKey("suma")) {
            lblresp2.setText("El resultado de la suma es: " + datos.getString("suma"));
        } else if (datos.containsKey("resta")) {
            lblresp2.setText("El resultado de la resta es: " + datos.getString("resta"));
        } else if (datos.containsKey("div")) {
            lblresp2.setText("El resultado de la división es: " + datos.getString("div"));
        } else if (datos.containsKey("multi")) {
            lblresp2.setText("El resultado de la multiplicación es: " + datos.getString("multi"));
        } else if (datos.containsKey("potencia")){
            lblresp2.setText(("El resultado del primer numero es: " + datos.getString("potencia")+" y "+ datos.getString("potencia2")+ " Para el segundo numero"));
        }else if (datos.containsKey("potencian")){
            lblresp2.setText("El resultado para la potencia a la N del primer numero usando como exponente el segundo es: " + datos.getString("potencian"));
        }else if (datos.containsKey("raiz")){
            lblresp2.setText("La raiz del primer numero es: "+datos.getString("raiz")+" y la raiz del segundo numero es: " +datos.getString("raiz2"));
        }

    }
}