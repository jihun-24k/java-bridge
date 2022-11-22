package bridge;

import java.util.List;

public class Bridge {
    private final List<String> blocks;

    public Bridge(List<String> blocks) {
        this.blocks = blocks;
    }

    public boolean canMove(int index, String moving) {
        if (blocks.get(index).equals(moving)) {
            return true;
        }
        return false;
    }

    public List<String> getBridge() {
        return blocks;
    }

    public int getBridgeSize() {
        return blocks.size();
    }
}
