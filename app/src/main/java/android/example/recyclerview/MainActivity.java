package android.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList <RecyclerViewItem> recyclerViewItemArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24, "Sad", "I'm so sad today"));
            recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_very_satisfied_24, "Happy", "What a wonderful life"));
            recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sick_24, "sick", "Oh no! I'm sick"));
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(recyclerViewItemArrayList);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}