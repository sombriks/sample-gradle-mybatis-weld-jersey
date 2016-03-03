package foo.bar;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import foo.bar.resource.FooBarResource;

@ApplicationPath("/rs")
public class FoobarApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(FooBarResource.class);
		return s;
	}
}
