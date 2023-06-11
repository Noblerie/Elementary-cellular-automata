package Final;

public class line {
    private String _currentLine;
    private int[] _status;

    line(String currentLine, int[] status) {
        this._currentLine = currentLine;
        this._status = status;
    }

    public String createLine(String currentLine) {
        StringBuilder sb = new StringBuilder();
        char[] split = currentLine.toCharArray();

        for (int i=0; i < split.length; i++) {
            if (split[i] == '0') {
                sb.append(squareBlack(i, split.length, split));
            } else {
                sb.append(squareWhite(i, split.length, split));
            }
        }
        
        return sb.toString();
    }

    public char squareBlack(int i, int length, char[] split) {
        int before;
        int now = split[i];
        int after;

        if (i == 0) {
            before = 0;    
        } else {
            before = split[i - 1];
        }
        if (i >= length -1) {
            after = 0;
        } else {
            after = split[i + 1];
        }

        if (before == '0' && now == '0' && after == '0') {
            return (char)(this._status[0] + '0');
        }
        if (before == '0' && now == '0' && after == '1') {
            return (char)(this._status[1] + '0');
        }
        if (before == '1' && now == '0' && after == '0') {
            return (char)(this._status[2] + '0');
        }
        if (before == '1' && now == '0' && after == '1') {
            return (char)(this._status[3] + '0');
        }
        return '0';
    }

    public char squareWhite(int i, int length, char[] split) {
        int before;
        int now = split[i];
        int after;

        if (i == 0) {
            before = 0;    
        } else {
            before = split[i - 1];
        }
        if (i >= length - 1) {
            after = 0;
        } else {
            after = split[i + 1];
        }

        if (before == '0' && now == '1' && after == '0') {
            return (char)(this._status[4] + '0');
        }
        if (before == '0' && now == '1' && after == '1') {
            return (char)(this._status[5] + '0');
        }
        if (before == '1' && now == '1' && after == '0') {
            return (char)(this._status[6] + '0');
        }
        if (before == '1' && now == '1' && after == '1') {
            return (char)(this._status[7] + '0');
        }
        return '0';
    }
}
