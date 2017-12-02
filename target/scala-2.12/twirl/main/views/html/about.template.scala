
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!--"""),_display_(/*1.6*/()),format.raw/*1.8*/("""-->

"""),_display_(/*3.2*/main("About Us")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
  """),format.raw/*4.54*/(""" 

  """),format.raw/*6.3*/("""<h3>
    Core Design is a professinal web design and online application development company based in Dublin, Ireland
  </h3>
  <h4>
    Few words about our fundations 
  </h4>


  
""")))}),format.raw/*15.2*/("""
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
                  SOURCE: /home/wdd/webapps/playapps/WMDD1CoreDesignLab/app/views/about.scala.html
                  HASH: d03497cbb704aa6544be793acac94cf1b290a801
                  MATRIX: 1030->0|1060->5|1081->7|1112->13|1136->29|1175->31|1205->85|1236->90|1448->272
                  LINES: 33->1|33->1|33->1|35->3|35->3|35->3|36->4|38->6|47->15
                  -- GENERATED --
              */
          