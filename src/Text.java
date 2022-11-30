public class Text {

    public Text() {
    }

    public Text(String str) {
        if(isLimit(str)){
            this.str = str;
    
        }else{
            System.out.println("input exceed character limit");
        }
    
    }
    
    

    private String str;

    private boolean isLimit(String str) {
        char[] charArr = str.toCharArray();
        if (charArr.length <= 250) {
            return true;
        } else {
            return false;
        }
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
    if(isLimit(str)){
        this.str = str;

    }else{
        System.out.println("input exceed character limit");
    }
        
    }
}
