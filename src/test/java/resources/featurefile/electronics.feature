Feature: Electronics Test
  As a user I can navigate the product and place the order successfully

  @sanity @regression
  Scenario: User should navigate to cell phones page successfully
    Given I am on homepage
    When I can mouse hover on electronics tab
    And I can mouse hover on cell phones and click
    Then I can verify the text "Cell phones"

  @smoke @regression
  Scenario: USer can add the product and place the order successfully
    Given I am on homepage
    When I can mouse hover on electronics tab
    And I can mouse hover on cell phones and click
    And I can verify the text "Cell phones"
    And I should click on list view tab
    And I should click on nokia lumia product
    And Verify the text "Nokia Lumia 1020"
    And I should verify the price "$349.00"
    And I should change the quantity to 2
    And I should click on add to cart tab
    And I should Verify the Message "The product has been added to your shopping cart" on Top green Bar
    And I should click on close button
    And I should mouse hover on shopping cart and click on go to cart button
    And I should verify msg "Shopping cart"
    And I should verify the quantity 2
    And I should verify total "$698.00"
    And I should click on the checkbox of agree terms of service
    And I should click on the checkout
    And I should verify text "Welcome, Please Sign In!"
    And I should click on register tab
    And I should verify "Register"
    And I should able to fill all mandatory fields
    And I should click on register button
    And Verify message "Your registration completed"
    And I should click on continue tab
    And I should Verify visible text "Shopping cart"
    And Click on the check box
    And click on checkout
    And I should able to fill all delivery address mandatory field
    And Click continue
    And Click on the air radio button
    And click continue button
    And I should select credit card radio button
    And I should click continue
    And I should select visa from select credit card drop down
    And I should able to fill mandatory field of checkout
    And continue button click
    And I should verify the payment method is "Credit Card"
    And I should able to verify the shipping method is "2nd Day Air"
    And I should able to verify the total is "$698.00"
    And I should click on the confirm button
    And I should verify the text "Thank you"
    And I should verify the message "Your order has been successfully processed!"
    And I should able to click on to the continue button
    And I should able to verify the text "Welcome to our store"
    And I should click on the logout link
    Then I should verify the URL





