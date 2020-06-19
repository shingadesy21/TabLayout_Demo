package com.example.tablayoutdemo.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tablayoutdemo.R;
import com.example.tablayoutdemo.fragment.Todays_Birthday;

import java.util.List;
import java.util.Random;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {
    private Todays_Birthday context;
    private List<CardViewData> cardViewData;

    public CardViewAdapter(Context context, List<CardViewData> cardViewData) {
        //this.context = context;
        this.cardViewData = cardViewData;
    }

    public CardViewAdapter(Todays_Birthday todaysBirthday, List<CardViewData> card_viewData_list) {
        this.context = todaysBirthday;
        this.cardViewData = card_viewData_list;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);

        return new CardViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewAdapter.ViewHolder holder, int position) {
        final CardViewData dataitems = cardViewData.get(position);
        holder.name.setText(dataitems.Name_of_user);
        holder.desc.setText(dataitems.Description);


        final int[] image_property = {R.drawable.cake1,R.drawable.cake2,R.drawable.cake3};
        final int img_random = new Random().nextInt(image_property.length);
        holder.img.setImageResource(image_property[img_random]);

//assigning random background gradient colors to card view
        final int[] color_property = {R.drawable.gradients_pink, R.drawable.gradients_red, R.drawable.gradients_blue, R.drawable.gradients_yellow,
                R.drawable.gradients_violet, R.drawable.gradients_green,R.drawable.gradients_orange,R.drawable.gradients_navy,
                R.drawable.gradients_medium_orchid};
        final int random = new Random().nextInt(color_property.length);

        holder.cardView.setBackgroundResource(color_property[random]);

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context.getApplicationContext(), color_property[random], Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return cardViewData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, desc;
        ImageView img;
        CardView cardView;
        Button button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.Name_txt);
            desc = itemView.findViewById(R.id.Desc_txt);
            img = itemView.findViewById(R.id.Image_img);
            cardView = itemView.findViewById(R.id.card_view);
            button = itemView.findViewById(R.id.btn);
        }
    }
}
