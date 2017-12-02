
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!--"""),_display_(/*1.6*/()),format.raw/*1.8*/("""-->

"""),_display_(/*3.2*/main("Contact")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
  """),format.raw/*4.54*/(""" 

  """),format.raw/*6.3*/("""<h3>
    Contact
  </h3>
  <h4>
    You can contact us fallowed by :
  </h4>
 


  <table>
    <tr>
      <th>Contact type</th>
      <th>contact</th> 
      <th>Ingo</th>
    </tr>
    <tr>
      <td>Phone call:</td>
      <td>+353(01)414345678</td>
      <td>after 10am </td>
    </tr>
    <tr>
      <td>eMail :</td>
      <td>play.withe us.ie</td>
      <td>Jane Tores</td>
    </tr>
    <tr>
      <td>Web www</td>
      <td>wwww.playwithus.ie</td>
      <td>wisit the side</td>
    </tr>
    <tr>
      <td> Facebook</td>
      <td>playUS</td>
      <td>Gropu</td>
    </tr>
  </table>
  <br>
  
  <table id="t01">
    <tr>
      <tr>
        <th>Contact type</th>
        <th>contact</th> 
        <th>Ingo</th>
      </tr>
      <tr>
        <td>Phone call:</td>
        <td>+353(01)414345678</td>
        <td>after 10am </td>
      </tr>
      <tr>
        <td>eMail :</td>
        <td>play.withe us.ie</td>
        <td>Jane Tores</td>
      </tr>
      <tr>
        <td>Web www</td>
        <td>wwww.playwithus.ie</td>
        <td>wisit the side</td>
      </tr>
      <tr>
        <td> Facebook</td>
        <td>playUS</td>
        <td>Gropu</td>
      </tr>
  </table>
  <form action="/action_page.php">
    E-mail:
    <input type="email" name="email">
    <input type="submit">
  </form>
  <form>
    <textarea>Some text...</textarea>
  </form>
  <p>
  <b>Note:</b>type="email" is not supported in IE9 and earlier.</p>
  <p>
    Please <a href="ContactUs.html" > contact us</a>to discuss your requirments
  </p>
""")))}),format.raw/*85.2*/("""
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
                  DATE: Sat Dec 02 08:52:04 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1CoreDesignLab/app/views/contact.scala.html
                  HASH: 3dc2deda8021f64017cfc67774d4585cec3fecdc
                  MATRIX: 1032->0|1062->5|1083->7|1114->13|1137->28|1176->30|1206->84|1237->89|2794->1616
                  LINES: 33->1|33->1|33->1|35->3|35->3|35->3|36->4|38->6|117->85
                  -- GENERATED --
              */
          