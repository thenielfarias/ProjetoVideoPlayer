package projetovideoplayer;
public class Video implements AcoesVideo {
    private String titulo;
    private int review, views, likes;
    private boolean reproduzindo;
    
    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setReview(1);
        this.setViews(0);
        this.setLikes(0);
        this.setReproduzindo(false);
    }    
   
    public String getTitulo() {
        return titulo;
    }    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getReview() {
        return review;
    }
    public void setReview(int review) {
        /*int nova;
        nova = (int) ((this.review + review)/this.views);
        this.review = nova;*/
        this.review = review;
    }
    
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    @Override
    public void play() {
        this.reproduzindo = true;    
    }    
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    @Override
    public void like() {
        this.likes ++ ;
    }
    
    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", review=" + 
                review + ", views=" + views + ", likes=" + 
                likes + ", reproduzindo=" + reproduzindo + '}';
    }    
}
