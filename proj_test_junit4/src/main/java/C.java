import java.util.HashSet;

class C {
    HashSet<B> hashSet = new HashSet<>();

    public void setHashSet(HashSet<B> hashSet) {
        this.hashSet = hashSet;
    }

    public String hashsetToString() {
        return hashSet.toString();
    }

    public String helloC() {
        return "helloC";
    }

//	public static void main(String[] args) {
//		C c=new C();
//		c.setHashSet(new HashSet<D>(Arrays.asList(new D(1),
//													new D(2))));
//		System.out.println(c.hashsetToString());
//	}

}


