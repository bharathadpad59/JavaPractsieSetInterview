package com.practise.stream;

public class SchoolObj
{
    private String name;
    private String school;

    public SchoolObj()
    {
        this(null, null);
    }

    public SchoolObj(String nameStr, String schoolStr)
    {
        this.setName(nameStr);
        this.setSchool(schoolStr);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSchool()
    {
        return this.school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    @Override
    public String toString()
    {
        return this.getName() + ' ' + this.getSchool();
    }
    
    
    @Override
    public int hashCode() {
    	return this.name.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
    	SchoolObj res=(SchoolObj)obj;
    	return this.name.equals(res.getName());
    }
    
    
}
