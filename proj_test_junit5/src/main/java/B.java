public class B {
    private int bNum;

    public B() {
        bNum=0;
    }

    public B(int bNum) {
        this.bNum = bNum;
    }

    public int getbNum() {
        return bNum;
    }

    public void setbNum(int bNum) {
        this.bNum = bNum;
    }

    public String helloB(){
        return "helloB";
    }

    @Override
    public String toString() {
        return bNum+"";
    }
}
