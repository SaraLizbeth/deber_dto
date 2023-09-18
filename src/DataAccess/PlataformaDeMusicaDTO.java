package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import Framework.AppException;

public class PlataformaDeMusicaDTO extends SQLiteDataHelper {

    public ResultSet getAllData() throws AppException {
        String query= "SELECT c.Nombre \"CATALOGO_MUSICA\", t.NOMBRE \"CANTANTE\", u.NOMBRE \"CANCION\"  \r\n" + //
                "FROM CANCION u \r\n" + //
                "JOIN CANTANTE t ON t.ID_CANTANTE = u.ID_CANTANTE\r\n" + //
                "JOIN CATALOGO_MUSICA c ON c.ID_CATALOGO_MUSICA = u.ID_CATALOGO_MUSICA";
        try{
            Connection connection = openConnection();
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            return resultSet;
        } catch (SQLException e){
            throw new AppException(e, getClass(), "getAllData()");
        }
    }
    
}
