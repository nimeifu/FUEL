public class FuelDepot {
    public int nextTankToFillA(int threshold) {
        int minTankIndex = this.filler.getCurrentIndex();
        for (int i = 0; i < this.tanks.size(); i++) {
            if (this.tanks.get(i).getFuelLevel() <= threshold &&
                    this.tanks.get(i).getFuelLevel() <
                            this.tanks.get(minTankIndex).getFuelLevel()) {
                minTankIndex = i;
            }
        }
        return minTankIndex;
    }

    public void moveToLocation(int locIndex)
    {
        if (this.filler.getCurrentIndex() > locIndex) {
            if (this.filler.isFacingRight()) {
                this.filler.changeDirection();
            }
            this.filler.moveForward(this.filler.getCurrentIndex() - locIndex);
        }
        if (this.filler.getCurrentIndex() < locIndex) {
            if (!this.filler.isFacingRight()) {
                this.filler.changeDirection();
            }
            this.filler.moveForward(locIndex - this.filler.getCurrentIndex());
        }
    }
}
