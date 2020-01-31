package com.yang.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yang.ForDouble;
import com.yang.adapter.ShowAdapter;
import com.yang.base.BaseActivity;
import com.yang.bean.SprkConfirmBean;
import com.yang.bean.SprkJjBean;
import com.yang.test.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建日期: 2020/1/31 == 19:40
 * 描述:
 * 作者:HP
 */
public class ShowActivity extends BaseActivity {
    private RecyclerView mRecyclerView;
    private TextView mTvNext;
    private ShowAdapter adapter;
    private List<SprkJjBean.DataBean> data;

    @Override
    public int getLayoutID() {
        return R.layout.activity_show;
    }

    @Override
    public void initView() {
        super.initView();
        mRecyclerView = findViewById(R.id.rv_show);
        mTvNext = findViewById(R.id.tv_next);
    }

    @Override
    public void initData() {
        super.initData();
        adapter = new ShowAdapter(ShowActivity.this);
    }

    @SuppressLint("WrongConstant")
    @Override
    public void initListener() {
        super.initListener();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setItemViewCacheSize(30);
        mRecyclerView.setAdapter(adapter);

        mTvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<SprkConfirmBean> mList = new ArrayList<>();
                for (int i = 0; i < data.size(); i++) {
//                    if (data.get(i).getZlLx() == 1) {
//                        continue;
//                    }
//                    if (data.get(i).getZlLx() == 2) {
//                        data.get(i).setNcp_buyWeight(ForDouble.doubletoString(ForDouble.mul(ForDouble.stringtoDouble(data.get(i).getNcp_buyWeight()), 1000)));
//                    }
                    if (data.get(i).getNcp_buyWeight() != null && ForDouble.stringtoDouble(data.get(i).getNcp_buyWeight()) > 0) {

                        SprkConfirmBean infoBean = new SprkConfirmBean();
                        infoBean.setNcp_MC(data.get(i).getNcp_MC());
                        infoBean.setNcp_SCDQ(data.get(i).getNcp_SCDQ());
                        infoBean.setNcp_kczl(data.get(i).getNcp_SYZL());
                        infoBean.setNcp_ZL(Double.parseDouble(ForDouble.stringtoString(data.get(i).getNcp_buyWeight())));
                        mList.add(infoBean);
                    }
                }

                Intent intent = new Intent(ShowActivity.this, NextActivity.class);
                intent.putParcelableArrayListExtra("confirm_goodsInfo", mList);
                startActivity(intent);
            }
        });
    }
}
