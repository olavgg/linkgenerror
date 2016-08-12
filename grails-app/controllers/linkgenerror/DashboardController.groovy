package linkgenerror

class DashboardController {

    static namespace = "administration"

    def index() {
        render view: '/dashboard/index'
    }
}
