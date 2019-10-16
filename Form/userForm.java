package SA_2.Form;

import SA_2.DAO.*;
import SA_2.VO.*;
import SA_2.BUS.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.*;



public class userForm {
    String _txtUsername;
    String _btnSearch;
    String _Cancel;
    private userBUS _userBUS;

    private void set_btnSearch(){
        userVO _userVO=new userVO();
       // _userVO=_userBUS.getUserEmailByName(_txtUsername.Text);
    }

    public static void main(String[] args) throws SQLException {
        userDAO dao=new userDAO();
        Connection conn=null;
        conn=getLink.getLink();
        String sql="SELECT*FROM dbo.authors";
        try{
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next())
        {
            String date=resultSet.getString(2);
            System.out.println(date);
        }
        } catch (Exception e) {
            // TODO: handle exception
            }
    }
    }

