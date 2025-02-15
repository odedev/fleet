package dev.osmanthus.fleet.core.base.config;

import dev.osmanthus.fleet.core.base.handler.WebSocketHandler;
import dev.osmanthus.fleet.core.base.interceptor.WebSocketInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@EnableWebSocket
@Configuration
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry
            .addHandler(new WebSocketHandler(), "/websocket")
            .addInterceptors(new WebSocketInterceptor())
            .setAllowedOrigins();

        registry
            .addHandler(new WebSocketHandler(), "/sockjs")
            .setAllowedOrigins()
            .withSockJS();
    }
}
