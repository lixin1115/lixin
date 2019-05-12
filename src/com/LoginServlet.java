package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");// ����������ݵı����ʽ
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");// ����������ݵı����ʽ
		String u=request.getParameter("user");
        String p=request.getParameter("passward");  
         if(u.equals("zhangsan")&&p.equals("123123")){
                request.getRequestDispatcher("SuccessServlet").forward(request, response);//ת�����ɹ�ҳ��
            }else{
            response.sendRedirect("Register.html");//�û�������,�ض���ʧ��ҳ��
        }
        response.setContentType("text/html");
 		PrintWriter out = response.getWriter();
 		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
 		out.println("<HTML>");
 		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
 		out.print("userName");
 		out.print("password");
 		out.println("  <BODY>");
 		out.print("��¼�ɹ�");
 		out.println("  </BODY>");
 	    out.println("</HTML>");
 		out.flush();
 		out.close();	}
}
