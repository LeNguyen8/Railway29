package entity;

public class Position {
	public int id;
	public PositionName name;

	public enum PositionName {
		Dev, Test, Scrum_Master, PM
	}

	public Position(int i, PositionName name) {
		this.id = i;
		this.name = name;
	}

	public Position() {

	}

	public void printPosition() {
		System.out.println("Thông tin vị trí: " + id + ",tên :" + name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PositionName getName() {
		return name;
	}

	public void setName(PositionName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}

}
