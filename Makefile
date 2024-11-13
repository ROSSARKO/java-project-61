run-dist:
	cd app && ./build/install/app/bin/app

build:
	cd app && ./gradlew build && ./gradlew installDist

clean:
	cd app && ./gradlew clean