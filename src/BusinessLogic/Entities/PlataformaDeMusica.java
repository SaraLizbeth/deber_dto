package BusinessLogic.Entities;

public class PlataformaDeMusica {
    String catalogoDeMusica;
    String cantante;
    String cancion;

    public PlataformaDeMusica (String catalogoDeMusica, String cantante, String cancion) {
        this.catalogoDeMusica= catalogoDeMusica;
        this.cantante=cantante;
        this.cancion= cancion;
    }

    public String getCatalogoDeMusica() {
        return catalogoDeMusica;
    }

    public void setCatalogoDeMusica(String catalogoDeMusica){
        this.catalogoDeMusica= catalogoDeMusica;
    }

    public String getCantante (){
        return cantante;
    }

    public void setCantante (String cantante) {
        this.cantante= cantante;
    }

    public String getCancion (){
        return cancion;
    }

    public void setCancion (String cancion){
        this.cancion = cancion;
    }
    
}
