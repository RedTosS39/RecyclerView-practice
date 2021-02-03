package android.example.recyclerview;

import android.widget.RelativeLayout;

public class RecyclerViewItem {
    private int imageResources;
    private String text1;
    private String text2;

    public RecyclerViewItem(int imageResources, String text1, String text2) {
        this.imageResources = imageResources;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getImageResources() {
        return imageResources;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
