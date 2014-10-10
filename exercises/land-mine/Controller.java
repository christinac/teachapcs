package com.mrjaffesclass.apcs.mvc.template;
import com.mrjaffesclass.apcs.messages.*;

/**
 * 
 * The Controller is the master of the App you're writing. It instantiates the
 * view and the model, receives messages from the View in response to user
 * interface (UI) actions like clicking a button, changing an input field, 
 * etc.  It also sends and receives messages to the Model to commuincate
 * changes required and changes made to the Model variables.  
 *
 * @author Roger Jaffe
 * @version 1.0
 */
public class Controller implements MessageMailbox {

  private final Messaging mvcMessaging;

  /**
   * Controller constructor The Controller is responsible for creating the View
   * and the Model that it will be controlling. The mvcMessaging object is
   * passed to the view and the model and is used as a local messenger
   * between the Controller, Model and View without have direct access to the
   * View and Model.  Remember, you want the three components separated so
   * that one class works independently of the others.
   *
   * Messages that can be received in the Controller:
   *  view:toggleButtonClick (sent by the View when the toggle button is clicked)
   *  view:buttonClick (sent by the View when the regular button is clicked)
   *  view:changeButton (sent by the View when the Up or Down buttons are clicked)
   * Message that are sent from the Controller:
   *  controller:changeButton (sent by the Controller to notify the Model to change 
   *    the value of a Model variable
   */
  public Controller() {
    // Create the local messaging class
    mvcMessaging = new Messaging();

    // Create the view and set it visible
    View view = new View(mvcMessaging);    // This creates our view
    view.init();
    view.setVisible(true);

    // Create the model
    Model model = new Model(mvcMessaging);  // This creates our model
    model.init();
  }

  /**
   * Initialize the model here and subscribe
   * to any required messages
   * 
   * "this" refers to this controller object.
   */
  public void init() {
    mvcMessaging.subscribe("view:toggleButtonClick", this);
    mvcMessaging.subscribe("view:buttonClick", this); 
    mvcMessaging.subscribe("view:changeButton", this);
  }

  @Override
  public void messageHandler(String messageName, Object messagePayload) {
    // Only handle the changeValue1 and changeValue2 messages
    if (messagePayload != null) {
      System.out.println("RCV (controller): "+messageName+" | "+messagePayload.toString());
    } else {
      System.out.println("RCV (controller): "+messageName+" | No data sent");
    }
    if (messageName.equals("view:changeButton")) {
      mvcMessaging.notify("controller:changeButton", messagePayload, true);          
    }
  }

  /**
   * Program entry -- main is called when the program starts
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Controller app = new Controller();  // Create our controller...
    app.init();                         // ...and init it too
  }
  
}
