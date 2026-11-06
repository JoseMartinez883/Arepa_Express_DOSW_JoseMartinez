package com.arepaexpress.pedidos.application.usecase;

import com.arepaexpress.pedidos.domain.model.CrearPedidoRequest;
import com.arepaexpress.pedidos.domain.model.PedidoCreadoEvent;
import com.arepaexpress.pedidos.domain.port.in.CrearPedidoUseCase;
import com.arepaexpress.pedidos.domain.port.out.PedidoEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class CrearPedidoUseCaseImpl implements CrearPedidoUseCase {

    private final PedidoEventPublisher publisher;

    public CrearPedidoUseCaseImpl(PedidoEventPublisher publisher) { this.publisher = publisher; }

    @Override
    public String crear(CrearPedidoRequest pedido) {
        String id = UUID.randomUUID().toString().substring(0, 8);
        publisher.publicarPedidoCreado(new PedidoCreadoEvent(
                id, pedido.cliente(), pedido.arepas(), LocalDateTime.now().toString()));
        return id;
    }
}
