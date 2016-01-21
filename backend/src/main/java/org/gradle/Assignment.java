package org.gradle;

public class Assignment 
{
	public int assignment_id;
	public String gadget_name;
	public String model_name;
	public String status;
	public String additional_info;
	
	public Integer getAssignmentId()
	{
		return assignment_id;
	}
	public void setAssignemntId(Integer assignment_id)
	{
		this.assignment_id=assignment_id;	
	}
	public String getGadgetname()
	{
		return gadget_name;
	}
	public void setGadgetname(String gadget_name)
	{
		this.gadget_name=gadget_name;	
	}
	public String getModel_name()
	{
		return model_name;
	}
	public void setModel_name(String model_name)
	{
		this.model_name=model_name;
	}
	public String getStaus()
	{
		return status;
	}
	public void setassigned(String status)
	{
		this.status=status;	
	}
	public String getadditional_info()
	{
		return additional_info;
	}
	public void setaddiitonal_info(String additional_info)
	{
		this.additional_info=additional_info;
	}

}
