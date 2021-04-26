
package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements RadioGroup.OnCheckedChangeListener {

    TextView txtNom, txtApp;
    EditText edtTxtNom, edtTxtApp;
    RadioGroup rdGrpIdioma;
    RadioButton rdBtnEs, rdBtnIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNom = findViewById(R.id.TxtNombre);
        txtApp = findViewById(R.id.txtApellido);
        edtTxtNom = findViewById(R.id.EdtTxtNombre);
        edtTxtApp = findViewById(R.id.edtTxtApellido);
        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdBtnEs = findViewById(R.id.rdGrpEs);
        rdBtnIn = findViewById(R.id.rdGrpIn);

        rdGrpIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        if(i == R.id.rdGrpEs){
            txtNom.setText(R.string.txt_Vw_nom);
            edtTxtNom.setHint(R.string.edt_txt_nom);
            txtApp.setText(R.string.txt_Vw_app);
            edtTxtApp.setHint(R.string.edt_txt_app);
            rdBtnEs.setText(R.string.rd_btn_es);
            rdBtnIn.setText(R.string.rd_btn_in);
        }else{
            txtNom.setText(R.string.txt_Vw_nom_en);
            edtTxtNom.setHint(R.string.edt_txt_nom_en);
            txtApp.setText(R.string.txt_Vw_app_en);
            edtTxtApp.setHint(R.string.edt_txt_app_en);
            rdBtnEs.setText(R.string.rd_btn_es_en);
            rdBtnIn.setText(R.string.rd_btn_in_en);
        }
    }
}