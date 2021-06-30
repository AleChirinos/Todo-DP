package important2.filaB.ejercicio3Observer;

import java.util.ArrayList;
import java.util.List;

public class PostsWebPage implements IWebPage {
    private List<IUser> observerList= new ArrayList<>();
    private List<Post> postList = new ArrayList<>();

    public void uploadNewPost(Post post){
        postList.add(post);
        this.notifyObserver(post);
    }

    @Override
    public void attach(IUser observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUser observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(Post post) {
        for (IUser userPage:observerList) {
            if ((userPage.getTypePost().equals(post.getTypePost())) && (post.getTypePost().equals("VIDEO"))){
                userPage.update("Se subio un nuevo post: "+post.getTypePost(),post);
            }else if(userPage.getTypePost().equals("TODO")){
                userPage.update("Se subio un nuevo post: "+post.getTypePost(),post);
            }
        }
    }
}
