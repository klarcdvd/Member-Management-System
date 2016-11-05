/*
*Created by Chanaka fernando
*Email <nuwan.c.fernando@gmail.com>
*This class should be placed under the view pacakage of the project
*/
package model;


public class Member {
    private String name;
    //private String bYear;
    //private String bMonth;
    private String bDate;
    private String gender;
    private String faculty;
    private String dept;
    private String index;
    private String eMail;
    private String mNumber;
    private String hNumber;
    private String address;
    private String bGroup;
    private String allergies;
    private String mCondition;
    //private blob =img;
    private String howGet;
    private String experience;
    private String regDate;
    private String society;
    private String skills;
    private String motives;
    private String kinship;
    private String kinshipNumber;
    private String kinshipName;
    
    
    public Member(){
    }
    
    public Member(String name,String bDate,String index,String gender,String faculty,String dept,String eMail,String mNumber,String hNumber,String address,String bGroup,String allergies,String smCondition,String howget,String experience,String regDate,String society,String skills,String motives,String kinshipName,String kinship,String kinNumber){
     this.name=name;
     this.index=index;
     //this.bYear=bYear;
     //this.bMonth=bMonth;
     this.bDate=bDate;
     this.gender=gender;
     this.faculty=faculty;
     this.dept=dept;
     this.eMail=eMail;
     this.mNumber=mNumber;
     this.hNumber=hNumber;
     this.address=address;
     this.bGroup=bGroup;
     this.allergies=allergies;
     this.mCondition=smCondition;
     this.howGet=howget;
     this.experience=experience;
     this.regDate=regDate;
     this.society=society;
     this.skills=skills;
     this.motives=motives;
     this.kinship=kinship;
     this.kinshipName=kinshipName;
     this.kinshipNumber=kinNumber;
     
    }
    //geters
    public String getName() {
        return name;
    }
    
    public String getBdate(){
       return bDate;
        
    }
    public String getGender(){
        return gender;
    }
    public String getFaculty(){
        return faculty;
    }
    public String getDepartment(){
         return dept;
    }
    public String getIndex(){
        return index;
    }
    public String getEmail(){
        return  eMail;
    }
    
    public String getMobile(){
        return mNumber;
    }
    
    public String getHomeNumber(){
        return hNumber;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getBloodGroup(){
        return bGroup;
    }
    public String getAllergies(){
        return allergies;
    }
    
    public String getMedicalCondition(){
        return mCondition;
    }
    public String getHowGet(){
        return howGet;
    }
    public String getExperience(){
        return experience;
    }
    public String getRegisterdDate(){
        return regDate;
    }
    public String getRelatedSociety(){
        return society;
    }
    public String getSkills(){
        return skills;
    }
    public String getMotives(){
        return motives;
    }
    public String getKinship(){
        return kinship;
    }
    public String getKinshipName(){
        return kinshipName;
    }
    public String getKmNumber(){
        return kinshipNumber;
    }
    //setters......
    public void setName(String name) {
        this.name = name;
    }
    public void setIndex(String index){
        this.index=index;
    }
    
    
    
     
}
