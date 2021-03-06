package hayek

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        "/api/todos"(resources:"Todo")
        "/api/pendingTodos"(controller: 'todo',action: 'pending')

        "/"(view: '/index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
