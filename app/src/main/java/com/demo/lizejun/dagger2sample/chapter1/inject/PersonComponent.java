package com.demo.lizejun.dagger2sample.chapter1.inject;

import com.demo.lizejun.dagger2sample.chapter1.InjectSimpleActivity;
import dagger.Component;

@Component(modules = {PersonModule.class, MobileModule.class})
public interface PersonComponent {
    void inject(InjectSimpleActivity activity); //这里必须要写成InjectSimpleActivity，而不是Activity，否则无法创建实例。
}
