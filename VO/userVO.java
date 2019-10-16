package SA_2.VO;

import com.amazonaws.services.dynamodbv2.xspec.S;

public class userVO {
    private int _idUser;
    private String _firstname;
    private String _lastname;
    private String _email;
    private String  _company;
    private String _phone;
    private String _city;
    private String _province;
    private String _country;
    private String _postCode;
    private String _position;


    public  userVO(){};
    public userVO(int _idUser, String _firstname, String _lastname, String _email, String _city, String _company,
                  String _phone, String _province,String _country,String _postCode,String _position) {
        this._idUser = _idUser;
        this._firstname = _firstname;
        this._lastname = _lastname;
        this._email = _email;
        this._city= _city;
        this._company=_company;
        this._phone=_phone;
        this._province=_province;
        this._country=_country;
        this._postCode=_postCode;
        this._position=_position;
    }



    public String get_company() {
        return _company;
    }

    public void set_company(String _company) {
        this._company = _company;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    public String get_city() {
        return _city;
    }

    public void set_city(String _city) {
        this._city = _city;
    }

    public String get_province() {
        return _province;
    }

    public void set_province(String _province) {
        this._province = _province;
    }

    public String get_country() {
        return _country;
    }

    public void set_country(String _country) {
        this._country = _country;
    }

    public String get_postCode() {
        return _postCode;
    }

    public void set_postCode(String _postCode) {
        this._postCode = _postCode;
    }

    public String get_position() {
        return _position;
    }

    public void set_position(String _position) {
        this._position = _position;
    }



    public int get_idUser() {
        return _idUser;
    }

    public void set_idUser(int _idUser) {
        this._idUser = _idUser;
    }

    public String get_firstname() {
        return _firstname;
    }

    public void set_firstname(String _firstname) {
        this._firstname = _firstname;
    }

    public String get_lastname() {
        return _lastname;
    }

    public void set_lastname(String _lastname) {
        this._lastname = _lastname;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }
}
