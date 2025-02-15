package dev.osmanthus.fleet.core.base.websocket;

import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.ConcurrentWebSocketSessionDecorator;

public class WebSocketClient {

    // 发送时间的限制，单位：毫秒
    private static final Integer SEND_TIME_LIMIT = 10 * 1000;
    // 发送消息缓冲上限，单位：bytes
    private static final Integer BUFFER_SIZE_LIMIT = 1 * 1024 * 1024;

    private final String id;
    private final WebSocketSession webSocketSession;

    public WebSocketClient(String id, WebSocketSession webSocketSession) {
        this.id = id;
        // 使用装饰器支持并发，可参考 https://blog.csdn.net/abu935009066/article/details/131218149
        this.webSocketSession = new ConcurrentWebSocketSessionDecorator(webSocketSession, SEND_TIME_LIMIT, BUFFER_SIZE_LIMIT);
    }

    public String getId() {
        return id;
    }

    public WebSocketSession getWebSocketSession() {
        return webSocketSession;
    }

}
