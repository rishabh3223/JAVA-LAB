package itreturns;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calctax
 */
@WebServlet("/calctax")
public class calctax extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public calctax() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		double salary = Double.parseDouble(request.getParameter("salary"));
		double deduction = Double.parseDouble(request.getParameter("deduction"));
		double incomeTax = (salary - deduction)*0.15;

		/*
		 * response.getWriter()
			.append("\nName: " + name)
			.append("\nGender: " + gender)
			.append("\nSalary: " + salary)
			.append("\nDeduction: " + deduction)
			.append("\nIncomeTax: " + incomeTax);
		*/
		
		PrintWriter out = response.getWriter();
		out.println("Name: " + name);
		out.println("Gender: " + gender);
		out.println("Salary: " + salary);
		out.println("Deduction: " + deduction);
		out.println("IncomeTax: " + incomeTax);

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
