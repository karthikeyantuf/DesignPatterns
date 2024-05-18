package CompositeDesignPattern.FileSystem;

public class File implements FileSystem {
    String name;

    File(String name)
    {
        this.name = name;
    }

   public void ls()
    {
        System.out.println("File name :::"+name);
    }
}
