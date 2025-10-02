class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottle = numBottles;
        int drunk = numBottles;

        while (emptyBottle >= numExchange) {
            emptyBottle -= numExchange;
            numBottles = 1;
            numExchange++;
            drunk += numBottles;
            emptyBottle += numBottles;
            numBottles = 0;
        }

        return drunk;
    }
}
