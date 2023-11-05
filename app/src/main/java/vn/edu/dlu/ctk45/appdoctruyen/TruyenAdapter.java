package vn.edu.dlu.ctk45.appdoctruyen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TruyenAdapter extends BaseAdapter {
    ArrayList<truyen> list;
    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(200, 200);
    public TruyenAdapter(ArrayList<truyen> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view = View.inflate(viewGroup.getContext(), R.layout.item_truyen, null);

        truyen truyen = (truyen)getItem(i);

        ImageView avt = (ImageView)view.findViewById(R.id.avtTruyen);
        //avt.setLayoutParams(layoutParams);
        avt.setImageResource(truyen.anh);
        avt.setScaleType(ImageView.ScaleType.FIT_CENTER);

        TextView title = (TextView)view.findViewById(R.id.titleTruyen);
        title.setText(truyen.ten);
        return view;

//        View view = View.inflate(viewGroup.getContext(), R.layout.item_truyen, null);
//
//        truyen truyen = (truyen)getItem(i);
//
//        ImageView avt = (ImageView)view.findViewById(R.id.avtTruyen);
//    **avt.setLayoutParams(layoutParams);**
//        avt.setImageResource(truyen.anh);
//
//        TextView title = (TextView)view.findViewById(R.id.titleTruyen);
//        title.setText(truyen.ten);
//
//        return view;
    }
}
