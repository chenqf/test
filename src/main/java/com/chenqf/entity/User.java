package com.chenqf.entity;


/**
 * @ClassName MemberAddress
 * @Description 
 * @author 
 * @date 2014-10-09 11:07:30
 */
public class User {

    /**
     * @fieldName id
     * @fieldType Long
     * @Description 主键
     */
    private Long id;
    /**
     * 名字
     */
    private String name;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
}
