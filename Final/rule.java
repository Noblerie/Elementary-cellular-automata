package Final;
import java.io.*;


public class rule {

    private String _data;
    private String _fl;
    private int _loop;
    private int[] _status;

    rule(String filepath) throws IOException {
        this._status = new int[8];
        getFileData(filepath);
        setRules();
    }

    private void getFileData(String filepath) throws IOException {
        File fileName = new File(filepath);
        FileInputStream inFile = new FileInputStream(filepath);
        int fileLength = (int) fileName.length();

        byte Bytes[] = new byte[fileLength];

        inFile.read(Bytes);
        String file1 = new String(Bytes);
        this._data = file1;
        inFile.close();
    }

    private void setRules() {
        int y = 0;
        String[] Split = this._data.split("=");
 
        String[] Split2 = Split[1].split("\n");
        this._fl = Split2[0];
        
        Split2 = Split[2].split("\n");
        this._loop = Integer.parseInt(Split2[0]);

        for (int i=3; i < Split.length; i++){
            Split2 = Split[i].split("\n");
            this._status[y] = Integer.parseInt(Split2[0]);
            y++;
        }
    }

    public String getFirstline() {
        return this._fl;
    }

    public int getLoop() {
        return this._loop;
    }

    public int[] getStatus() {
        return this._status;
    }
}
