package com.arepaexpress.pedidos.domain.port.out;

import com.arepaexpress.pedidos.domain.model.PedidoCreadoEvent;

public interface PedidoEventPublisher {
    void publicarPedidoCreado(PedidoCreadoEvent evento);
}

