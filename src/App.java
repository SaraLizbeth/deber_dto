
import DataAccess.SQLiteDataHelper;
import UserInterface.App.PlataformaDeMusicaMenu;

public class App {
    public static void main(String[] args) throws Exception {
        SQLiteDataHelper.openConnection();
        PlataformaDeMusicaMenu plataformaDeMusica = new PlataformaDeMusicaMenu();
        plataformaDeMusica.mostrarMenu();
    }
}
