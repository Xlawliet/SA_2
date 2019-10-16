package SA_2.BUS;

import SA_2.DAO.*;
import SA_2.VO.*;

import java.sql.ResultSet;

public class userBUS {
    private userDAO _userDAO;

    public userBUS() {
        _userDAO = new userDAO();
    }

    public userVO getUserById(String ID) {
        userVO _userVo = new userVO();
        try {
            ResultSet resultSet = _userDAO.SearchByID(ID);
            while(resultSet.next())
            {
                _userVo.set_idUser(resultSet.getInt(1));
                _userVo.set_firstname(resultSet.getString(2));
                _userVo.set_lastname(resultSet.getString(3));
                _userVo.set_email(resultSet.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return _userVo;
    }


    public userVO getUserEmailByName(String name){
        userVO _userVo = new userVO();
        try {
            ResultSet resultSet = _userDAO.searchByName(name);
            while(resultSet.next())
            {
                _userVo.set_idUser(resultSet.getInt(1));
                _userVo.set_firstname(resultSet.getString(2));
                _userVo.set_lastname(resultSet.getString(3));
                _userVo.set_email(resultSet.getString(4));
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return _userVo;
    }
}
