package dev.osmanthus.fleet.core.base.websocket;

import java.io.Serial;
import java.io.Serializable;

public class WebSocketMessage implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String content;
}
