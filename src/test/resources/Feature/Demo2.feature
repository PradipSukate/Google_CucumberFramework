Feature: Validation of email app journey

@TotalEmails
Scenario: To verify the total no. of emails received by the user
Given i am on gmail dashboard 
When i want to count total no of emails 
Then i have counted total no of emails 

@StarredEmails
Scenario: To verify the total no. of emails marked with STAR
Given i am on home page
When i want to count starred emails
Then i counted starred emails

@UnreadEmails
Scenario: To verify and count unread emails in an INBOX
Given i am on gmail home page
When i want to count total unread emails
Then i have counted total no of unread emails

@ReadEmails
Scenario: To verify and count the read emails in an INBOX
Given i am on gmail homepage
When i want to count total read emails
Then i have counted total no of read emails