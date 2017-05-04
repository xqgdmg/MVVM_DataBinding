package com.example.qhsj.myapplication.bean;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by qhsj on 2017/5/4.
 * 只有三个ObservableField变量，并且没有getter和setter，因为我们不需要getter和setter。
 */

public class People {
    public ObservableField<String> name = new ObservableField<>();
    public ObservableInt age = new ObservableInt();
    public ObservableBoolean isMan = new ObservableBoolean();
}
