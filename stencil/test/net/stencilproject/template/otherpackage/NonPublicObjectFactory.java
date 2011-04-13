package net.stencilproject.template.otherpackage;

/**
 * Creates a new package-protected or private object for testing.
 */
public class NonPublicObjectFactory {
	@SuppressWarnings("unused")
	private class PrivateObject {
		public int field = 2;
		protected int privateField = 3;

		public int getValue() {
			return 1;
		}
	}

	public Object getPackageProtectedObject() {
		return new PackageProtectedObject();
	}

	public Object getPrivateObject() {
		return new PrivateObject();
	}
}
