package topic06.jcf_exercises.facebook.impl;

import topic06.jcf_exercises.facebook.interfaces.EdgeFactory;
import topic06.jcf_exercises.facebook.interfaces.IGraph;
import topic06.jcf_exercises.facebook.interfaces.VertexFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import topic06.jcf_exercises.facebook.interfaces.IVertex;

public class FacebookGraph 
implements IGraph<FacebookUser, FriendshipRelation> {
    
    private Set<FacebookUser> users=new HashSet<FacebookUser>();
    private Set<FriendshipRelation> relations=new HashSet<FriendshipRelation>();

    private FacebookRelationFactory facebookRelationFactory = new FacebookRelationFactory();
    private FacebookUserFactory facebookUserFactory = new FacebookUserFactory();
    
    
    
    
    /*************************************
     * question 05: 
     * Making the class a single instance 
     **************************************/
    
    
    
    
    /***********************************/
    
    public FacebookGraph(){ 
    }

    
    /*************************************
     * question 02: 
     * method: addUser 
     **************************************/
    public boolean addUser(int id, String name, String email){
        FacebookUser facebook_user = (FacebookUser) facebookUserFactory.create(id, name);
        facebook_user.setEmail(email);
        boolean b = users.add(facebook_user);
        return b;
    }



    
    
    
    /***********************************/
    public Set<FacebookUser> getUsers(){
        return getVertices();
    }
    
    public Set<FriendshipRelation> getRelations(){
        return getEdges();
    }
    
    public boolean addUser(FacebookUser user){
        return users.add(user);
    }
    
    public FacebookUser getUser (int userID){
        Iterator <FacebookUser>it = users.iterator();
        while (it.hasNext()){
            FacebookUser u = it.next();
            if (u.getID()==userID)
                return u;
        }
        return null;
    }
    /*************************************
     * question 03: 
     * two methods: addFriend 
     **************************************/
     public boolean addFriend(FacebookUser user1, FacebookUser user2){
         FriendshipRelation friendship_relation = 
                 facebookRelationFactory.create(user1, user2);
         boolean b = relations.add(friendship_relation);
         return b;
     }
     
     public boolean addFriend(int userID1, int userID2){
         FacebookUser facebookUser1 = null;
         FacebookUser facebookUser2 = null;
         for(FacebookUser user:users){
             if (user.getID() == userID1)
                 facebookUser1 = user;
             if (user.getID() == userID2)
                 facebookUser2 = user;             
         }
         if ((facebookUser1 == null )|| (facebookUser2 == null))
             return false;
         
         return addFriend(facebookUser1, facebookUser2);
         
     }
    /***********************************/
        
    @Override
    public Set<FacebookUser> getVertices() {
        return users;
    }

    @Override
    public Set<FriendshipRelation> getEdges() {
        return relations;
    }

    @Override
    public void setVertices(Set<FacebookUser> vertices) {
        users= vertices;
    }

    @Override
    public void setEdges(Set<FriendshipRelation> edges) {
        relations = edges;
    }

    @Override
    public void addVertex(FacebookUser v) {
        users.add(v);
    }

    @Override
    public void addEdge(FriendshipRelation v) {
        relations.add(v);
    }

    @Override
    public FriendshipRelation addEdge(FacebookUser sourceVertex, FacebookUser targetVertex) {
        FriendshipRelation fr = facebookRelationFactory.create(sourceVertex, targetVertex);
        relations.add(fr);
        return fr;
    }

    @Override
    public boolean containsEdge(FacebookUser sourceVertex, FacebookUser targetVertex) {
        Iterator <FriendshipRelation> it = relations.iterator();
        while (it.hasNext()){
            FriendshipRelation fr = it.next();
            boolean c1 = (fr.getSource().equals(sourceVertex));
            boolean c2 = (fr.getTarget().equals(targetVertex));
           
            if (c1 && c2)
                return true;
            
        }
        return false;
    }
    
    public boolean areFriends(FacebookUser sourceVertex, FacebookUser targetVertex){
        return (containsEdge(sourceVertex, targetVertex)||containsEdge(targetVertex,sourceVertex));
    }

    

    @Override
    public void printToFile(String fileName) {
        
    }

    @Override
    public void loadFromFile(String fileName) {
        
    }

    @Override
    public EdgeFactory getEdgeFactory() {
        return facebookRelationFactory;
    }
    
    @Override
    public VertexFactory getVertexFactory() {
        return facebookUserFactory;
    }
    
    /*************************************
     * question 04: 
     * method: getFriendsMap 
     **************************************/
    
    public Map <Integer, Friends> getFriendsMap(){
        Map<Integer, Friends> map = new TreeMap<Integer, Friends>();
        
        for (FacebookUser facebook_user:users){
            Integer ID = facebook_user.getID();
            Friends friends = new Friends();
            for (FriendshipRelation relation: relations){
                if (relation.getSource().getID() == ID)
                    friends.add(relation.getTarget().getID());
                
                if (relation.getTarget().getID() == ID)
                    friends.add(relation.getSource().getID());
            }
            
            map.put(ID, friends);
        }
        return map;
    }
    
    
    
    
    
    /***********************************/
    
        
    
    /*************************************
     * question 06: 
     * method: loadGraph 
     **************************************/
    
    
    
    
    /***********************************/
    
    
    public String toString(){
        String s="";
        s=s+this.users.size()+"\n";
        for (FacebookUser u : users){
            s=s+u.toString()+"\n";
        }
        
        Set <Integer> idSet = getFriendMap().keySet();
        for (Integer id : idSet){
            s= s + id+":"+getFriendMap().get(id)+"\n";
        }
        return s;        
    }

    
}
