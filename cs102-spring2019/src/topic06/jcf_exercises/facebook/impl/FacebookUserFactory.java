package topic06.jcf_exercises.facebook.impl;

import topic06.jcf_exercises.facebook.interfaces.IVertex;
import topic06.jcf_exercises.facebook.interfaces.VertexFactory;

public class FacebookUserFactory implements VertexFactory{

    @Override
    public IVertex create() {
        return new FacebookUser();
    }
    
    @Override
    public IVertex create(int id, String data) {
        return new FacebookUser(id, data);
    }
    
}
