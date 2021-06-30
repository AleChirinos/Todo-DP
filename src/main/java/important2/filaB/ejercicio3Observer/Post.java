package important2.filaB.ejercicio3Observer;

public class Post {
    private String typePost;
    private String time;
    private int numberOfViews;

    public Post(String typePost, String time, int numberOfViews){
        this.typePost=typePost;
        this.time=time;
        this.numberOfViews=numberOfViews;
    }

    public void showinfo(){
        System.out.println("Tipo de post: "+ typePost);
        System.out.println("Hora de la publicacion: "+ time);
        System.out.println("Numero de vistas: "+ numberOfViews);
    }

    public String getTypePost() {
        return typePost;
    }

    public void setTypePost(String typePost) {
        this.typePost = typePost;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
}
