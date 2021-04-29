package generics;

public class Material {
	private String material;
	
	public Material(String material) {
		this.material = material;
	}
	
	public String doPrinting() {
		return material + " 재료로 출력합니다";
	}
	
	public String toString() {
		return "재료는 "+ material +" 입니다";
	}
}
