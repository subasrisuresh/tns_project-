package com.tns.Certificateservice;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Certificate
{
	private Integer C_id;
	private String S_name;
      private String I_name;
	
	
	public Certificate() 
	{
		super();
	}
	
	public Certificate(Integer c_id, String s_name, String i_name)
	{
		super();
		C_id = c_id;
		S_name = s_name;
            I_name = i_name;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getC_id() {
		return C_id;
	}
	public void setC_id(Integer c_id) {
		C_id = c_id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name)
	{
		S_name = s_name;
	}
      public String getI_name() {
		return I_name;
	}
	public void setI_name(String i_name)
	{
		I_name = i_name;
	}
	@Override
	public String toString()
	{
		return "Student[Certificate id:"+C_id+" Student name"+S_name+" Institute name"+I_name+"]";
	}
}
