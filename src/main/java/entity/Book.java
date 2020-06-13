package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;


public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	
	private int bookId;
	
	
	
	private String bookParentId;
	
	
	
	private String bookName;
	
	
	
	private List<Integer> bookRuleIds;
	
	
	
	private String bookType;
	
	
	
	private String bookIndustryName;
	
	
	
	private String bookSectorName;
	
	
	
	private String bookStatus;
	
	
	
	private String bookVersion;
	
	
	
	private String bookCreatedBy;
	
	
	
	private String bookCreatedAt;
	
	
	
	private String bookUpdatedBy;
	
	
	
	private String bookUpdatedAt;
	
	
	
	List<Template> templates = new ArrayList<Template>();
	
	
	
	List<BookUser> users = new ArrayList<BookUser>();
	
	public Book() {

	}

	/**
	 * @param bookId
	 * @param bookParentId
	 * @param bookName
	 * @param bookRuleIds
	 * @param bookType
	 * @param bookIndustryName
	 * @param bookSectorName
	 * @param bookStatus
	 * @param bookVersion
	 * @param bookCreatedBy
	 * @param bookCreatedAt
	 * @param bookUpdatedBy
	 * @param bookUpdatedAt
	 * @param templates
	 * @param users
	 */
	public Book( int bookId,  String bookParentId,  String bookName,
			 List<Integer> bookRuleIds,  String bookType,  String bookIndustryName,
			 String bookSectorName,  String bookStatus,  String bookVersion,
			 String bookCreatedBy,  String bookCreatedAt,  String bookUpdatedBy,
			 String bookUpdatedAt,  List<Template> templates,  List<BookUser> users) {
		super();
		this.bookId = bookId;
		this.bookParentId = bookParentId;
		this.bookName = bookName;
		this.bookRuleIds = bookRuleIds;
		this.bookType = bookType;
		this.bookIndustryName = bookIndustryName;
		this.bookSectorName = bookSectorName;
		this.bookStatus = bookStatus;
		this.bookVersion = bookVersion;
		this.bookCreatedBy = bookCreatedBy;
		this.bookCreatedAt = bookCreatedAt;
		this.bookUpdatedBy = bookUpdatedBy;
		this.bookUpdatedAt = bookUpdatedAt;
		this.templates = templates;
		this.users = users;
	}

	/**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the bookParentId
	 */
	public String getBookParentId() {
		return bookParentId;
	}

	/**
	 * @param bookParentId the bookParentId to set
	 */
	public void setBookParentId(String bookParentId) {
		this.bookParentId = bookParentId;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the bookRuleIds
	 */
	public List<Integer> getBookRuleIds() {
		return bookRuleIds;
	}

	/**
	 * @param bookRuleIds the bookRuleIds to set
	 */
	public void setBookRuleIds(List<Integer> bookRuleIds) {
		this.bookRuleIds = bookRuleIds;
	}

	/**
	 * @return the bookType
	 */
	public String getBookType() {
		return bookType;
	}

	/**
	 * @param bookType the bookType to set
	 */
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	/**
	 * @return the bookIndustryName
	 */
	public String getBookIndustryName() {
		return bookIndustryName;
	}

	/**
	 * @param bookIndustryName the bookIndustryName to set
	 */
	public void setBookIndustryName(String bookIndustryName) {
		this.bookIndustryName = bookIndustryName;
	}

	/**
	 * @return the bookSectorName
	 */
	public String getBookSectorName() {
		return bookSectorName;
	}

	/**
	 * @param bookSectorName the bookSectorName to set
	 */
	public void setBookSectorName(String bookSectorName) {
		this.bookSectorName = bookSectorName;
	}

	/**
	 * @return the bookStatus
	 */
	public String getBookStatus() {
		return bookStatus;
	}

	/**
	 * @param bookStatus the bookStatus to set
	 */
	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	/**
	 * @return the bookVersion
	 */
	public String getBookVersion() {
		return bookVersion;
	}

	/**
	 * @param bookVersion the bookVersion to set
	 */
	public void setBookVersion(String bookVersion) {
		this.bookVersion = bookVersion;
	}

	/**
	 * @return the bookCreatedBy
	 */
	public String getBookCreatedBy() {
		return bookCreatedBy;
	}

	/**
	 * @param bookCreatedBy the bookCreatedBy to set
	 */
	public void setBookCreatedBy(String bookCreatedBy) {
		this.bookCreatedBy = bookCreatedBy;
	}

	/**
	 * @return the bookCreatedAt
	 */
	public String getBookCreatedAt() {
		return bookCreatedAt;
	}

	/**
	 * @param bookCreatedAt the bookCreatedAt to set
	 */
	public void setBookCreatedAt(String bookCreatedAt) {
		this.bookCreatedAt = bookCreatedAt;
	}

	/**
	 * @return the bookUpdatedBy
	 */
	public String getBookUpdatedBy() {
		return bookUpdatedBy;
	}

	/**
	 * @param bookUpdatedBy the bookUpdatedBy to set
	 */
	public void setBookUpdatedBy(String bookUpdatedBy) {
		this.bookUpdatedBy = bookUpdatedBy;
	}

	/**
	 * @return the bookUpdatedAt
	 */
	public String getBookUpdatedAt() {
		return bookUpdatedAt;
	}

	/**
	 * @param bookUpdatedAt the bookUpdatedAt to set
	 */
	public void setBookUpdatedAt(String bookUpdatedAt) {
		this.bookUpdatedAt = bookUpdatedAt;
	}

	/**
	 * @return the templates
	 */
	public List<Template> getTemplates() {
		return templates;
	}

	/**
	 * @param templates the templates to set
	 */
	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	/**
	 * @return the users
	 */
	public List<BookUser> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<BookUser> users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookCreatedAt == null) ? 0 : bookCreatedAt.hashCode());
		result = prime * result + ((bookCreatedBy == null) ? 0 : bookCreatedBy.hashCode());
		result = prime * result + bookId;
		result = prime * result + ((bookIndustryName == null) ? 0 : bookIndustryName.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + ((bookParentId == null) ? 0 : bookParentId.hashCode());
		result = prime * result + ((bookRuleIds == null) ? 0 : bookRuleIds.hashCode());
		result = prime * result + ((bookSectorName == null) ? 0 : bookSectorName.hashCode());
		result = prime * result + ((bookStatus == null) ? 0 : bookStatus.hashCode());
		result = prime * result + ((bookType == null) ? 0 : bookType.hashCode());
		result = prime * result + ((bookUpdatedAt == null) ? 0 : bookUpdatedAt.hashCode());
		result = prime * result + ((bookUpdatedBy == null) ? 0 : bookUpdatedBy.hashCode());
		result = prime * result + ((bookVersion == null) ? 0 : bookVersion.hashCode());
		result = prime * result + ((templates == null) ? 0 : templates.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookCreatedAt == null) {
			if (other.bookCreatedAt != null)
				return false;
		} else if (!bookCreatedAt.equals(other.bookCreatedAt))
			return false;
		if (bookCreatedBy == null) {
			if (other.bookCreatedBy != null)
				return false;
		} else if (!bookCreatedBy.equals(other.bookCreatedBy))
			return false;
		if (bookId != other.bookId)
			return false;
		if (bookIndustryName == null) {
			if (other.bookIndustryName != null)
				return false;
		} else if (!bookIndustryName.equals(other.bookIndustryName))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (bookParentId == null) {
			if (other.bookParentId != null)
				return false;
		} else if (!bookParentId.equals(other.bookParentId))
			return false;
		if (bookRuleIds == null) {
			if (other.bookRuleIds != null)
				return false;
		} else if (!bookRuleIds.equals(other.bookRuleIds))
			return false;
		if (bookSectorName == null) {
			if (other.bookSectorName != null)
				return false;
		} else if (!bookSectorName.equals(other.bookSectorName))
			return false;
		if (bookStatus == null) {
			if (other.bookStatus != null)
				return false;
		} else if (!bookStatus.equals(other.bookStatus))
			return false;
		if (bookType == null) {
			if (other.bookType != null)
				return false;
		} else if (!bookType.equals(other.bookType))
			return false;
		if (bookUpdatedAt == null) {
			if (other.bookUpdatedAt != null)
				return false;
		} else if (!bookUpdatedAt.equals(other.bookUpdatedAt))
			return false;
		if (bookUpdatedBy == null) {
			if (other.bookUpdatedBy != null)
				return false;
		} else if (!bookUpdatedBy.equals(other.bookUpdatedBy))
			return false;
		if (bookVersion == null) {
			if (other.bookVersion != null)
				return false;
		} else if (!bookVersion.equals(other.bookVersion))
			return false;
		if (templates == null) {
			if (other.templates != null)
				return false;
		} else if (!templates.equals(other.templates))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookParentId=" + bookParentId + ", bookName=" + bookName + ", bookRuleIds="
				+ bookRuleIds + ", bookType=" + bookType + ", bookIndustryName=" + bookIndustryName
				+ ", bookSectorName=" + bookSectorName + ", bookStatus=" + bookStatus + ", bookVersion=" + bookVersion
				+ ", bookCreatedBy=" + bookCreatedBy + ", bookCreatedAt=" + bookCreatedAt + ", bookUpdatedBy="
				+ bookUpdatedBy + ", bookUpdatedAt=" + bookUpdatedAt + ", templates=" + templates + ", users=" + users
				+ "]";
	}

	
}