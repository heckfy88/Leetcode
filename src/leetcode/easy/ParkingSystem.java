package leetcode.easy;

// No. 1603

public class ParkingSystem {
    int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        int quantity = 0;
        if (carType == 1) {
                this.big--;
                quantity = this.big;
        } else if (carType == 2) {
                this.medium--;
                quantity = this.medium;
        } else if (carType == 3) {
                this.small--;
                quantity = this.small;
        }
        return quantity >= 0;
    }
}
