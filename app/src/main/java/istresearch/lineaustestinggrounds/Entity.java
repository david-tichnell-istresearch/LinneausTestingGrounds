package istresearch.lineaustestinggrounds;

import java.util.ArrayList;

/**
 * Created by Titch on 6/25/2015. Modified by Garrett on 7/23/2015
 */
public interface Entity
{

    class EntityClass
    {
        String nameOfClass;
        ArrayList<Link<EntityClass, EntityClass>> linksFromThisNode = new ArrayList<>();
        ArrayList<Link<EntityClass, EntityClass>> linksToThisNode = new ArrayList<>();

        /**
         * Null constructor
         */
        public EntityClass()
        {
        }

        /**
         * Sets the Java class name and will eventually create the class using java assist
         * Then deploys into the entities folder
         *
         * @param entName
         */
        public EntityClass(String entName)
        {
            this.nameOfClass = entName;
        }


        public void receiveLink(Link<EntityClass, EntityClass> link)
        {
            linksToThisNode.add(link);
        }

        /**
         * Adds the entity to the end of the linksFromThisNode list
         *
         * @param e
         */
        public void sendLink(EntityClass e)
        {
            Link<EntityClass, EntityClass> l = new Link<EntityClass, EntityClass>(this, e);
            linksFromThisNode.add(l);
        }

        /**
         * Inserts the link at the index in the linksFromThisNode list
         *
         * @param index
         * @param e
         */
        public void insertLink(int index, EntityClass e)
        {
            Link<EntityClass, EntityClass> l = new Link<EntityClass, EntityClass>(this, e);
            linksFromThisNode.add(index, l);
        }

        /**
         * Removes the element with the corresponding index if that element exists
         *
         * @param index
         */
        public void removeLink(int index)
        {
            if (linksFromThisNode.size() > 0 && linksFromThisNode.size() > index)
            {
                linksFromThisNode.remove(index);
            }
        }

        /**
         * An overloaded generic method intended to remove the first element if it exists.
         */
        public void removeLink()
        {
            if (linksFromThisNode.size() > 0)
            {
                linksFromThisNode.remove(0);
            }
        }

    }
}
