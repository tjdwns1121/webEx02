package com.sds.icto.webEx02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadioServlet
 */
@WebServlet("/param")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RadioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		String items[] = request.getParameterValues("item");
		String job = request.getParameter("job");

		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("당신이 입력한 정보입니다.<br><br>");
		out.println("성별 : <b>");
		out.println(gender);
		out.println("</b><br><br> 메일 정보 수신 여부 : <b>");
		out.println(chk_mail);
		
		out.println("</b><br><br> 관심 항목 : <br>");
		if(items==null){
			out.print("선택한 항목이 없습니다.");
		}
		else{
			out.println("당신이 선택한 항목입니다 :  <b> ");
			for(String item :items){
				out.print(item+" ");
			}
		}
		
		out.println("</b><br><br>당신의 직업 : <b>");
		out.print(job);
		
		
		
		out.println("</b><br><br> 가입 인사 : <b><pre>");
		out.println(content);

		out.println("</b></pre><br><a href ='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");

		out.close();
		
	}

}
