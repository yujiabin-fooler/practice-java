
code reference
设计模式之原型模式
https://blog.csdn.net/chenliguan/article/details/69855738


定义：用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。

类型：创建类模式

类图：
![img.png](img.png)


原型模式主要用于对象的复制，它的核心是就是类图中的原型类Prototype。Prototype类需要具备以下两个条件：

实现Cloneable接口。在java语言有一个Cloneable接口，它的作用只有一个，就是在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在运行时会抛出CloneNotSupportedException异常。
重写Object类中的clone方法。Java中，所有类的父类都是Object类，Object类中有一个clone方法，作用是返回对象的一个拷贝，但是其作用域protected类型的，一般的类无法调用，因此，Prototype类需要将clone方法的作用域修改为public类型。
原型模式是一种比较简单的模式，也非常容易理解，实现一个接口，重写一个方法即完成了原型模式。在实际应用中，原型模式很少单独出现。经常与其他模式混用，他的原型类Prototype也常用抽象类来替代。

4.1 优点
（1）原型模式是在内存中二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一个循环体内产生大量对象时，原型模式可能更好的体现其优点。
（2）还有一个重要的用途就是保护性拷贝，也就是对某个对象对外可能是只读的，为了防止外部对这个只读对象的修改，通常可以通过返回一个对象拷贝的形式实现只读的限制。

4.2 缺点
（1）这既是它的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的，在实际开发中应该注意这个潜在问题。优点是减少了约束，缺点也是减少了约束，需要大家在实际应用时考虑。
（2）通过实现Cloneable接口的原型模式在调用clone函数构造实例时并不一定比通过new操作速度快，只有当通过new构造对象较为耗时或者说成本较高时，通过clone方法才能够获得效率上的提升。
————————————————

                            版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。

原文链接：https://blog.csdn.net/chenliguan/article/details/69855738


实现代码：

class Prototype implements Cloneable {  
public Prototype clone(){  
Prototype prototype = null;  
try{  
prototype = (Prototype)super.clone();  
}catch(CloneNotSupportedException e){  
e.printStackTrace();  
}  
return prototype;   
}  
}

class ConcretePrototype extends Prototype{  
public void show(){  
System.out.println("原型模式实现类");  
}  
}

public class Client {  
public static void main(String[] args){  
ConcretePrototype cp = new ConcretePrototype();  
for(int i=0; i< 10; i++){  
ConcretePrototype clonecp = (ConcretePrototype)cp.clone();  
clonecp.show();  
}  
}  
}  
使用原型模式创建对象比直接new一个对象在性能上要好的多，因为Object类的clone方法是一个本地方法，它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。

       使用原型模式的另一个好处是简化对象的创建，使得创建对象就像我们在编辑文档时的复制粘贴一样简单。

       因为以上优点，所以在需要重复地创建相似对象时可以考虑使用原型模式。比如需要在一个循环体内创建对象，假如对象创建过程比较复杂或者循环次数很多的话，使用原型模式不但可以简化创建过程，而且可以使系统的整体性能提高很多。

原型模式的注意事项

使用原型模式复制对象不会调用类的构造方法。因为对象的复制是通过调用Object类的clone方法来完成的，它直接在内存中复制数据，因此不会调用到类的构造方法。不但构造方法中的代码不会执行，甚至连访问权限都对原型模式无效。单例模式中，只要将构造方法的访问权限设置为private型，就可以实现单例。但是clone方法直接无视构造方法的权限，所以，单例模式与原型模式是冲突的，在使用时要特别注意。
深拷贝与浅拷贝。Object类的clone方法只会拷贝对象中的基本的数据类型（8种基本数据类型byte,char,short,int,long,float,double，boolean），对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。例如：
public class Prototype implements Cloneable {  
private ArrayList list = new ArrayList();  
public Prototype clone(){  
Prototype prototype = null;  
try{  
prototype = (Prototype)super.clone();  
prototype.list = (ArrayList) this.list.clone();  
}catch(CloneNotSupportedException e){  
e.printStackTrace();  
}  
return prototype;   
}  
}  
由于ArrayList不是基本类型，所以成员变量list，不会被拷贝，需要我们自己实现深拷贝，幸运的是java提供的大部分的容器类都实现了Cloneable接口。所以实现深拷贝并不是特别困难。
————————————————

                            欢迎关注我的公众号“贞会说”

原文链接：https://blog.csdn.net/jason0539/article/details/23158081