# Hafez
This Java GUI application retrieves a poem and its interpretation from a URL and displays it in a graphical user interface. It features a home page with a button to retrieve the poem, and a poem page with labels and text areas to display the poem and its interpretation. The user can navigate between pages using buttons.

Functionality:
1. When the application starts, it displays a home page with a label and a button.
2. When the user clicks the button, it sends a GET request to the specified URL (https://faal.spclashers.workers.dev/api) and retrieves a poem and its interpretation in JSON format.
3. The application then parses the JSON response using an ObjectMapper and creates a Faal object.
4. The poem and its interpretation are displayed on a new page with labels and text areas.
5. The user can navigate back to the home page by clicking the "بازگشت" (back) button.

