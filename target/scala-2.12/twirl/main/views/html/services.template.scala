
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object services extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!--"""),_display_(/*1.6*/()),format.raw/*1.8*/("""-->

"""),_display_(/*3.2*/main("Services")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
  """),format.raw/*4.54*/(""" 
"""),format.raw/*5.1*/("""`
  <h3>
    Services
  </h3>
  <h4>
    Our servicec provide by :
  </h4>
  <ul>
    <li>Cleaning </li>
    <li>repair of damaged parts</li>
    <li>Renovations</li>
    <li>Advertaising </li>
  </ul>

  <p>
    Please <a href="ContactUs.html" > contact us</a>to discuss your requirments
  </p>
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 02 08:47:35 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1CoreDesignLab/app/views/services.scala.html
                  HASH: 18dfb407b5da0ad7c53d251a862b09a525e149a9
                  MATRIX: 1033->0|1063->5|1084->7|1115->13|1139->29|1178->31|1208->85|1236->87|1563->384
                  LINES: 33->1|33->1|33->1|35->3|35->3|35->3|36->4|37->5|54->22
                  -- GENERATED --
              */
          