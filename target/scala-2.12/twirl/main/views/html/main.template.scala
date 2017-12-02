
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(pageID: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.33*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en" id=""""),_display_(/*10.22*/pageID),format.raw/*10.28*/("""">
    <head>
        <title>Core Design - """),_display_(/*12.31*/pageID),format.raw/*12.37*/("""</title>
        <!--Generate links to css files-->
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*14.70*/routes/*14.76*/.Assets.versioned("stylesheets/style.css")),format.raw/*14.118*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*15.70*/routes/*15.76*/.Assets.versioned("stylesheets/form.css")),format.raw/*15.117*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*16.70*/routes/*16.76*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.117*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
    </head>
    <body>
        <div id="Container">
            <div id="Logo">
                <h1>Core Design</h1>
                <h3>
                    <em>Website Design and Development Services</em>
                </h3>
            </div>
            <div id="Navigation">
                <ul>
                    <li><a href=""""),_display_(/*29.35*/routes/*29.41*/.Application.index()),format.raw/*29.61*/("""" class="home">Home</a></li>
                    <li><a href=""""),_display_(/*30.35*/routes/*30.41*/.Application.about()),format.raw/*30.61*/("""" class="about">About Us</a></li>
                    <li><a href=""""),_display_(/*31.35*/routes/*31.41*/.Application.services()),format.raw/*31.64*/("""" class="services">Services</a></li>
                    <li><a href=""""),_display_(/*32.35*/routes/*32.41*/.Application.clients()),format.raw/*32.63*/("""" class="clients">Clients</a></li>
                    <li><a href=""""),_display_(/*33.35*/routes/*33.41*/.Application.contact()),format.raw/*33.63*/("""" class="contact">Contact us</a></li>
                </ul>
            </div>
            <div id="Content">
                """),_display_(/*37.18*/content),format.raw/*37.25*/("""
            """),format.raw/*38.13*/("""</div>
            <div id="Footer">
                <h6>
                    <em>Copyright &copy; 2015 Core Design</em>
                </h6>
            </div>
        
        </div>
        

        <!--<script src=""""),_display_(/*48.27*/routes/*48.33*/.Assets.versioned("javascripts/main.js")),format.raw/*48.73*/("""" type="text/javascript"></script>-->
    </body>
</html>
"""))
      }
    }
  }

  def render(pageID:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageID)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageID) => (content) => apply(pageID)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 02 08:47:36 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1CoreDesignLab/app/views/main.scala.html
                  HASH: c0e4b673db5f7e8824de6ced43544867ed9ab61e
                  MATRIX: 1206->260|1332->291|1360->293|1424->330|1451->336|1522->380|1549->386|1697->507|1712->513|1776->555|1875->627|1890->633|1953->674|2052->746|2067->752|2130->793|2218->854|2233->860|2294->899|2661->1239|2676->1245|2717->1265|2807->1328|2822->1334|2863->1354|2958->1422|2973->1428|3017->1451|3115->1522|3130->1528|3173->1550|3269->1619|3284->1625|3327->1647|3481->1774|3509->1781|3550->1794|3799->2016|3814->2022|3875->2062
                  LINES: 33->7|38->7|40->9|41->10|41->10|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|68->37|68->37|69->38|79->48|79->48|79->48
                  -- GENERATED --
              */
          