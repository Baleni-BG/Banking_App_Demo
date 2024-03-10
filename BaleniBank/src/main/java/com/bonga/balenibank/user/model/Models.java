package com.bonga.balenibank.user.model;
import com.bonga.balenibank.user.views.ViewFactory;


public class Models 
{

  private  final ViewFactory view;
  private static Models model;
  
  private Models(){ view=new ViewFactory();}
  
  public synchronized static Models getInstance()
  {
    if (model==null){
        model=new Models();
        System.out.println("new model");
    }
    return model;
  }
  
  public  ViewFactory getView()
  {
      
      return view;
  }
        
        
        
   
}
