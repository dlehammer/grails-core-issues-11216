package my.webapp

class FooTagLib {

    static namespace = 'foo'

    def whoIsCalling = { attrs ->
        def name = controllerName
        log.info("whoIsCalling name=$name")

        out << "foo.controllerName=$name"
    }

}
