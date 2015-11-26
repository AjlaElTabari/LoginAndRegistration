
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loggedin_Scope0 {
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

class loggedin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
BRAVO!
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object loggedin extends loggedin_Scope0.loggedin
              /*
                  -- GENERATED --
                  DATE: Thu Nov 26 17:41:38 CET 2015
                  SOURCE: /Users/ajla.eltabari/play/RegisterAndLogin/app/views/loggedin.scala.html
                  HASH: 4f4736d02e60453ed1742048756e84384114942d
                  MATRIX: 833->0
                  LINES: 32->1
                  -- GENERATED --
              */
          