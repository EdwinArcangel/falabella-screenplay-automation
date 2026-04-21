# language: es

Característica: Buscar producto en Falabella

  Antecedentes:
    Dado que el usuario abre la página de Falabella

  @BuscarProducto
  Escenario: Buscar una tarjeta gráfica y ver el detalle
    Cuando busca el producto "tarjeta grafica"
    Y selecciona el primer resultado de la búsqueda
    Entonces debería ver la página de detalle del producto


  @BusquedaFallida
  Escenario: Buscar un producto inexistente y validar mensaje de error
    Dado que el usuario abre la página de Falabella
    Cuando busca el producto "23232323232"
    Entonces debería ver el mensaje "Lo sentimos, no encontramos resultados"