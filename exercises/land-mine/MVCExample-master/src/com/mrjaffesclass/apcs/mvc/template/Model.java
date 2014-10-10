package com.mrjaffesclass.apcs.mvc.template;

import java.util.*;
import com.mrjaffesclass.apcs.messages.*;

/**
 * The model represents the data that the app uses.
 * @author Roger Jaffe
 * @version 1.0
 */
public class Model implements MessageMailbox {

  // Messaging system for the MVC
  private final Messaging mvcMessaging;

  // Model's data variables
  private int variable1;
  private int variable2;

  /**
   * Model constructor: Create the data representation of the program
   * @param messages Messaging class instantiated by the Controller for 
   *   local messages between Model, View, and controller
   */
  public Model(Messaging messages) {
    mvcMessaging = messages;
  }
  
  /**
   * Initialize the model here and subscribe to any required messages
   */
  public void init() {
    mvcMessaging.subscribe("controller:changeButton", this);
    setVariable1(10);
    setVariable2(-10);
  }
  
  @Override
  public void messageHandler(String messageName, Object messagePayload) {
    if (messagePayload != null) {
      System.out.println("RCV (model): "+messageName+" | "+messagePayload.toString());
    } else {
      System.out.println("RCV (model): "+messageName+" | No data sent");
    }
    MessagePayload payload = (MessagePayload)messagePayload;
    int field = payload.getField();
    int direction = payload.getDirection();
    
    if (direction == Constants.UP) {
      if (field == 1) {
        setVariable1(getVariable1()+Constants.UP);
      } else {
        setVariable2(getVariable2()+Constants.UP);
      }
    } else {
      if (field == 1) {
        setVariable1(getVariable1()+Constants.DOWN);
      } else {
        setVariable2(getVariable2()+Constants.DOWN);
      }      
    }
  }

  /**
   * Getter function for variable 1
   * @return Value of variable1
   */
  public int getVariable1() {
    return variable1;
  }

  /**
   * Setter function for variable 1
   * @param v New value of variable1
   */
  public void setVariable1(int v) {
    variable1 = v;
    mvcMessaging.notify("model:variable1Changed", variable1, true);
  }
  
  /**
   * Getter function for variable 1
   * @return Value of variable2
   */
  public int getVariable2() {
    return variable2;
  }
  
  /**
   * Setter function for variable 2
   * @param v New value of variable 2
   */
  public void setVariable2(int v) {
    variable2 = v;
    mvcMessaging.notify("model:variable2Changed", variable2, true);
  }

}
