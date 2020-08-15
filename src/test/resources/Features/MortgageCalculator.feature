Feature: Mortgage Calculator 


@smoke

Scenario:

Given user is on tek school bank home page  
When user clicks on Apply for a Mortgage Loan 
And user enters $350000 Purchase Price  
And user selects 25 years Mortgage Term 				
And user puts 15000  Down Payment
And user chooses 3%  Annual Taxes
And user chooses 4% Interest Rate 	
And user chooses $400 for Annual Insurance and $50 Montly HOA
Then user should see the Monthly Payment, Principal & Interest, Monthly Taxes, Monthly HOA, Monthly Insurance
