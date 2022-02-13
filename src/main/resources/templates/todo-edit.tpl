yieldUnescaped '<!DOCTYPE html>'
html(lang:'en') {
    head {
        meta('http-equiv':'"Content-Type" content="text/html; charset=utf-8"')
        if (add) {
            title("Create a Todo")
        }
        else {
            title("Edit Todo")
        }
        link(rel: "stylesheet", type: "text/css", href: "/css/style.css")
    }
    body {
        if (add) {
            h1("Create a Todo:")
        }
        else {
            h1("Edit Todo")
        }
        a(href: "/todos", "Back to Todos List")
        br()
        br()
        form (id:"editForm", action:"$actionUrl", method:"POST") {
            table(border: "0") {
                if (!add) {
                    tr {
                        td("Id")
                        td(":")
                        td(todo.id ?: '')
                    }
                }
                tr {
                    td("Todo")
                    td(":")
                    td {
                        input(name: 'todo', type: 'text', value: todo.todo ?: '')
                    }
                }
                tr {
                    td("Completed")
                    td(":")
                    td {
                        input(name: 'completed', type: 'checkbox', checked: todo.completed)
                    }
                    td(todo.completed)
                }
            }
            br()
            if (add) {
                input(type: 'submit', value: 'Create')
            }
            else {
                input(type: 'submit', value: 'Update')
            }
        }

        br()
        if (errorMessage!=null) {
            div(class: "error", "$errorMessage")
        }
    }
}