package com.example.qhsj.myapplication;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.qhsj.myapplication.bean.MainViewModel;
import com.example.qhsj.myapplication.bean.ObservableUser;
import com.example.qhsj.myapplication.bean.People;
import com.example.qhsj.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mMainBinding;
    private MainViewModel mainViewModel;
    private ViewDataBinding viewDataBinding;
    private ObservableUser observableUser;
    private MainViewModel viewModel;
    private People people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         // 设置布局的方式，ActivityMainBinding 根据布局的名称 activity_main 加上 Binding
        mMainBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_main, null, false);
        setContentView(mMainBinding.getRoot());

        // viewmodel，静态显示
        viewModel = new MainViewModel("firstName","lastName");
        viewModel.firstName = "FirstName";
        mMainBinding.setBean1(viewModel); // 设置变量

         // 动态显示
        observableUser = new ObservableUser();
        observableUser.setFirstName("FirstName");
        mMainBinding.setBean2(observableUser); // 设置变量

         // 更简单的动态显示？
        people = new People();
        mMainBinding.setPeople(people);
        people.name.set("people1");  // 设置变量
        people.age.set(18);
        people.isMan.set(true);

         // 数据和逻辑的设置
//        viewModel.firstName = "aaa"; // 静态显示的这里设置数据UI也会更新

//        mMainBinding.setClick(this); // 设置点击事件,居然是点击所有地方都是可以的

    }

//    public void click(View view) {
//        observableUser.setFirstName("FirstName_Click");
//    }
}
