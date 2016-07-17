/**
 * Created by Vertig0 on 17.07.2016.
 */
public class FileWalker {

    public static void main(String[] args){

        String[] command= {"-p","GD:\\"} ;
        PathOperations po = new PathOperations(command[0],command[1]);
        po.readFile();
    }





}
