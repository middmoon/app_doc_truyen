package vn.edu.dlu.ctk45.appdoctruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] ten = new String[]{"Thám Tử Conan", "Mèo Máy Doremon", "Bảy Viên Ngọc Rồng","Đảo Hải Tặc"};
    int[] anh = new int[]{R.drawable.conan,R.drawable.doraemon,R.drawable.dragon_bal,R.drawable.one_piece};
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.gvDSTruyen);
        ArrayList<truyen> list = new ArrayList<truyen>();

        for (int i = 0; i < ten.length ; i++) {
            list.add(new truyen(ten[i], anh[i]));
        }

        grid.setAdapter(new TruyenAdapter(list));
    }
}