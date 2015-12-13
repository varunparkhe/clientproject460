package com.brianstempin.vindiniumclient.bot.advanced.murderbot;

import com.brianstempin.vindiniumclient.bot.advanced.Vertex;

public class Manhattan {
  private static int MIN_COST_ONE_SPACE = 1;
  private Vertex goalVertex;

  public Manhattan(Vertex goal){
      this.goalVertex = goal;
  }

  public void setGoalVertex(Vertex goal){
      this.goalVertex = goal;
  }

  public int estimate(Vertex start){
      int xdist = Math.abs(goalVertex.getPosition().getX() - start.getPosition().getX());
      int ydist = Math.abs(goalVertex.getPosition().getY() - start.getPosition().getY());
      return ((xdist + ydist) * MIN_COST_ONE_SPACE);
  }
}
