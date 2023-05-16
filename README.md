# linkSqueezer 👉🔗

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

A simple Java GUI application that shortens URLs. This app allows users to input a long URL and generates a shorter, more manageable URL that can be easily shared with others. The application implements a custom URL shortening algorithm and validates the entered URL to ensure that it is a valid URL before attempting to generate a shortened URL. Users can store the shortened URL by providing a user-defined alias or keyword. The original and shortened URLs are stored in a local database file DB.csv.

## Table of Contents 📜

- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Files

Overall, this directory tree gives an overview of the organization and structure of the project's files and directories.

```
C:\USERS\BLACKROSE\DESKTOP\LINKSQUEEZER
├── .gitignore
├── build.xml
├── DB.csv
├── manifest.mf
├── README.md
├── SRS.md
├── dist
│   ├── DB.csv
│   ├── LinkSqueezer.jar
│   └── README.TXT
└── src
    ├── GUI
    │   ├── AboutFrame.form
    │   ├── AboutFrame.java
    │   ├── MainFrame.form
    │   └── MainFrame.java
    └── linksqueezer
        ├── Link.java
        ├── LinkSqueezer.java
        ├── LinkStorage.java
        └── Main.java
```
Here's a brief description of each file : 

1. `README.md`: This file is typically used as the main documentation file for a GitHub repository. It contains information about the project, its purpose, features, and how to use it. It may also contain instructions for contributing to the project or running it locally.

2. `SRS.md`: This file is a Software Requirements Specification document. It outlines the functional and non-functional requirements for the project, as well as any constraints or dependencies that need to be considered during development.

3. `DB.csv`: This file is a database file used by the LinkSqueezer project. It likely contains data related to links that have been saved or compressed using the LinkSqueezer software.

4. `Main.java`: This file is the main driver class for the LinkSqueezer project. It likely contains the `main` method, which is the entry point for the application. It may also contain other methods and classes used to initialize the application and manage user input/output.

5. `LinkSqueezer.jar`: This file is the executable JAR file for the LinkSqueezer project. It is typically exported from an IDE and can be run on any system with Java installed. It contains all of the compiled Java code necessary to run the application, as well as any dependencies required by the project. 

Overall, these files represent the core components of the LinkSqueezer project, including its documentation, requirements, code, and data files.

## Installation 🛠️

To install and run the app on your local machine, follow these steps:

1. Clone the repository:

```sh
git clone https://github.com/your_username/URL-Shortener-App.git
```

2. Open the project in your preferred IDE (Integrated Development Environment).
3. Run the `URLShortenerApp.java` file located in the `src/main/java` directory.

## Usage 🚀

1. Enter the long URL in the input field provided.
2. Click the "Shorten" button to generate a shortened URL.
3. If desired, enter a user-defined alias or keyword in the input field provided to customize the shortened URL.
4. Click the "Shorten" button again to generate the customized shortened URL.
5. The shortened URL will be displayed in the output field below the input fields.
6. To retrieve the original URL, enter the shortened URL or the user-defined alias in the input field provided and click the "Retrieve" button.

## Contributing 🤝

Contributions, issues, and feature requests are welcome! Feel free to check out the [issues page](https://github.com/your_username/URL-Shortener-App/issues) to see if your suggestion has already been made. If you have found a bug or have a feature request, please [open a new issue](https://github.com/your_username/URL-Shortener-App/issues/new).

## License 📝

This project is licensed under the [MIT](https://opensource.org/licenses/MIT) license.

---

Screenshots or gifs of the app in action can be added here.

Made with ❤️ by [Hussain Ashiq Khattak](https://github.com/hussainashiqktk).
