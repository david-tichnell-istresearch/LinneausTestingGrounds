package istresearch.lineaustestinggrounds.Entities;

import java.util.ArrayList;

import istresearch.lineaustestinggrounds.Entity;

/**
 * Created by Titch on 6/25/2015.
 */
public class Question extends Entity
{
    private String question;

    public Question(String q)
    {
        question = q;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String q)
    {
        question = q;
    }

    /*@Override
    public void sendLink(Entity e)
    {
        Link<Entity, Entity> l = new Link<Entity, Entity>(this, e);
        linksFromThisNode.add(l);
    }*/
}
