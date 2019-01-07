package my.webapp

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(redirect: [controller: "first", action: "index"])
        "500"(view:'/error')
        "403"(controller: "second", action: "showError")
        "404"(view:'/notFound')

        log.info("URL-mappings loaded")
    }
}
