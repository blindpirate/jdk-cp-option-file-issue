import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;

public class Main implements GroovyObject {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    @Override
    public Object invokeMethod(String s, Object o) {
        return null;
    }

    @Override
    public Object getProperty(String s) {
        return null;
    }

    @Override
    public void setProperty(String s, Object o) {
    }

    @Override
    public MetaClass getMetaClass() {
        return null;
    }

    @Override
    public void setMetaClass(MetaClass metaClass) {
    }
}
