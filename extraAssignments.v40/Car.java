public class Car{
    String model;
    float value;
    int kmRun;

    public Car(String m, float v, int k){
	model = m;
	value = v;
	kmRun = k;
    }

    public float depreciationRate(){
	value = value * 0.8f;
	return value;
    }

    public String toString(){
	return model;
    }
}
