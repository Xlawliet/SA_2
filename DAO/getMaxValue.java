package SA_2.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class getMaxValue {
    public static List<Double>getMax()
    {
        List<Double>ans=new ArrayList<Double>();
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try{
            connection=getLink.getLink();
            String sql="SELECT [最高价_元] FROM dbo.SA_DATA";
            preparedStatement=connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                double temMax=resultSet.getDouble(1);
                ans.add(temMax);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return ans;
    }
    public static void main(String []args) {
        getMaxValue g=new getMaxValue();
        List<Double>list=g.getMax();
        for(Double d:list)
        {
            System.out.println(d);
        }

    }
}
