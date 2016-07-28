package kr.susemi99.testrecyclerview.models;


public class HeaderModel extends BaseModel {
  public String name;

  public HeaderModel(String name) {
    this.name = name;
    this.isHeader = true;
  }
}
