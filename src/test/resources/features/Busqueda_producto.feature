Feature: Hacer una busqueda en amazon de un producto

  Scenario Outline: Realizar busqueda de producto requerido
    Given la pagina de amazon a sido abierta
    When busca el nombre del <producto>
    Then aparecen los resultados

    Examples:
      | producto      |
      | El principito |


    Scenario: Filtra los resultados para encontrar el producto adecuado
      Given al seleccionar filtros


