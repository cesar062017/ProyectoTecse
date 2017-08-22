package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mongodb.DBCollection;
import com.mongodb.DB;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;

public final class crearUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            
            public void guardar(String nombre,String usuario,String password,String direccion,String nivel) {
                String basedatos = "bd_inventario_bitel";
                MongoClient mCliente = new MongoClient("127.0.0.1");
                /*Esta es una version antigua si algun dia falla el sistema es x esto*/
                DB db = mCliente.getDB(basedatos);
                DBCollection coleccion = db.getCollection("usuarios");
                //DBCursor cursor = coleccion.find();
                //BasicDBObject consulta = new BasicDBObject("profesion","contador");

                //Pattern patron = Pattern.compile("J");
                //QueryBuilder consulta = QueryBuilder.start("nombre").regex(patron);
                //DBCursor cursor = coleccion.find(consulta.get());
                BasicDBObject documento = new BasicDBObject();
                documento.put("nombre", nombre);
                documento.put("usuario", usuario);
                documento.put("password", password);
                documento.put("direccion", direccion);
                documento.put("nivel", nivel);
            }
        
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <input name=\"nombre\" placeholder=\"Nombre\">\n");
      out.write("            <input name=\"usuario\" placeholder=\"Usuario\">\n");
      out.write("            <input name=\"password\" placeholder=\"Contraseña\">\n");
      out.write("            <input name=\"direccion\" placeholder=\"Nivel\">\n");
      out.write("            <input name=\"nivel\" placeholder=\"Direccion\">\n");
      out.write("            <input type=\"button\" value=\"Guardar\" onclick=\"guardar()\">\n");
      out.write("        </div>\n");
      out.write("        ");

            /*String nombre = request.getParameter("nombre");
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            String direccion = request.getParameter("direccion");
            String nivel = request.getParameter("nivel");*/
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function ejecutar(){\n");
      out.write("                var nombre = document.getElementById(\"nombre\");\n");
      out.write("                var usuario = document.getElementById(\"usuario\");\n");
      out.write("                var password = document.getElementById(\"password\");\n");
      out.write("                var direccion = document.getElementById(\"direccion\");\n");
      out.write("                var nivel = document.getElementById(\"nivel\");\n");
      out.write("                guardar(nombre,usuario,password,direccion,nivel);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
