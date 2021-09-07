package codercamp.com.bd_tv_live_streaming.Adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import codercamp.com.bd_tv_live_streaming.DetailsActivity;
import codercamp.com.bd_tv_live_streaming.Model.ModelView;
import codercamp.com.bd_tv_live_streaming.OnItemClick;
import codercamp.com.bd_tv_live_streaming.R;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder>{

    private List<ModelView> mDataSet;
    private  Context context;

    public RecyclerviewAdapter(List<ModelView> mDataSet, Context context) {
        this.mDataSet = mDataSet;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {

        ModelView modelView = mDataSet.get(position);

        holder.ChannelImage.setImageResource(modelView.getChannelImage());
        holder.ChannelName.setText(modelView.getChannelName());



        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    String btvworld = "https://rhridoy136.shortcm.li/btvworld.m3u8";//https://rhridoy136.shortcm.li/btvworld.m3u8
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(btvworld));
                    v.getContext().startActivity(intent);//1
                } else if (position == 1) {
                    String shomoytv = "https://rhridoy136.shortcm.li/shomoytv.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(shomoytv));
                    v.getContext().startActivity(intent);//2
                } else if (position == 2) {
                    String jamunatv = "https://rhridoy136.shortcm.li/jamunatv.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(jamunatv));
                    v.getContext().startActivity(intent);//3
                } else if (position == 3) {
                    String atnislamic = "https://rhridoy136.shortcm.li/atnislamic.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(atnislamic));
                    v.getContext().startActivity(intent);//4
                } else if (position == 4) {
                    String atnnews = "https://rhridoy136.shortcm.li/atnnews.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(atnnews));
                    v.getContext().startActivity(intent);//5
                } else if (position == 5) {
                    String Boishakhi = "https://rhridoy136.shortcm.li/boishakhitv.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(Boishakhi));
                    v.getContext().startActivity(intent);//6
                } else if (position == 6) {
                    String channel24 = "https://rhridoy136.shortcm.li/channel24.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(channel24));
                    v.getContext().startActivity(intent);//7
                } else if (position == 7) {
                    String channel9 = "https://rhridoy136.shortcm.li/channel9.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(channel9));
                    v.getContext().startActivity(intent);//8
                } else if (position == 8) {
                    String channeli = "https://rhridoy136.shortcm.li/channeli.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(channeli));
                    v.getContext().startActivity(intent);//9
                } else if (position == 9) {
                    String dbcnews = "https://rhridoy136.shortcm.li/dbcnews.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(dbcnews));
                    v.getContext().startActivity(intent);//10
                } else if (position == 10) {
                    String deshtv = "https://rhridoy136.shortcm.li/deshtv.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(deshtv));
                    v.getContext().startActivity(intent);//11
                } else if (position == 11) {
                    String Ekattor = "http://ctgiptv.kitv.live:1935/live/ASNet/asnetwork/11.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(Ekattor));
                    v.getContext().startActivity(intent);//12
                } else if (position == 12) {
                    String independenttv = "https://rhridoy136.shortcm.li/independenttv.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(independenttv));
                    v.getContext().startActivity(intent);//13
                } else if (position == 13) {
                    String mohonatv = "https://rhridoy136.shortcm.li/mohonatv.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mohonatv));
                    v.getContext().startActivity(intent);//14
                } else if (position == 14) {
                    String mytv = "https://rhridoy136.shortcm.li/mytv.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mytv));
                    v.getContext().startActivity(intent);//15
                } else if (position == 15) {
                    String news24 = "https://rhridoy136.shortcm.li/news24.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(news24));
                    v.getContext().startActivity(intent);//16
                } else if (position == 16) {
                    String satv = "https://rhridoy136.shortcm.li/satv.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(satv));
                    v.getContext().startActivity(intent);//17
                } else if (position == 17) {
                    String rtv = "https://rhridoy136.shortcm.li/rtv.m3u8";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(rtv));
                    v.getContext().startActivity(intent);//18
                }
                else if (position==18){
                    String  Boishakhi ="https://rhridoy136.shortcm.li/boishakhitv.m3u8";
                    Intent intent = new Intent( Intent.ACTION_VIEW,Uri.parse(Boishakhi));
                    v.getContext().startActivity(intent);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView ChannelImage;
        TextView ChannelName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ChannelImage = itemView.findViewById(R.id.ChannelImageId);
            ChannelName = itemView.findViewById(R.id.ChannelNameId);

            cardView = itemView.findViewById(R.id.card);


        }


    }

}
