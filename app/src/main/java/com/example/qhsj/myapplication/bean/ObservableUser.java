package com.example.qhsj.myapplication.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.qhsj.myapplication.BR;

/**
 * Created by qhsj on 2017/5/4.
 */

public class ObservableUser extends BaseObservable {
    private String firstName;
    private String lastName;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName); // 一定要写到布局里面才会有生成的 BR，所以要先写 xml
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
