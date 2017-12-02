
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapps/WMDD1CoreDesignLab/conf/routes
// @DATE:Sat Dec 02 08:47:33 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
