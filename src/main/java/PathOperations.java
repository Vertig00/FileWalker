import java.io.File;

/**
 * Created by Vertig0 on 17.07.2016.
 */
public class PathOperations {

    private String param;
    private String path;
    private File[] fileList;
    private File starterFile;

    public PathOperations(String param, String path) {
        this.param = param;
        this.path = path;
        starterFile = new File(this.param);

    }

    public void readFile(){
        File file = new File(path);
        if(file.isFile() || file.isDirectory()){
            fileList = file.listFiles();
            readAllFiles(file);
        }else{
            System.out.println("Nie ma takiego pliku");
            return;
        }
    }


    private void readAllFiles(File file){
        File[] files = file.listFiles();

        if (files == null){
            return;
        }

        for (File f:files) {
            if (f.isDirectory()){
                System.out.println("Folder: " + f.getAbsolutePath());
                readAllFiles(f);
            }else {
                System.out.println("Plik: " + f.getAbsolutePath());
            }
        }
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public File[] getFileList() {
        return fileList;
    }

    public void setFileList(File[] fileList) {
        this.fileList = fileList;
    }
}
