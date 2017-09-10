package com.demo.lizejun.dagger2sample.chapter2.fragment;


import dagger.Subcomponent;

@Subcomponent(modules = {ScopeFragmentModule.class})
@PerScopeFragment
public interface ScopeFragmentComponent {
    public void inject(ScopeFragment scopeFragment);
}
