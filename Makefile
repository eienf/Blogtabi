TARGET = blogtabi.jar
MANIFEST = blogtabi.mf
CLASSES = Player.class Dice.class Director.class IBlog.class Blog.class Reader.class
JAR = jar
JAVAC = javac
JAVA = java

all : $(TARGET)

$(TARGET) : $(CLASSES) $(MANIFEST)
	$(JAR) cfm $(TARGET) $(MANIFEST) $(CLASSES)

clean :
	rm $(TARGET) $(CLASSES)

run : $(TARGET)
	$(JAVA) -jar $(TARGET)

.SUFFIXES : .java .class
.java.class :
	$(JAVAC) $<

