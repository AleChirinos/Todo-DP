package important2.filaB.ejercicio3Observer;

public class Client {
    public static void main (String []args){

        PostsWebPage postsWebPage = new PostsWebPage();

        RegisteredUser user1= new RegisteredUser(new Person("Alejandra","Ale", "alecita2702@gmail.com"), "VIDEO");
        RegisteredUser user2= new RegisteredUser(new Person("Juan","Juanqui", "j4567@yahoo.com"), "VIDEO");
        RegisteredUser user3= new RegisteredUser(new Person("Pedro","Pe", "pedro.picapiedra@gmail.com"), "TODO");
        RegisteredUser user4= new RegisteredUser( new Person("Sofia","Sofi", "sofioficial@hotmail.com"), "VIDEO");
        RegisteredUser user5= new RegisteredUser(new Person("Jose","Jos", "jose4020@hotmail.com"), "TODO");

        postsWebPage.attach(user1);
        postsWebPage.attach(user2);
        postsWebPage.attach(user3);
        postsWebPage.attach(user4);
        postsWebPage.attach(user5);

        postsWebPage.uploadNewPost(new Post("VIDEO","16:40", 70));
        postsWebPage.uploadNewPost(new Post("VIDEO","17:40", 80));
        postsWebPage.uploadNewPost(new Post("IMAGEN","18:40", 100));
        postsWebPage.uploadNewPost(new Post("IMAGEN","19:40", 200));
    }
}
