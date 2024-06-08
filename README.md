# Hafez

This Java GUI application is an example of using API or Application Programming Interface, which a set of rules that determines how one software program can access the data or functionality provided by another software program. APIs are an essential part of modern software development, allowing different systems and applications to communicate with each other and share functionality in a flexible and efficient way.

This application retrieves a poem and its interpretation from a third-party API (https://faal.spclashers.workers.dev/api) and displays it in a graphical user interface. It features a home page with a button to retrieve the poem, and a poem page with labels and text areas to display the poem and its interpretation. The user can navigate between pages using buttons. The API is used to fetch the poem and its interpretation, which are then parsed and displayed in the GUI.

Functionality:
1. When the application starts, it displays a home page with a label and a button.
2. When the user clicks the button, it sends a GET request to the specified URL (https://faal.spclashers.workers.dev/api) and retrieves a poem and its interpretation in JSON format.
3. The application then parses the JSON response using an ObjectMapper and creates a Faal object.
4. The poem and its interpretation are displayed on a new page with labels and text areas.
5. The user can navigate back to the home page by clicking the "بازگشت" (back) button.

