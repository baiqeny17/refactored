package simple.example.hewanpedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import simple.example.hewanpedia.model.AlasKaki;

public class DaftarAdapterActifity extends ArrayAdapter<AlasKaki> {
    Context context;

    public DaftarAdapterActifity (Context context, List<AlasKaki> alaskakis) {
        super(context , R.layout.row_daftarsendal, alaskakis);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textJenis;
        TextView textAsal;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AlasKaki alaskaki = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftarsendal, parent, false);
            viewHolder.textJenis =  convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textAsal = (TextView) convertView.findViewById(R.id.row_text_asal);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_hewan);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textJenis.setText(alaskaki.getJenis());
        viewHolder.textAsal.setText(alaskaki.getRas());
        viewHolder.gambar.setImageDrawable(context.getDrawable(alaskaki.getDrawableRes()));
        return convertView;
    }
}
