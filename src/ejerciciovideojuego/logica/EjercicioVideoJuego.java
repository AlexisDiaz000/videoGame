
package ejerciciovideojuego.logica;

import java.util.ArrayList;
import java.util.List;


public class EjercicioVideoJuego {

   
    public static void main(String[] args) {
        
        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();
        
        VideoJuego video1 = new VideoJuego(123,"Banjo kazooie","Nintendo 64",4,"plataforma");
        
        VideoJuego video2 = new VideoJuego(456,"Mario Party 3","Nintendo 64",3,"plataforma");
        
        VideoJuego video3 = new VideoJuego(789,"Age of Empire II","PC",1,"plataforma");
        
        VideoJuego video4 = new VideoJuego(101,"Counter strike","PC",4,"plataforma");
        
        VideoJuego video5 = new VideoJuego(100,"Mario Kart 4","Nintendo 64",4,"plataforma");
        
        listaVideoJuegos.add(video1);
        listaVideoJuegos.add(video2);
        listaVideoJuegos.add(video3);
        listaVideoJuegos.add(video4);
        listaVideoJuegos.add(video5);
        
        for(VideoJuego video : listaVideoJuegos){
            System.out.println("Titulo: " +video.getTitulo()+ "Consola " +video.getConsola()+
                    "Cantidad Jugadores: " + video.getCantJugadores());
            
         video1.setTitulo("halo");
         video1.setCantJugadores(2);
         
         video2.setCantJugadores(3);
         video2.setTitulo("halo reach");
         
            
        }
        
        
    }
    
}
