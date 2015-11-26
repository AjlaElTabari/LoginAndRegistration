
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

     object register_Scope1 {
import helpers.Constants

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[AppUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userForm: Form[AppUser]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.27*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<div id="main-background">
    <div class="container" id="background">
        <section id="hotel-section1" class="marginbottom">
            <div class="container">
                <div class="about text-center">
                    <h2>REGISTER</h2>
                </div>
            </div>
        </section>
        <section>
            <div class="col-md-6 col-md-offset-3 contact-form">
                <h3>Please enter your data</h3>
                <div class="info-detail">
                    """),_display_(/*18.22*/helper/*18.28*/.form(action = routes.UserController.saveUser())/*18.76*/ {_display_(Seq[Any](format.raw/*18.78*/("""

                    """),format.raw/*20.21*/("""<form>
                        <div class="duplicate-email" style="font-size: 18px; color: red;">
                            """),_display_(/*22.30*/if(flash.containsKey("error"))/*22.60*/ {_display_(Seq[Any](format.raw/*22.62*/("""
                            """),format.raw/*23.29*/("""<div class="alert alert-danger" role="alert">
                                <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                                <span class="sr-only">Error:</span>
                                """),_display_(/*26.34*/flash/*26.39*/.get("error")),format.raw/*26.52*/("""
                            """),format.raw/*27.29*/("""</div>


                            """)))}),format.raw/*30.30*/("""
                        """),format.raw/*31.25*/("""</div>
                        <!--input field for email-->
                        <input type="email" id="email" name = "email" value=""""),_display_(/*33.79*/userForm/*33.87*/.bindFromRequest().field("email").value()),format.raw/*33.128*/("""" required placeholder="e.g. john.doe&#64example.com" required onkeyup="checkEmail();">
                        <div style="font-size: 20px; color: red" id="email_error"></div>
                        <!--input field for password-->
                        <input type="password" id="password1" name = "password" value=""""),_display_(/*36.89*/userForm/*36.97*/.bindFromRequest().field("password").value()),format.raw/*36.141*/("""" placeholder="Password(min 6 characters)" required onkeyup="checkPasswordLength();">
                        <div style="font-size: 20px; color: red" id="password_error"></div>
                        <!--input field for password confirmation-->
                        <input type="password" id="password-retype" name="passwordretype" value=""""),_display_(/*39.99*/userForm/*39.107*/.bindFromRequest().field("passwordretype").value()),format.raw/*39.157*/("""" placeholder="Please confirm your password" required onkeyup="checkPasswordMatch();" >
                        <div style="font-size: 20px; color: red" id="password2_error"></div>
                        <!--input for name-->
                        <input type="text" id="name" name="firstname" value=""""),_display_(/*42.79*/userForm/*42.87*/.bindFromRequest().field("firstname").value()),format.raw/*42.132*/("""" placeholder="Please enter your name" required onkeyup="checkName();" onkeyup=" checkNameLength()">
                        <div style="font-size: 20px; color: red" id="name_error"></div>
                        <div style="font-size: 20px; color: red" id="namelength_error"></div>

                        <!--input for lastname-->
                        <input type="text" id="last-name" name="lastname" value=""""),_display_(/*47.83*/userForm/*47.91*/.bindFromRequest().field("lastname").value()),format.raw/*47.135*/("""" placeholder="Please enter your last name" required onkeyup="checkLastname();" onkeyup="checkLastnameLength()" >
                        <div style="font-size: 20px; color: red" id="lastname_error"></div>
                        <div style="font-size: 20px; color: red" id="lastnamelength_error"></div>
                        <!--submit button-->
                        <input class="submit-btn" style="background-color: #204d74; margin-bottom: 20px; height: 40px; width: 140px;" type="submit" value="Register">
                    </form>
                    """)))}),format.raw/*53.22*/("""
                """),format.raw/*54.17*/("""</div>
            </div>
        </section>



    </div>

</div>"""))
      }
    }
  }

  def render(userForm:Form[AppUser]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[AppUser]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}
}

/**/
object register extends register_Scope0.register_Scope1.register
              /*
                  -- GENERATED --
                  DATE: Thu Nov 26 17:12:33 CET 2015
                  SOURCE: /Users/ajla.eltabari/play/RegisterAndLogin/app/views/user/register.scala.html
                  HASH: bd017af560f8ec3230ee4a731bdeadee674b04a5
                  MATRIX: 819->27|954->52|981->70|1008->71|1541->577|1556->583|1613->631|1653->633|1703->655|1857->782|1896->812|1936->814|1993->843|2277->1100|2291->1105|2325->1118|2382->1147|2451->1185|2504->1210|2669->1348|2686->1356|2749->1397|3097->1718|3114->1726|3180->1770|3552->2115|3570->2123|3642->2173|3974->2478|3991->2486|4058->2531|4501->2947|4518->2955|4584->2999|5179->3563|5224->3580
                  LINES: 30->2|35->2|36->4|37->5|50->18|50->18|50->18|50->18|52->20|54->22|54->22|54->22|55->23|58->26|58->26|58->26|59->27|62->30|63->31|65->33|65->33|65->33|68->36|68->36|68->36|71->39|71->39|71->39|74->42|74->42|74->42|79->47|79->47|79->47|85->53|86->54
                  -- GENERATED --
              */
          