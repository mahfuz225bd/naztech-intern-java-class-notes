## Make a Simple Todo App with Single Input

#### Without Form Submit

simple_todo_without_submit.html:

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>A Simple Todo App</title>
  </head>

  <style>
    main {
      /* To show both <section> element side by side */
      display: flex;
      justify-content: center;
    }
  </style>

  <body>
    <main>
      <section>
        <h3>Input a Todo</h3>
        <form action="">
          <input title="Input a Todo" type="text" name="todo" id="todo" />
          <button type="button" id="addTodo">Add</button>
        </form>
      </section>
      <section>
        <h3>Get All Todos</h3>
        <ul id="allTodos"></ul>
      </section>
    </main>

    <script>
      window.addEventListener("DOMContentLoaded", () => {
        const inputTodo = document.querySelector("#todo");
        const btnAddTodo = document.querySelector("#addTodo");
        const allTodos = document.querySelector("#allTodos");

        // if #addTodo clicked
        btnAddTodo.addEventListener("click", () => {
          // Get todo value to `todoValue`
          const todoValue = inputTodo.value;

          // Add new li item to ul#allTodos
          allTodos.innerHTML += `<li>${todoValue}</li>`;

          // Make empty value of #inputTodo
          inputTodo.value = "";
        });
      });
    </script>
  </body>
</html>
```

#### Using Form Submit

##### Why Should Use Form Submit

##### How to Use Form Submit to Previous Todo Project

You should some changes to the code:

- Give a id to the todo form. For the example, I given, id="todoForm"
- Change button type `button` to `submit` to button#addTodo. It should be like bellow:

```html
<button type="submit" id="addTodo">Add</button>
```

- In the javascript part, take a variable as `todoForm` to get form#todoForm element
- **Remove** those lines of code:

```javascript
// if #addTodo clicked
btnAddTodo.addEventListener("click", () => {
  // Get todo value to `todoValue`
  const todoValue = inputTodo.value;

  // Add new li item to ul#allTodos
  allTodos.innerHTML += `<li>${todoValue}</li>`;

  // Make empty value of #inputTodo
  inputTodo.value = "";
});
```

- **Add** those lines of code instead of removed lines of code:

```javascript
// When the todoForm is submitted
todoForm.addEventListener("submit", (e) => {
  // Prevent the default form submission behavior
  e.preventDefault();

  // Create a FormData object from the submitted form
  const formData = new FormData(e.target);

  // Convert the FormData object to a simple key-value object
  const formFieldValues = Object.fromEntries(formData);

  // Get the value of the 'todo' field
  const todoValue = formFieldValues["todo"];

  // Add the todoValue to the list of allTodos
  allTodos.innerHTML += `<li>${todoValue}</li>`;

  // Reset the form after submission
  e.target.reset();
});
```

- Remove unnecessary lines of code, if exists. In this new code `btnAddTodo` is totally unne

##### Code Example of Using Form Submit

simple_todo_with_submit.html:

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>A Simple Todo App</title>
  </head>

  <style>
    main {
      /* To show both <section> element side by side */
      display: flex;
      justify-content: center;
    }
  </style>

  <body>
    <main>
      <section>
        <h3>Input a Todo</h3>
        <form action="" id="todoForm">
          <input title="Input a Todo" type="text" name="todo" id="todo" />
          <button type="submit" id="addTodo">Add</button>
        </form>
      </section>
      <section>
        <h3>Get All Todos</h3>
        <ul id="allTodos"></ul>
      </section>
    </main>

    <script>
      // When the page content is loaded
      window.addEventListener("DOMContentLoaded", () => {
        // Get the input field and buttons
        const inputTodo = document.querySelector("#todo");
        const allTodos = document.querySelector("#allTodos");
        const todoForm = document.querySelector("#todoForm");

        // When the todoForm is submitted
        todoForm.addEventListener("submit", (e) => {
          // Prevent the default form submission behavior
          e.preventDefault();

          // Create a FormData object from the submitted form
          const formData = new FormData(e.target);

          // Convert the FormData object to a simple key-value object
          const formFieldValues = Object.fromEntries(formData);

          // Get the value of the 'todo' field
          const todoValue = formFieldValues["todo"];

          // Add the todoValue to the list of allTodos
          allTodos.innerHTML += `<li>${todoValue}</li>`;

          // Reset the form after submission
          e.target.reset();
        });
      });
    </script>
  </body>
</html>
```
