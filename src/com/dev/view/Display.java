package com.dev.view;

import com.dev.model.DatabaseConnModel;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class Display extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        DatabaseConnModel action = (DatabaseConnModel)request.getAttribute("d24mcx432");
        if(action.isLoginAccepted()) {
            try {
                action.SQLConn(2, true);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            String myvar = "<html lang=\"en\"><head>    <title>APPINTR</title>    <meta charset=\"UTF-8\">    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\">    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"></head><body data-new-gr-c-s-check-loaded=\"8.871.0\" data-gr-ext-installed=\"\"><div class=\"container-login100\" style=\"background-image: url('images/bg-01.jpg');\">    <div class=\"wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30\">        <form method=\"post\" class=\"login100-form\" action=\"process.PerformAddGuitarAction\">            <span class=\"login100-form-title p-b-37\">ADD GUITAR</span>            <div class=\"container-login100-form-btn\">                <div class=\"wrap-input100 validate-input m-b-20\" data-validate=\"Enter Guitar Name\">                    <input class=\"input100\" type=\"text\" placeholder=\"Guitar Name\" name=\"gName\">                    <span class=\"focus-input100\"></span>                </div>                <div class=\"wrap-input100 validate-input m-b-20\" data-validate=\"Enter Guitar Price\">                    <input class=\"input100\" type=\"number\" placeholder=\"Guitar Price\" name=\"gPrice\">                    <span class=\"focus-input100\"></span>                </div>  <div class=\"wrap-input100 validate-input m-b-20\" data-validate=\"Enter Image Link\">                    <input class=\"input100\" type=\"text\" placeholder=\"Image Link\" name=\"gImage\">                    <span class=\"focus-input100\"></span>                </div>               <button class=\"login100-form-btn\" type=\"submit\">                    CONTINUE                </button>            </div><hr>        </form><form method=\"post\" class=\"login100-form\" action=\"process.PerformRemoveGuitarAction\">            <span class=\"login100-form-title p-b-37\">REMOVE GUITAR</span>            <div class=\"container-login100-form-btn\">                <div class=\"wrap-input100 validate-input m-b-20\" data-validate=\"Enter Guitar Name\">                    <input class=\"input100\" type=\"text\" name=\"rGuitar\" placeholder=\"Guitar Name to Remove\">                    <span class=\"focus-input100\"></span>                </div>                                <button class=\"login100-form-btn\" type=\"submit\">                    CONTINUE                </button>            </div><hr>"+
                    "<style>\n" +
                    "table, th, td {\n" +
                    "  border: 1px solid black;\n" +
                    "}\n" +
                    "</style>"+
                    " <table style=\"width:100%\">"+
                    "  <tbody><tr>"+
                    "    <th>ID</th>"+
                    "    <th>Guitar Name</th>"+
                    "    <th>Guitar Price</th>"+
                    "  </tr>"+
                    action.getgDBAppendedData()
                    +"<b><a href=\"javascript:location.reload(true)\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Click Here to Refresh Guitar Database</a></b>"+
                    "</tbody></table>        </form>    </div></div><div id=\"dropDownSelect1\"></div><script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script><script src=\"vendor/animsition/js/animsition.min.js\"></script><script src=\"vendor/bootstrap/js/popper.js\"></script><script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script><script src=\"vendor/select2/select2.min.js\"></script><script src=\"vendor/daterangepicker/moment.min.js\"></script><script src=\"vendor/daterangepicker/daterangepicker.js\"></script><script src=\"vendor/countdowntime/countdowntime.js\"></script><script src=\"js/main.js\"></script>"+
                    "</body></html>";
            out.println(myvar);

        }
    }

}
