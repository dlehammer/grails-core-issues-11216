package my.webapp

class SecondController {

    def index() { }

    def showError() {
        log.info("SecondController.showError hit!")

        return [:]
    }

}
