Feature: Add functionality to cart

  Scenario: items to cart
		 Given application url
		 When Enter username and password
		 And click login
		 When click on  today deals
		 And  add one item to cart
		 Then Verify cart items
		 
		 