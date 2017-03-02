package vn.com.phongnguyen93.week3fbdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import vn.com.phongnguyen93.week3fbdemo.R;
import vn.com.phongnguyen93.week3fbdemo.model.Message;

/**
 * Created by hongnhung on 02/03/2017.
 */

public class ChatListAdapter extends BaseAdapter {

    List<Message> mList;
    Context mContext;


    public void addItem(Message message) {
        mList.add(message);
        notifyDataSetChanged();
    }

    public ChatListAdapter(List<Message> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item, parent, false);
        TextView mTvId = (TextView) view.findViewById(R.id.tv_id);
        TextView mTvMessage = (TextView) view.findViewById(R.id.tv_message);
        TextView mTvTime = (TextView) view.findViewById(R.id.tv_time);

        Message message = mList.get(position);
        if (message != null) {

            mTvId.setText(message.getId());
            mTvMessage.setText(message.getMessage());
            mTvTime.setText(message.getTime().toString());
        } else {

        }

        return view;
    }
}
