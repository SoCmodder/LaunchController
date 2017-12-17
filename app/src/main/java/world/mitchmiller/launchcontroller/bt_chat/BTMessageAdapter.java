package world.mitchmiller.launchcontroller.bt_chat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import world.mitchmiller.launchcontroller.R;

/**
 * Created by Mitch Miller on 12/17/2017.
 */

public class BTMessageAdapter extends RecyclerView.Adapter<BTMessageAdapter.MessageHolder> {

    List<String> messages = new ArrayList<>();
    Context context;

    public BTMessageAdapter(Context context, ArrayList<String> messages) {
        this.context = context;
        this.messages.addAll(messages);
    }

    @Override
    public MessageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.message_row, parent, false);
        return new MessageHolder(v);
    }

    @Override
    public void onBindViewHolder(MessageHolder holder, int position) {
        String message = messages.get(position);

        holder.messageText.setText(message);
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public static class MessageHolder extends RecyclerView.ViewHolder {

        TextView messageText;

        public MessageHolder(View itemView) {
            super(itemView);
        }
    }
}
