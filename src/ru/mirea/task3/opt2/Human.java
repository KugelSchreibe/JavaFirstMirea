package ru.mirea.task3.opt2;

public class Human {
    private Human() {};

    private Leg LeftLeg, RightLeg;
    private Head HumanHead;
    private Hand LeftHand, RightHand;

    public Human(String colorHair, String shapeHead, int sizeLeftHand, int strengthLeftHand,
                 int sizeRightHand, int strengthRightHand, int sizeLeftLeg, int strengthLeftLeg,
                 int sizeRightLeg, int strengthRightLeg) {
        HumanHead = new Head(colorHair, shapeHead);
        LeftHand = new Hand(strengthLeftHand, sizeLeftHand);
        RightHand = new Hand(strengthRightHand, sizeRightHand);
        LeftLeg = new Leg(strengthLeftLeg, sizeLeftLeg);
        RightLeg = new Leg(strengthRightLeg, sizeRightLeg);
    }

    public Human(Head HumanHead, Hand LeftHand, Hand RightHand, Leg LeftLeg, Leg RightLeg) {
        this.HumanHead.setColorHair(HumanHead.getColorHair());
        this.HumanHead.setShapeHead(HumanHead.getShapeHead());

        this.LeftHand.setSize(LeftHand.getSize());
        this.LeftHand.setStrength(LeftHand.getStrength());

        this.RightHand.setSize(RightHand.getSize());
        this.RightHand.setStrength(RightHand.getStrength());

        this.LeftLeg.setSize(LeftLeg.getSize());
        this.LeftLeg.setStrength(LeftLeg.getStrength());

        this.RightLeg.setSize(RightLeg.getSize());
        this.RightLeg.setStrength(RightLeg.getStrength());

    }

    public String toString() {
        return "Human:\n" + HumanHead.toString() + "\n\nLeft hand {\n" + LeftHand.toString() + " }\n\nRight hand {\n" + RightHand.toString() +
                " }\n\nLeft leg {\n" + LeftLeg.toString() + " }\n\nRight leg {\n" + RightLeg.toString() + " }";
    }

    public String getColorHair() {
        return HumanHead.getColorHair();
    }

    public String getShapeHead() {
        return HumanHead.getShapeHead();
    }

    public void setColorHair(String colorHair) {
        HumanHead.setColorHair(colorHair);
    }

    public void setShapeHead(String shapeHead) {
        HumanHead.setShapeHead(shapeHead);
    }

    //--

    public int getStrengthLeftHand() {
        return LeftHand.getStrength();
    }

    public int getSizeLeftHand() {
        return LeftHand.getSize();
    }

    public void setStrengthLeftHand(int strength) {
        LeftHand.setStrength(strength);
    }

    public void setSizeLeftHand(int size) {
        LeftHand.setSize(size);
    }

    // --

    public int getStrengthRightHand() {
        return RightHand.getStrength();
    }

    public int getSizeRightHand() {
        return RightHand.getSize();
    }

    public void setStrengthRightHand(int strength) {
        RightHand.setStrength(strength);
    }

    public void setSizeRightHand(int size) {
        RightHand.setSize(size);
    }

    // --

    public int getStrengthLeftLeg() {
        return LeftLeg.getStrength();
    }

    public int getSizeLeftLeg() {
        return LeftLeg.getSize();
    }

    public void setStrengthLeftLeg(int strength) {
        LeftLeg.setStrength(strength);
    }

    public void setSizeLeftLeg(int size) {
        LeftLeg.setSize(size);
    }

    //--

    public int getStrengthRightLeg() {
        return RightLeg.getStrength();
    }

    public int getSizeRightLeg() {
        return RightLeg.getSize();
    }

    public void setStrengthRightLeg(int strength) {
        RightLeg.setStrength(strength);
    }

    public void setSizeRightLeg(int size) {
        RightLeg.setSize(size);
    }
}
