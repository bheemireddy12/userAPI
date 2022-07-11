Programming Task I:

TypeScript | Node.js | Mongo | User Onboarding - Implement login and registration of users with phone number as unique.  Implement endpoints to fetch the list of users (with a phase matching and results limiting), fetch details of a single user and to delete the given user.

Data points to capture: First Name, Last Name, email, mobile

All fields are mandatory
Phone is unique

APIs

GET - Get a list of all users (should be by partial text(name or phone). Ex: 9848 should list 9848032919 and also 7869848786. Same applies for names and email)
GET - Get user by phone number
POST - Insert a new user
PUT - Update a user (restrict updating phone number)
DELETE - Delete a user
Functionalities
Email, Password and Phone number validation
Verify user via email (link generation and mapping with user is alone enough)
JWT for user authentication

Test Cases:
Add Unit testing for all required functionalities.
