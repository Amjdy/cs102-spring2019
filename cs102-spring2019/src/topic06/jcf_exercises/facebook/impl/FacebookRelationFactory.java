package topic06.jcf_exercises.facebook.impl;

import topic06.jcf_exercises.facebook.interfaces.EdgeFactory;


/** question 01 **/
public class FacebookRelationFactory  implements EdgeFactory<FriendshipRelation, FacebookUser>{

    @Override
    public FriendshipRelation create(FacebookUser source, FacebookUser target) {
        return new FriendshipRelation(source, target);
    }
    
    public FriendshipRelation create(FacebookUser source, FacebookUser target, Date date) {
        return new FriendshipRelation(source, target, date);
    }
    
}