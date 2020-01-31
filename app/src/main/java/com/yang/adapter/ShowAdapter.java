package com.yang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yang.ForDouble;
import com.yang.bean.SprkJjBean;
import com.yang.test.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建日期: 2020/1/31 == 19:54
 * 描述:
 * 作者:HP
 */
public class ShowAdapter extends RecyclerView.Adapter<ShowAdapter.ViewHolder> {
    private Context context;
    private String[] mItems;
    private ArrayAdapter<String> arrayAdapter;
//    private List<SprkJjBean.DataBean> data;

    public ShowAdapter(Context context) {
        this.context = context;
//        data = new ArrayList<>();
        mItems = context.getResources().getStringArray(R.array.zldw);
        arrayAdapter = new ArrayAdapter<>(context, android.R.layout.simple_spinner_item, mItems);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }

    @NonNull
    @Override
    public ShowAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_item, parent, false);
        ShowAdapter.ViewHolder holder = new ShowAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ShowAdapter.ViewHolder holder, int position) {
//        SprkJjBean.DataBean bean = data.get(position);
//        holder.location.setText("生产地区: " + bean.getNcp_SCDQ());
//        holder.weight.setText("剩余: " + ForDouble.doubletoString(bean.getNcp_SYZL()) + "Kg");
//        holder.name.setText("农产品名称: " + bean.getNcp_MC());
        holder.setIsRecyclable(true);
        holder.spinner.setAdapter(arrayAdapter);
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView location;
        private TextView weight;
        private EditText etCount;
        private Spinner spinner;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            etCount = itemView.findViewById(R.id.et_sprk_count);
            name = itemView.findViewById(R.id.tv_sprk_mc);
            location = itemView.findViewById(R.id.tv_sprk_cd);
            weight = itemView.findViewById(R.id.tv_sprk_zl);
            spinner = itemView.findViewById(R.id.spinner1);
        }
    }
}
