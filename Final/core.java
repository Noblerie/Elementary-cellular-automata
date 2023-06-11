package Final;

import java.io.IOException;

//⬛⬜
public class core {
    private int _loop;
    private rule _rule;
    private String _currentLine;

    core(String filepath) throws IOException {
        this._rule = new rule(filepath);
        setLoop(_rule.getLoop());
        this._currentLine = this._rule.getFirstline();
        loop();
    }

    public int getLoop() {
        return this._loop;
    }

    public void setLoop(int loop) {
        if (loop > 0) {
            this._loop = loop;
        } else {
            this._loop = 1;
        }
    }

    public void loop() {
        line line = new line(this._currentLine, this._rule.getStatus());
        print print = new print();
        print.toPrint(this._currentLine);
        for (int i = 0; i < this._loop; i++) {
            this._currentLine = line.createLine(this._currentLine);
            print.toPrint(this._currentLine);
        }
    }

}
