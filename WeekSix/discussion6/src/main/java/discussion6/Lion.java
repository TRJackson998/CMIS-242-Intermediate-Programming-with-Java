package discussion6;

class Lion extends Animal {
	// Overriding Method which results in dynamic binding
	@Override
	public void eat() {
		System.out.println("Lion eats");
	}
}