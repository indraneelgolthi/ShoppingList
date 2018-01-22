package thatbiriyaniguy.shoppinglist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Neel on 1/22/18.
 */

public class InactiveItemsViewholder extends RecyclerView.ViewHolder {

    CheckBox item_status;
    TextView item_name;
    ImageView item_action;

    public InactiveItemsViewholder(View itemView, CheckBox item_status, TextView item_name, ImageView item_action) {
        super(itemView);
        this.item_status = item_status;
        this.item_name = item_name;
        this.item_action = item_action;
    }
}

