package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MyAdapter mMyAdapter;
    private List<Dog> mDogList = new ArrayList<Dog>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDog();
        initView();

    }

    private void initDog() {
        mDogList.add(new Dog("dog1",R.drawable.dog1));
        mDogList.add(new Dog("dog2",R.drawable.dog2));
        mDogList.add(new Dog("dog3",R.drawable.dog3));
        mDogList.add(new Dog("dog4",R.drawable.dog4));
        mDogList.add(new Dog("dog5",R.drawable.dog5));
        mDogList.add(new Dog("dog6",R.drawable.dog6));
        mDogList.add(new Dog("dog7",R.drawable.dog7));
        mDogList.add(new Dog("dog8",R.drawable.dog8));
        mDogList.add(new Dog("dog9",R.drawable.dog9));
        mDogList.add(new Dog("dog10",R.drawable.dog10));
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.Myview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new MyAdapter(mDogList));
    }
}
