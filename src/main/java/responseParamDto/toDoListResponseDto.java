package responseParamDto;

import java.util.Date;

public class toDoListResponseDto {
	//ID
	private String id;
	//タイトル
	private String title;
	//完了フラグ
	private boolean is_completed;
	//期限
	private Date due_date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isIs_completed() {
		return is_completed;
	}

	public void setIs_completed(boolean is_completed) {
		this.is_completed = is_completed;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
}
