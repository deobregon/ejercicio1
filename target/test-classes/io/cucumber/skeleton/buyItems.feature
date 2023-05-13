Feature: Test Shopping Cart

  Scenario: Adds 2 products
    Given Diana navigate to Homepage
    When she searches for "Samsung SyncMaster"
    When she adds the first result
    When she searches for "MacBook"
    When she adds the first result
    When she clicks the cart button
    When she verify the products are added
    When she go to guest checkout
    When she fills checkout form with "Diana", "Obregon", "diana@hotmail.com", "0987654321", "MARIA AUXILIADORA", "CUENCA", "010203", "Ecuador", "Azuay"
    When she click on continue button in the shipping information
    When she agrees terms and conditions
    When she confirms the order
    Then she validates confirmation message "Your order has been placed!"



