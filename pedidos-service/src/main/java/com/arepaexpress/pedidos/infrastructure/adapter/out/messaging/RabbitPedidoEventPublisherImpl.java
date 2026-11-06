package com.arepaexpress.pedidos.infrastructure.adapter.out.messaging;

import com.arepaexpress.pedidos.domain.model.PedidoCreadoEvent;
import com.arepaexpress.pedidos.domain.port.out.PedidoEventPublisher;
import com.arepaexpress.pedidos.infrastructure.config.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitPedidoEventPublisherImpl implements PedidoEventPublisher {

    private final RabbitTemplate rabbit;

    public RabbitPedidoEventPublisherImpl(RabbitTemplate rabbit) { this.rabbit = rabbit; }

    @Override
    public void publicarPedidoCreado(PedidoCreadoEvent evento) {
        rabbit.convertAndSend(RabbitConfig.EXCHANGE, "pedido.creado", evento);
    }
}

