package com.arepaexpress.pedidos.domain.port.in;

import com.arepaexpress.pedidos.domain.model.CrearPedidoRequest;

public interface CrearPedidoUseCase {
    String crear(CrearPedidoRequest pedido);
}

