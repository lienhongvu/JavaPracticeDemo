package com.lienhongvu.designpattern.statepattern;

/**
 * Created by hvlien on 1/9/2019.
 */
public class ShowPopup {

    private PopupState popupState;

    public ShowPopup(PopupState popupState) {
        this.popupState = popupState;
    }

    public void setPopupState(PopupState popupState) {
        this.popupState = popupState;
    }

    public void showPopup(){
        this.popupState.popup();
    }

    public static void main(String[] args) {
        ShowPopup popup = new ShowPopup(new PopupReadyState());
        popup.showPopup();
        popup.setPopupState(new PopupGoingState());
        popup.showPopup();
        popup.setPopupState(new PopupDoneState());
        popup.showPopup();
    }
}
