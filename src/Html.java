public class Html extends main {

    public String getTextArea(){
        String textArea = open("textarea") + " " + close("textarea");
        return textArea;
    }

    public String getTitle(String title){
        String makeTitle= open("Title") + title + close("Title");
        return  makeTitle;
    }
    public String getLabel(String label){
        String makeLabel = open("h1") + label + close("h1");
        return makeLabel;
    }
    public String getSubmitButton(){
        String submitButton = open("input" + " "+"type= submit"+" "+ "value=submit")+close("input");
        return submitButton;
    }

}

