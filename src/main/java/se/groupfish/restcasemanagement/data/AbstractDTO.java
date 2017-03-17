package se.groupfish.restcasemanagement.data;

public abstract class AbstractDTO {
	
	private final Long id;
	
	public AbstractDTO(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}	
}
