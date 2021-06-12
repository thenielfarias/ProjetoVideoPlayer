package projetovideoplayer;
public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula POO");
        v[1] = new Video("Aula Java");
        v[2] = new Video("Aula Python");
        
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Daniel", 30, "M", "thenielfarias");
        u[1] = new Usuario("Mauren", 27, "F", "maurenkruger");
        
        System.out.println("VIDEOS\n-------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[2].toString());
        System.out.println(v[2].toString());       
        System.out.println("USUARIOS\n-------------------------");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());        
                      
        Visualizacao vis[] = new Visualizacao[3];
        
        vis[0] = new Visualizacao(u[0], v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
                     
        vis[1] = new Visualizacao(u[0], v[2]);
        vis[1].avaliar(5);
        System.out.println(vis[1].toString());
        

    }    
}
