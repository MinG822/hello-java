package generics;

public class Material {
	private String material;
	
	public Material(String material) {
		this.material = material;
	}
	
	public String doPrinting() {
		return material + " ���� ����մϴ�";
	}
	
	public String toString() {
		return "���� "+ material +" �Դϴ�";
	}
}
