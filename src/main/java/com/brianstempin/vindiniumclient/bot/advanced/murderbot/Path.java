package com.brianstempin.vindiniumclient.bot.advanced.murderbot;

import java.util.LinkedList;

import com.brianstempin.vindiniumclient.bot.advanced.Vertex;

public class Path {
  private LinkedList<Vertex> vertices;

  public Path() {
      vertices = new LinkedList<>();
  }

  public void addToFront(Vertex v) {
      vertices.addFirst(v);
  }

  public void add(Vertex v){
      vertices.add(v);
  }

  public LinkedList<Vertex> getVertices() {
      return vertices;
  }
}
