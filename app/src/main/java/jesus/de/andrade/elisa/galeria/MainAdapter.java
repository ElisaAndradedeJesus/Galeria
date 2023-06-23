package jesus.de.andrade.elisa.galeria;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import jesus.de.andrade.elisa.galeria.R;
import jesus.de.andrade.elisa.galeria.MainActivity;

public class MainAdapter extends RecyclerView.Adapter {
    MainActivity mainActivity;
    List<String> photos;
    
    public MainAdapter(MainActivity mainActivity, List<String> photos){
        this.mainActivity = mainActivity;
        this.photos = photos;
    }

    @NonNull
    @Override
    public void onCreateViewHolder(@NonNull RecyclerView.viewHolder holder, final int position) {
        ImageView imPhoto = holder.itemView.findViewById(R.id.imItem);
        int w = (int)mainActivity.getResources().getDimension(R.dimen.itemWidth);
        int h = (int)mainActivity.getResources().getDimension(R.dimen.itemHeight);
        Bitmap bitmap = Utils.getBitmap(photos.get(position),w,h);
        imPhoto.setImageBitmap(bitmap);
        imPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.startPhotoActivity(photos.get(position));

            }
        });
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
