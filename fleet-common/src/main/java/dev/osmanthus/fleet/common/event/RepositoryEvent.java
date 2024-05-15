package dev.osmanthus.fleet.common.event;

import org.springframework.context.ApplicationEvent;

public class RepositoryEvent extends ApplicationEvent {
    public RepositoryEvent(Object source) {
        super(source);
    }
}
