package com.example.certamenn3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;
//A tener en cuenta:
// 1) Para pasar de un Activity a otro usar metodo: Intent "variable" = new Intent(parametros)
// 2) Para cargar un Spinner crear array de datos: String [] "variable" = {aqui ingresas los datos}
// 3) Luego deben crear un ArrayAdapter<String> adaptador = new ArrayAdapter<>(parametros)
// 4) Finalmente deben asignar el adaptador a su Spinner
// 5) Recuerden tambien que para pasar los datos de un activity a otro se utiliza el metodo Put.Extra()


public class MainActivity extends AppCompatActivity {
    private EditText Cproducto, Nproducto, Pproducto;
//xd pan con queso//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cproducto.findViewById(R.id.txtCodigoProducto);
        Nproducto.findViewById(R.id.txtNombreProducto);
        Pproducto.findViewById(R.id.txtPrecioProducto);
    }
    private void CargaProducto(){

    }

}