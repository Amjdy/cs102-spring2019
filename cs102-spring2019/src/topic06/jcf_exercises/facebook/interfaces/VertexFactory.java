package topic06.jcf_exercises.facebook.interfaces;


public interface VertexFactory <V extends IVertex>
{
    V create();
    V create(int id, String data);
}
