package SA_2.BUS;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SA_2.DAO.*;

/**
 * Servlet implementation class HandleQuery
 */
@WebServlet("/HandleQuery")
public class HandleQuery extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleQuery() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String queryName=request.getParameter("Selecttion");
        String type=null;
        if(queryName.equals("maxValue")){
            List<Double>list=null;
            try
            {
                //Class<?> g = Class.forName("SA_2.DAO.getMaxValue");
                list=getMaxValue.getMax();
                request.setAttribute("list", list);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.print(list.size());
            type=new String("最高价");
            request.setAttribute("type",type);
        }
        else if(queryName.equals("minValue")){
            List<Double>list=null;
            try
            {
                //Class<?> g = Class.forName("SA_2.DAO.getMaxValue");
                list=getMinValue.getMin();
                request.setAttribute("list", list);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.print(list.size());
            type=new String("最低价");
            request.setAttribute("type",type);

        }
        request.getRequestDispatcher("/maxValue.jsp").forward(request, response);
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
