# Username Generator

This Java project generates usernames and checks the validity of account usernames based on specific criteria. The project consists of two main classes: `UsernameGenerator` and `UsernameGeneratorApp`. The application allows users to either generate usernames or validate existing account usernames.

## Project Structure

- **UsernameGenerator.java**: Contains the logic for generating usernames based on a user's name. It also includes a method to validate account usernames based on given rules.
- **UsernameGeneratorApp.java**: Provides a console-based interface where users can choose between generating usernames or checking the validity of usernames.

## Features

### 1. Generate Username
- **Input**: User's full name (first and last).
- **Output**: A username created by combining the initials of the first and last name, removing vowels, and adding a count of vowels in the original name.
- **Example**:
    - Input: `John Doe`
    - Output: `JDJhn%D?2`

### 2. Check Account Validity
- **Input**: A list of account usernames.
- **Output**: A boolean array indicating whether each username is valid.
- **Validity Criteria**:
    - Username must start with `@`.
    - Length must be between 5 and 16 characters.
    - It can contain letters, numbers, and underscores (`_`), but not periods (`.`).

## How to Use

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/YOUR_USERNAME/username-generator.git
    ```
2. **Compile the Java Files**:
    ```bash
    javac UsernameGenerator.java UsernameGeneratorApp.java
    ```
3. **Run the Application**:
    ```bash
    java UsernameGeneratorApp
    ```

4. **Select an Option**:
    - `1`: Generate a username.
    - `2`: Validate account usernames.

### Example Usage

1. **Generate Username**:
    ```
    Please select the service you need: 
    1. Generate username 
    2. Check the validity of the account
    > 1
    Please enter the number of usernames required:
    > 1
    Please enter 1 user names:
    > John Doe
    Output: JDJhn%D?2
    ```

2. **Check Account Validity**:
    ```
    Please select the service you need: 
    1. Generate username 
    2. Check the validity of the account
    > 2
    Please enter the number of handle/usernames you want to verify:
    > 2
    Please enter 1 handle/usernames:
    > @john_doe
    Please enter 2 handle/usernames:
    > @jane.doe
    Output: true
    Output: false
    ```

## Technologies Used

- **Java**: Object-oriented programming language used to implement the functionality.

## License

This project is licensed under the MIT License.
