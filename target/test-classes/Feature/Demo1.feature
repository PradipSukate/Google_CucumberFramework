Feature: Validation of email journey

@Email
Scenario: verify user is able to send email successfully
Given user is on gmail dashboard page
When user try to send email
Then user should see sent email in sent option 

@Search
Scenario: To verify the search operation i.e search the emails received from specific email address from INBOX
Given user is already on dashboard page
When user search about specific mail address 
Then user should see all emails respective to specific mail address

@Attachments
Scenario: To verify the emails which are with attachments in INBOX
Given user is on gmail home page
When user search mail with attachments
Then user should see all emails with attachments

@Settings
Scenario: To verify that Settings page is displayed properly
Given user is on homepage
When user want to see setting page
Then user is able to see setting page

@Label
Scenario: To verify that the new label is properly created 
Given user is on home page
When user creates new label 
Then user should see new label created

@MoveMailToNewLabel
Scenario: To verify that emails are moved from source label to target label (Folders)
Given user is on dashboard page
When user want to send specific mail to target label folder
Then user should see mail moved to target label folder

@SignOut
Scenario: To verify that the user can successfully Sign-out from Gmail
Given i am on gmail dashboard page
When i want to sign out gmail 
Then i have signed out gmail 