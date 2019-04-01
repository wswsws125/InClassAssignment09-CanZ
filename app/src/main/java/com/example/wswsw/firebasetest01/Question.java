package com.example.wswsw.firebasetest01;

public class Question {
    public String location;
    public String question;
    public int photoId;
    public boolean isTrue;

    public String getLocation(){return location;}

    public String getQuestion(){return question;}

    public int getPhotoId(){return photoId;}

    public boolean getIsTrue(){return isTrue;}

    public void setLocation(String location){this.location=location;}
    public void setQuestion(String question){this.question=question;}
    public void setPhotoId(int photoId){this.photoId=photoId;}
    public void setIsTrue(boolean aTrue){this.isTrue=aTrue;}

    public Question(String location, String question, int photoId, boolean isTrue){
        this.location = location;
        this.question = question;
        this.photoId = photoId;
        this.isTrue = isTrue;
    }

    public Question() {
    }

    public String toString(){
        return "Location:"+location+"\nQuestion"+question+"\nAnswer"+isTrue;
    }

}
