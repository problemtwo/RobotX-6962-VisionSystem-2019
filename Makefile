all:
	javac -classpath libs/opencv-343.jar src/*.java

clean:
	rm -f *.class
