package android.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.RecyclerViewHolder> {

    private ArrayList<RecyclerViewItem> arrayList;

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }
    // Передаем параметры
    public RecyclerViewAdapter(ArrayList<RecyclerViewItem> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        RecyclerViewItem recyclerViewItem = arrayList.get(position);
        holder.imageView.setImageResource(recyclerViewItem.getImageResources());
        holder.textView1.setText(recyclerViewItem.getText1());
        holder.textView2.setText(recyclerViewItem.getText2());
    }

    //Тут мы должны вернуть количество элементов, которое содержится в ArrayList
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
