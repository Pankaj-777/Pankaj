Feature: Ebay Home Page Scanarios

@book
Scenario: Verify item can be added to Cart
Given I am on Ebay Home page
When I am search for 'book'
And Click on first book in the list
And Click on 'Add to cart'
Then Verify the cart has been updated and displays the number of items in the cart 