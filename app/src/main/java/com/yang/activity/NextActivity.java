package com.yang.activity;

import android.content.Intent;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yang.adapter.NextAdapter;
import com.yang.base.BaseActivity;
import com.yang.bean.SprkConfirmBean;
import com.yang.test.R;

import java.util.ArrayList;

/**
 * 创建日期: 2020/1/31 == 20:44
 * 描述:
 * 作者:HP
 */
public class NextActivity extends BaseActivity {
    private RecyclerView recyclerView;
    private ArrayList<SprkConfirmBean> mComfirmGoodsInfo;
    private NextAdapter adapter;

    @Override
    public int getLayoutID() {
        return R.layout.activity_next;
    }

    @Override
    public void initView() {
        super.initView();
        recyclerView = findViewById(R.id.rv_next);
    }

    @Override
    public void initData() {
        super.initData();
        Intent intent = getIntent();
        mComfirmGoodsInfo = intent.getParcelableArrayListExtra("confirm_goodsInfo");
        adapter = new NextAdapter(this);
//        adapter.setData(mComfirmGoodsInfo);
    }

    @Override
    public void initListener() {
        super.initListener();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
