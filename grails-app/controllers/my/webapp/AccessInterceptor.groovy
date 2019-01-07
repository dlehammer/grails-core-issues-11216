package my.webapp

class AccessInterceptor {

    AccessInterceptor() {
        match(controller: "first")
    }

    boolean before() {
        log.info("AccessInterceptor.before hit!")

        response.sendError(403)

        return false
    }

    boolean after() { true }

}
