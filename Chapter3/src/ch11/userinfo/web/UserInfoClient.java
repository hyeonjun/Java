package ch11.userinfo.web;

import ch11.domain.userinfo.UserInfo;
import ch11.domain.userinfo.dao.UserInfoDao;
import ch11.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch11.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\wngus\\Desktop\\공부\\Java_Spring\\Java\\Chapter3\\src\\db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPasswd("!@#$%");
        userInfo.setUserName("이순신");

        UserInfoDao userInfoDao = null;
        if(dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();
        } else if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else {
            System.out.println("db support error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
