Feature: Comprar Productos

  @Products1
  Scenario Outline: Buscando productos por 'sebas'
    Given Sebas esta buscando producto
    When he ya encontro los "Products"
    Then he quiere ver los productos selccionados "Products"
    And he ingresa a completar la orden
    When he completa el formulario y finalizar la compra  "<name>" "<country>" "<city>" <card> "<month>" <year>

    Examples:
      | name   | country | city  | card      | month      |year |
      | Sebas  | Ecuador | Quito | 123456789 | septiembre |2023 |





