package dev.osmanthus.fleet.core.base.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

public class WebSocket {
    public static boolean send() {
        return true;
    }

    public static boolean broadcast() throws IOException {
        ConcurrentMap<String, WebSocketClient> connections = WebSocketContainer.getClients();

        for (String key : connections.keySet()) {
            WebSocketClient webSocketClient = connections.get(key);
            WebSocketSession webSocketSession = webSocketClient.getWebSocketSession();
            webSocketSession.sendMessage(new TextMessage(""));
        }

        return true;
    }
}
