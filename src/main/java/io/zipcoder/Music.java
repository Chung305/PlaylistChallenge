package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

            int count = 0;
            int count2 = 0;
            int result;

        for(int i = startIndex; i < playList.length; i ++){
            if(i != 0){
                if(playList[i].equals(selection))
                 break;
                else
                 count++;
            }else if(i == 0){
                i = playList.length-1;
                if(playList[i].equals(selection)){
                    count2++;
                }
            }
        }


        if(count > count2)
            return count;


        return count2;
    }
}
