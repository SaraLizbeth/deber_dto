package BusinessLogic.Entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import BusinessLogic.Entities.PlataformaDeMusica;
import DataAccess.PlataformaDeMusicaDTO;
import Framework.AppException;

public class PlataformaDeMusicaBL {
    public List <PlataformaDeMusica> getAllData() throws AppException {
        try {
            PlataformaDeMusicaDTO pp= new PlataformaDeMusicaDTO();
            List <PlataformaDeMusica> lstPlataformaDeMusica = new ArrayList <PlataformaDeMusica>();
            ResultSet rs = pp.getAllData();

            while (rs.next()){
                PlataformaDeMusica pa= new PlataformaDeMusica (rs.getString("CATALOGO_MUSICA"),
                                            rs.getString("CANTANTE"),
                                            rs.getString("CANCION"));
                lstPlataformaDeMusica.add(pa);
            }
            return lstPlataformaDeMusica;
        } catch (Exception e){
            throw new AppException(e, getClass(), "getAllData");
        }
    }
    
}
