package com.yang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yang.ForDouble;
import com.yang.bean.SprkConfirmBean;
import com.yang.test.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建日期: 2020/1/31 == 20:56
 * 描述:
 * 作者:HP
 */
public class NextAdapter extends RecyclerView.Adapter<NextAdapter.ViewHolder> {
    private Context context;
    private List<SprkConfirmBean> data;

    public NextAdapter(Context context) {
        this.context = context;
        data = new ArrayList<>();
    }

    @NonNull
    @Override
    public NextAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.next_item, parent, false);
        NextAdapter.ViewHolder holder = new NextAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NextAdapter.ViewHolder holder, int position) {
        SprkConfirmBean bean = data.get(position);
        holder.mTvCd.setText("生产地区: " + bean.getNcp_SCDQ());
        holder.mTvZl.setText("购买重量: " + ForDouble.doubletoString(bean.getNcp_ZL()) + "Kg");
        holder.mTvMc.setText("农产品名称: " + bean.getNcp_MC());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTvMc;
        private TextView mTvCd;
        private TextView mTvZl;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTvMc = itemView.findViewById(R.id.tv_next_mc);
            mTvCd = itemView.findViewById(R.id.tv_next_cd);
            mTvZl = itemView.findViewById(R.id.tv_next_zl);
        }
    }
}
