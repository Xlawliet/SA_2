package SA_2.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class getMinValue {
    public static List<Double>getMin()
    {
        List<Double>ans=new ArrayList<Double>();
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try{
            connection=getLink.getLink();
            String sql="SELECT [最低价_元] FROM dbo.SA_DATA";
            preparedStatement=connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                double temMin=resultSet.getDouble(1);
                ans.add(temMin);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return ans;
    }
    public static void main(String []args) {
        getMinValue g=new getMinValue();
        List<Double>list=g.getMin();
        for(Double d:list)
        {
            System.out.println(d);
        }

    }
}
