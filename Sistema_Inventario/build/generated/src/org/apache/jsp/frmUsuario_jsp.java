package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frmUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"StyleSheet\" type=\"Text/css\" href=\"CSS/r_columnas.css\">\n");
      out.write("        \n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"fondo\">\n");
      out.write("            <div id=\"hoja1\">\n");
      out.write("                <h1>Este es el index</h1>\n");
      out.write("                <table border=\"1\" id=\"tabla\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Soy titulo</th>\n");
      out.write("                        <th>Soy titulo</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
for(int i=0;i<10;i++){
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Soy elemento");
      out.print(i);
      out.write("</td>\n");
      out.write("                        <td>Soy elemento");
      out.print(i);
      out.write("</td>\n");
      out.write("                        <td>Soy elemento");
      out.print(i);
      out.write("</td>\n");
      out.write("                        <td><input id=\"identificador_");
      out.print(i);
      out.write("\" type=\"button\" value=\"Modificar\" onclick=\"javascript:CargaModificar('frmUsuarioModificar.html','hoja2',this.id)\"></td>\n");
      out.write("                        <td><input type=\"button\" value=\"Eliminar\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"hoja2\">\n");
      out.write("                <h1>Seleccione usuario...</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
