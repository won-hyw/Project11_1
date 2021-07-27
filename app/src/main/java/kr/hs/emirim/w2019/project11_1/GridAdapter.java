package kr.hs.emirim.w2019.project11_1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.poster01, R.drawable.poster02, R.drawable.poster03, R.drawable.poster04, R.drawable.poster05,
                       R.drawable.poster06, R.drawable.poster07, R.drawable.poster08, R.drawable.poster09, R.drawable.poster10,
                       R.drawable.poster01, R.drawable.poster02, R.drawable.poster03, R.drawable.poster04, R.drawable.poster05,
                       R.drawable.poster06, R.drawable.poster07, R.drawable.poster08, R.drawable.poster09, R.drawable.poster10};

    public GridAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5, 5, 5, 5);
        imgv.setImageResource(posterIds[i]);
        return imgv;
    }

}
