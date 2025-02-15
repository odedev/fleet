package dev.osmanthus.fleet.core.base.websocket;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class WebSocketContainer {
    private static final ConcurrentMap<String, WebSocketClient> clients = new ConcurrentHashMap<>();
    private static final ConcurrentMap<String, Set<String>> topics = new ConcurrentHashMap<>();
    private static final ConcurrentMap<String, Set<String>> channels = new ConcurrentHashMap<>();


    public static void add(WebSocketClient webSocketClient) {
        clients.put(webSocketClient.getId(), webSocketClient);
    }

    public static WebSocketClient get(String id) {
        return clients.get(id);
    }

    public static void remove(String id) {
        clients.remove(id);
    }

    public static ConcurrentMap<String, WebSocketClient> getClients() {
        return clients;
    }

}
