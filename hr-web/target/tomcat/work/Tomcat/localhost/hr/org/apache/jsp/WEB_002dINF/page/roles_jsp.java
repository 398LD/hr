/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-25 16:49:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class roles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html\" ; charset=\"utf-8\"/>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/hr/static/layui/css/layui.css\"/>\r\n");
      out.write("    <link href=\"/hr/static/js/bstable/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"/hr/static/js/bstable/css/bootstrap-table.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"/hr/static/css/table.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <style>\r\n");
      out.write("        .notice_nav a:nth-child(3) {\r\n");
      out.write("            border-top-right-radius: 0;\r\n");
      out.write("            border-bottom-right-radius: 0\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .notice_nav a:nth-child(4) {\r\n");
      out.write("            border-top-right-radius: 4px;\r\n");
      out.write("            border-bottom-right-radius: 4px\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: #ecf0f5;font-family: 微软雅黑;color: #475059;min-width: 1000px;overflow: auto\">\r\n");
      out.write("<div class=\"notice_main\">\r\n");
      out.write("    <div class=\"notice_check\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"btn-group r_right\">\r\n");
      out.write("            <a class=\"btn btn-primary\" href=\"/hr/role/addRole\">添加角色</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <table id=\"table\" class=\"table table-condensed table-bordered\" style=\"margin: 0 auto\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>\r\n");
      out.write("                角色编号\r\n");
      out.write("            </th>\r\n");
      out.write("            <th>\r\n");
      out.write("                角色名称\r\n");
      out.write("            </th>\r\n");
      out.write("            <th>\r\n");
      out.write("                角色说明\r\n");
      out.write("            </th>\r\n");
      out.write("            <th width=\"15%\">\r\n");
      out.write("                操作\r\n");
      out.write("            </th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/hr/static/js/jquery/jQuery-2.2.0.min.js\"></script>\r\n");
      out.write("<script src=\"/hr/static/js/layer_v2.1/layer/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    function del(id) {\r\n");
      out.write("        layer.confirm('确定要删除这个角色吗?', {icon: 3, title: '提示'}, function (index) {\r\n");
      out.write("\r\n");
      out.write("            var i;\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"/hr/role/delRole\",\r\n");
      out.write("                data: {\"roleId\": id},\r\n");
      out.write("                type: \"get\",\r\n");
      out.write("                beforeSend: function () {\r\n");
      out.write("                    i = layer.msg('请稍后...', {\r\n");
      out.write("                        icon: 16,\r\n");
      out.write("                        shade: [0.5, '#f5f5f5'],\r\n");
      out.write("                        scrollbar: false,\r\n");
      out.write("                        offset: 'auto',\r\n");
      out.write("                        time: 10000\r\n");
      out.write("                    });\r\n");
      out.write("                },\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    layer.close(i)\r\n");
      out.write("                    if (data.code == 200) {\r\n");
      out.write("                        layer.msg(data.message, {\r\n");
      out.write("                                icon: 1,\r\n");
      out.write("                                time: 1000 //2秒关闭（如果不配置，默认是3秒）\r\n");
      out.write("                            }, function () {\r\n");
      out.write("                                window.location.href = \"/hr/role/roles\";\r\n");
      out.write("                            }\r\n");
      out.write("                        )\r\n");
      out.write("                    } else {\r\n");
      out.write("                        layer.msg(data.message, {\r\n");
      out.write("                                icon: 2,\r\n");
      out.write("                                time: 3000 //2秒关闭（如果不配置，默认是3秒）\r\n");
      out.write("                            }\r\n");
      out.write("                        )\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("            layer.close(index);\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/page/roles.jsp(48,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/page/roles.jsp(48,8) '${pageInfo.list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageInfo.list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/page/roles.jsp(48,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("r");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>\r\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.roleId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("                <td>\r\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.roleName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("                <td>\r\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.roleDesc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("                <td>\r\n");
          out.write("                    <a href=\"/hr/role/updRole?roleId= ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.roleId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">修改</a>\r\n");
          out.write("                    <a href=\"javascript:del(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.roleId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\">删除</a>\r\n");
          out.write("                    <a href=\"/hr/role/allocationRight?roleId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.roleId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">分配权限</a>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
