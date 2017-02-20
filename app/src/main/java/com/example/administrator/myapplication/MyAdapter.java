package com.example.administrator.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/2/20.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {
    private List<Dog> mDogs;

    public MyAdapter(List<Dog> mDogs) {
        this.mDogs = mDogs;
    }


    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        Holder holder = new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.mImag_dog.setImageResource(mDogs.get(position).imadID);
        holder.mTx_name.setText(mDogs.get(position).name);
    }

    @Override
    public int getItemCount() {
        return mDogs.size();
    }


    public class Holder extends RecyclerView.ViewHolder {
        ImageView mImag_dog;
        TextView mTx_name;

        public Holder(View itemView) {
            super(itemView);
            mTx_name =  (TextView) itemView.findViewById(R.id.tx_name);
            mImag_dog = (ImageView) itemView.findViewById(R.id.imag_dog);
        }
    }
}
