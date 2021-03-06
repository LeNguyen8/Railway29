package entity;
import java.time.LocalDate;
import java.util.Arrays;

public class Exam {
	public int id;
	public String code;
	public String title;
	public CategoryQuestion[] category;
	public int duration;
	public Account creator;
	public LocalDate createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public CategoryQuestion[] getCategory() {
		return category;
	}
	public void setCategory(CategoryQuestion[] category) {
		this.category = category;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Account getCreator() {
		return creator;
	}
	public void setCreator(Account creator) {
		this.creator = creator;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Exam [id=" + id + ", code=" + code + ", title=" + title + ", category=" + Arrays.toString(category)
				+ ", duration=" + duration + ", creator=" + creator + ", createDate=" + createDate + "]";
	}
	
	
}
