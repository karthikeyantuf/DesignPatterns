package CompositeDesignPattern.FileSystem;

public class Client {
    public static void main(String args[])
    {
        Folder folder = new Folder("Movie");
        Folder comedyMovieFolder = new Folder("ComedyMovie");

        File file= new File("Harry Potter");
        folder.add(file);

        File file1 = new File("Hang Over");
        comedyMovieFolder.add(file1);
        folder.add(comedyMovieFolder);

        folder.ls();

    }
}
