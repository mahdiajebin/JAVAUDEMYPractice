package com.company.ArrayListvsList;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryListItem(String item) {
        //in array list use .add method to add values
        groceryList.add(item);

    }

    public void printGroceryListItem() {

        System.out.println("u have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " . " + groceryList.get(i));
        }

    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("grocery item " + (position + 1) + " has been modified.");

    }
    public  void modifyGroceryItem(String currentItem,String newItem) {
        int positon = findItem(currentItem);
        if(positon > 0 ){
            modifyGroceryItem(positon,newItem);
        }

    }
    public void removeGroceryList(String item){
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryList(position);
        }

    }

  private void removeGroceryList(int position){
        groceryList.remove(position);
    }

  private int findItem(String searchItem){
      //  boolean exist = groceryList.contains(searchItem);
      return  groceryList.indexOf(searchItem);

    }

  public boolean onFile(String searchItem) {
      int position = findItem(searchItem);
      if (position >= 0) {
        return true;
      }
      return false;
  }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
