
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""'>

        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href='"""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*11.110*/("""'>
        <script src='"""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*12.78*/("""' type="text/javascript"></script>

        <link rel="shortcut icon" type="image/png" href='"""),_display_(/*14.59*/routes/*14.65*/.Assets.versioned("images/favicon.png")),format.raw/*14.104*/("""'>
        <script src='"""),_display_(/*15.23*/routes/*15.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*15.70*/("""' type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*18.10*/content),format.raw/*18.17*/("""
    """),format.raw/*19.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Nov 26 17:03:47 CET 2015
                  SOURCE: /Users/ajla.eltabari/play/RegisterAndLogin/app/views/main.scala.html
                  HASH: 6f3eeed56e563a6b8551c632e6a0495692795453
                  MATRIX: 748->1|873->31|901->33|988->94|1013->99|1101->161|1115->167|1177->208|1288->292|1303->298|1375->348|1427->373|1442->379|1512->428|1633->522|1648->528|1709->567|1761->592|1776->598|1838->639|1932->706|1960->713|1992->718
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|49->18|49->18|50->19
                  -- GENERATED --
              */
          