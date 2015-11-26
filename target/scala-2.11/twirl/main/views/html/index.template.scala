
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import helper._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Registration and login")/*2.32*/ {_display_(Seq[Any](format.raw/*2.34*/("""
    """),format.raw/*3.5*/("""<nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Login and registration</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    """),_display_(/*19.22*/helper/*19.28*/.form(action=routes.UserController.login())/*19.71*/ {_display_(Seq[Any](format.raw/*19.73*/("""
                    """),format.raw/*20.21*/("""<li><a href=""""),_display_(/*20.35*/routes/*20.41*/.UserController.registerUser()),format.raw/*20.71*/("""">Registration</a></li>
                    <li><label>email</label><input></li>
                    <li><label>password</label><input></li>
                    <li><button>Login</button></li>
                    """)))}),format.raw/*24.22*/("""
                """),format.raw/*25.17*/("""</ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Thu Nov 26 17:44:36 CET 2015
                  SOURCE: /Users/ajla.eltabari/play/RegisterAndLogin/app/views/index.scala.html
                  HASH: 5f9752b9445d0f82e6f1262375148bfdda876142
                  MATRIX: 871->18|909->48|948->50|979->55|1943->992|1958->998|2010->1041|2050->1043|2099->1064|2140->1078|2155->1084|2206->1114|2451->1328|2496->1345|2630->1449
                  LINES: 35->2|35->2|35->2|36->3|52->19|52->19|52->19|52->19|53->20|53->20|53->20|53->20|57->24|58->25|62->29
                  -- GENERATED --
              */
          