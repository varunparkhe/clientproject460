package com.brianstempin.vindiniumclient.bot.advanced.murderbot;

import com.brianstempin.vindiniumclient.bot.advanced.Vertex;

public class NodeRecord {
  private Vertex node;
  private Connection connection;
  private int costSoFar;
  private int estimatedCostSoFar;

  public NodeRecord(Vertex node){
      this.node = node;
      this.connection = null;
      this.costSoFar = 0;
  }

  public NodeRecord(Vertex node, Connection connection, int costSoFar){
      this.node = node;
      this.connection = connection;
      this.costSoFar = costSoFar;
  }

  public NodeRecord(Vertex node, Connection connection, int costSoFar, int estimatedCostSoFar){
      this.node = node;
      this.connection = connection;
      this.costSoFar = costSoFar;
      this.estimatedCostSoFar = estimatedCostSoFar;
  }

  public Vertex getNode(){
      return this.node;
  }

  public Connection getConnection(){
      return this.connection;
  }

  public void setConnection(Connection c){
      this.connection = c;
  }


  public int getCostSoFar(){
      return this.costSoFar;
  }

  public void setCostSoFar(int csf){
      this.costSoFar = csf;
  }

  public int getEstimatedCostSoFar(){
      return this.estimatedCostSoFar;
  }

  public void setEstimatedCostSoFar(int etcf){
      this.estimatedCostSoFar = etcf;
  }
}
