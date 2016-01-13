package org.gradle;

public class Gadget {

public int gadget_id;
public String gadget_name;
public String model_type;
public String serial_number;
public String purchase_date;
public String warranty_date;
public String additional_info;

public int getGadgetid()
{
return gadget_id;	
}
public void setGadgetid(int gadget_id)
{
this.gadget_id= gadget_id;	
}
public String getGadgetname()
{
return gadget_name;
}
public void setGadgetname(String gadget_name)
{
this.gadget_name=gadget_name;	
}
public String getModeltype()
{
return model_type;	
}
public void setModletype(String model_type)
{
this.model_type=model_type;	
}
public String getSerialnumber()
{
return serial_number;	
}
public void setSerialnumber(String serial_number)
{
this.serial_number = serial_number;	
}
public String getPurchasedate()
{
return purchase_date;	
}
public void setPurchasedate(String purchase_date)
{
this.purchase_date=purchase_date;	
}
public String getWarrantydate()
{
return warranty_date;	
}
public void setWarrantydate(String warranty_date)
{
this.warranty_date=warranty_date;	
}
public String getAdditionalinfo()
{
return additional_info;
}
public void setAdditionalinfo(String additional_info)
{
this.additional_info=additional_info;	
}
}
