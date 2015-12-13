package com.brianstempin.vindiniumclient.bot.advanced.murderbot;

import com.brianstempin.vindiniumclient.bot.advanced.Vertex;

public class Connection {

  private Vertex sourceNode;
  private Vertex sinkNode;
  private int weight;

  public Connection(Vertex sourceNode, Vertex sinkNode){
      this.sourceNode = sourceNode;
      this.sinkNode = sinkNode;
      this.weight = 1;
  }

  public Vertex getSourceNode(){
      return this.sourceNode;
  }

  public Vertex getSinkNode(){
      return this.sinkNode;
  }




}
