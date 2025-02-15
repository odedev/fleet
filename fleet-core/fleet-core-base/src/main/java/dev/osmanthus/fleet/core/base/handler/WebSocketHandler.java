package dev.osmanthus.fleet.core.base.handler;

import com.google.gson.Gson;
import dev.osmanthus.fleet.core.base.websocket.WebSocketClient;
import dev.osmanthus.fleet.core.base.websocket.WebSocketContainer;
import dev.osmanthus.fleet.core.base.websocket.WebSocketMessage;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Objects;

public class WebSocketHandler extends TextWebSocketHandler {


    @Override
    public void afterConnectionEstablished(@NotNull WebSocketSession session) throws Exception {
        super.afterConnectionEstablished(session);
        WebSocketContainer.add(new WebSocketClient(session.getId(), session));
    }

    @Override
    public void afterConnectionClosed(@NotNull WebSocketSession session, @NotNull CloseStatus status) throws Exception {
        super.afterConnectionClosed(session, status);
        WebSocketContainer.remove(session.getId());
    }

    @Override
    protected void handleBinaryMessage(@NotNull WebSocketSession session, @NotNull BinaryMessage message) {
        super.handleBinaryMessage(session, message);
    }

    @Override
    protected void handleTextMessage(@NotNull WebSocketSession session, @NotNull TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
        String payload = message.getPayload();
        int payloadLength = message.getPayloadLength();

        // 空消息
        if (payloadLength == 0) {
            return;
        }

        // 心跳检测消息
        if (payloadLength == 4 && Objects.equals(payload, "ping")) {
            session.sendMessage(new TextMessage("pong"));
            return;
        }

        try {
            Gson gson = new Gson();
            WebSocketMessage webSocketMessage = gson.fromJson(payload, WebSocketMessage.class);

            if (webSocketMessage == null) {
                return;
            }

            session.sendMessage(message);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void handlePongMessage(@NotNull WebSocketSession session, @NotNull PongMessage message) throws Exception {
        super.handlePongMessage(session, message);
    }
}
