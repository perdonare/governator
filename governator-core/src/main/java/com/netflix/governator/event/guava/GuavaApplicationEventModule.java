package com.netflix.governator.event.guava;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;
import com.netflix.governator.event.ApplicationEventDispatcher;
import com.netflix.governator.event.ApplicationEventModule;

public class GuavaApplicationEventModule extends AbstractModule {    
    
    @Override
    protected void configure() {
        ApplicationEventDispatcher dispatcher = new GuavaApplicationEventDispatcher(new EventBus("Governator Application Event Bus"));
        ApplicationEventModule applicationEventModule = new ApplicationEventModule(dispatcher);
        install(applicationEventModule);        
    }

}
