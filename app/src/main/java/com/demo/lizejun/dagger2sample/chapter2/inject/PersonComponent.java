package com.demo.lizejun.dagger2sample.chapter2.inject;

import com.demo.lizejun.dagger2sample.chapter2.ScopeActivity;
import com.demo.lizejun.dagger2sample.chapter2.app.AppComponent;

import dagger.Component;

@Component(dependencies = {AppComponent.class}, modules = {PersonModule.class, MobileModule.class})
@PerActivity
public interface PersonComponent {
    void inject(ScopeActivity activity); //这里必须要写成InjectSimpleActivity，而不是Activity，否则无法创建实例。
}
