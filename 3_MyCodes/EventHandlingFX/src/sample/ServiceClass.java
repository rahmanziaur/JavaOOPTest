package sample;

import java.sql.SQLException;

/**
 * Created by User PC on 6/9/16.
 */
public class ServiceClass extends MyDBClass{

    public boolean InsetDB(String name ) {
        this.getConnection();

        String sql = "INSERT INTO STUDENT(NAME) VALUES(?)";

        try
        {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            //rs = ps.executeQuery();
            ps.executeUpdate();

            ps.close();
            //rs.close();
            connection.close();
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
}