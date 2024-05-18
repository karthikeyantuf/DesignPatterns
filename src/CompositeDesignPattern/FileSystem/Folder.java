package CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {

    String name;
    List<FileSystem> fileSystemList;

    Folder(String name)
    {
        this.name = name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj)
    {
        fileSystemList.add(fileSystemObj);
    }

    public void ls()
    {
        System.out.println("Folder name :::"+name);
        for(FileSystem fileSystemObj : fileSystemList)
        {
            fileSystemObj.ls();
        }
    }
}
