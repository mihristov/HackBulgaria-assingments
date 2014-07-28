public class Logger {
    protected int level;

    public Logger() {
        this.level = 3;
    }

    public Logger(int level) {
        if (level < 1) {
            throw new NumberFormatException("Integer out of range (<1)!");
        }
        this.level = level;
    }

    public void log(int level, String message) {
        if (level < 1) {
            throw new NumberFormatException("Integer out of range (<1)!");
        }

        if (level <= this.level) {
            System.out.println(String.format("%d => %s", level, message));
        }
    }

    public void log(String message) {
        final int defaultLevel = 3;
        if (defaultLevel <= this.level) {
            System.out.println(String.format("%d => %s", defaultLevel, message));
        }
    }

    public void setLevel(int newLevel) {
        if (newLevel < 1) {
            throw new NumberFormatException("Integer out of range (<1)!");
        }
        this.level = newLevel;
    }

}
